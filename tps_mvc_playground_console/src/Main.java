import dao.ContatoDAO;
import model.factory.ConnectionFactory;
import model.repository.ContatoVO;

import java.sql.Connection;
import java.sql.ResultSet;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws Exception{
        Connection connection = ConnectionFactory.getConnection();
        System.out.println(connection);
        ContatoDAO dao = new ContatoDAO(connection);

//        ContatoVO contato = new ContatoVO(null,"195444348646", "Carlos", "Carlos@gmail.com");
//
//        dao.salvar(contato);
        dao.buscarPorEmail("Carlos@gmail.com");
    }
}