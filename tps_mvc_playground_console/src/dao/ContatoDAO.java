package dao;

import model.factory.ConnectionFactory;
import model.repository.ContatoVO;

import java.sql.Connection;
import java.sql.Statement;

public class ContatoDAO {

    public void salvar(ContatoVO contato){
        try{
            Connection conn = ConnectionFactory.getConnection();
            String query = """
                    INSERT INT contatos(nome, email, telefone) VALUES
                    ('%s', '%s', '%s')
                    """;
            Statement stmt = conn.createStatement();

            stmt.execute(String.format(query,
                    contato.getNome(),
                    contato.getEmail(),
                    contato.getTelefone()));
        }
        catch (Exception e){
            throw new RuntimeException(e);
        }

    }

}
