package ecommerce.util;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

    public static Connection conectar() throws SQLException {

        String url = "jdbc:mysql://localhost:3306/ecommerce";
        String usuario = System.getenv("DB_USER");
        String senha = System.getenv("DB_PASSWORD");

        return DriverManager.getConnection(url, usuario, senha);
    }
}