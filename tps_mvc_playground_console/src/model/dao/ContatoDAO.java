package model.dao;

import model.ContatoVO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ContatoDAO {

    private final Connection conn;
    private final Logger log;

    public ContatoDAO(Connection connection){
        this.conn = connection;
        this.log = Logger.getLogger(ContatoDAO.class.getName());
    }

    public void salvar(ContatoVO contato){
        try{

            String query = """
                    INSERT INTO contatos(nome, email, telefone) VALUES
                    ('%s', '%s', '%s')
                    """;
            Statement stmt = conn.createStatement();

            stmt.execute(String.format(query,
                    contato.getNome(),
                    contato.getEmail(),
                    contato.getTelefone()));
            log.info("Contato criado com suceso");
            stmt.close();
        }
        catch (Exception e){
            log.log(Level.SEVERE, "Falha ao salvar novo contato", e);
            throw new RuntimeException(e);
        }

    }

    public void atualizar(ContatoVO contatoVO){
        String email = contatoVO.getEmail();
        String sql = "UPDATE SET nome = "+ contatoVO.getNome()+ ", email = "+ email+ ",telefone = "+
                contatoVO.getTelefone() + " WHERE email = " + email;

        try(Statement stm = conn.createStatement()){
            stm.executeQuery(sql);
            log.info("Atualização realizada com sucesso");

        }
        catch(Exception e){
            log.log(Level.SEVERE,"Falha ao realizar update no contato", e);
        }
    }
    public void excluir (Integer id){
        String sql = "DELETE FROM contatos WHERE id " + id;

        try(Statement stm = conn.createStatement()){
            stm.executeQuery(sql);
            log.info("O contato foi apagado");
        }
        catch (Exception e){
            log.log(Level.SEVERE, "Falha ao apagar contato");
        }
    }

    public ContatoVO buscarPorEmail(String email){
        String sql = "select * from contatos WHERE email = '" + email + "'";

        try(Statement stm = conn.createStatement();
            ResultSet rst = stm.executeQuery(sql);) {

            if(!rst.next()){
                System.out.println("Não há esse contato");
                return null;
            }
            ContatoVO contatoVO = new ContatoVO(
                    rst.getInt("id"),
                    rst.getString("nome"),
                    rst.getString("email"),
                    rst.getString("telefone")
            );
            log.info("Consulta realizada com sucesso.");
            return contatoVO;
        }
        catch (Exception e){
            log.log(Level.SEVERE,"Falha ao consultar contatos", e);
        }

        return null;
    }

    public List<ContatoVO> buscarTodos(){
        List<ContatoVO> contatos = new ArrayList<>();
        String sql = "SELECT id, nome, email, telefone from contatos";
        try(Statement stm =  conn.createStatement();
            ResultSet rst = stm.executeQuery(sql);){

            while(rst.next()){
                ContatoVO contatoVo = new ContatoVO(
                        rst.getInt("id"),
                        rst.getString("nome"),
                        rst.getString("email"),
                        rst.getString("telefone")
                );

                contatos.add(contatoVo);
            }

            log.info("Consulta bem sucedida.");
        }
        catch (Exception e){
            log.log(Level.SEVERE,"Falha ao consultar contatos",e);
        }
        return contatos;
    }



}
