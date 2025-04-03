import model.dao.ContatoDAO;
import model.ContatoDTO;
import model.factory.ConnectionFactory;
import model.repository.ContatoEmMemoriaRepositoryImpl;
import model.repository.ContatoMySqlRepositoryImpl;
import model.repository.iContatoRepository;
import model.services.ContatoServices;
import view.Menu;

import java.sql.Connection;
import java.sql.SQLException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static iContatoRepository repository;


    private static void config(String param) throws SQLException{
        if (param == "-mysql") {
            Connection connection = ConnectionFactory.getConnection();
            ContatoDAO dao = new ContatoDAO(connection);
            repository = new ContatoMySqlRepositoryImpl(dao);
        }else{
            repository = new ContatoEmMemoriaRepositoryImpl();
        }
    }
    public static void main(String[] args) throws Exception{
//        config("");
//
//        ContatoDTO contato = new ContatoDTO(null,"7845454321", "Parlo", "parlo@gmail.com");
//
//
//        var service = new ContatoServices(repository);
//
//        service.salvar(contato);

        var m = new Menu();

        m.escrever();
        //TODO: Criar menu para seleção de funções:
        /*
         *   1. Criar
         *   2. Listar
         *   3. Buscar
         *   4. Atualizar
         *   5. Excluir
         *   6. Sair
         */

        // TODO: Mover menu para classe View

        /*
         * A classe View deverá conter a dependencia da classe ContatoController
         *
         * Deverá também conter o menu de opções
         *
         * Cada opção do menu deverá realizar uma função do controller
         *
         * NÃO precisa implementar a lógica de negócio do controller
         *
         */

//
//        model.dao.salvar(contato);
    }
}
