package Locadora;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 * 
 * @author Joao Antonio
 * @version 1.01
 * @since 13dez2016
 * 
 */
public class ConnectionFactory {
    public Connection getConnection() {
        try {
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/joaoa870_impacto1","root","");
        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}