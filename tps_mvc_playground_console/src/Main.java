import model.dao.ContatoDAO;
import model.ContatoDTO;
import model.factory.ConnectionFactory;
import model.repository.ContatoEmMemoriaRepositoryImpl;
import model.repository.ContatoMySqlRepositoryImpl;
import model.repository.iContatoRepository;
import model.services.ContatoServices;

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
        config("");

        ContatoDTO contato = new ContatoDTO(null,"7845454321", "Parlo", "parlo@gmail.com");


        var service = new ContatoServices(repository);

        service.salvar(contato);


//
//        model.dao.salvar(contato);
    }
}
