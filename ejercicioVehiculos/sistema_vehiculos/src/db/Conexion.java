package db;
// RICARDO FABIAN ESPINOSA LARGO
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    public Connection con;
    public Connection getConnection () throws ClassNotFoundException, SQLException {
        String driver = "com.mysql.cj.jdbc.Driver"; 
        String url = "jdbc:mysql://localhost:3306/sistema_vehiculos";
        Class.forName(driver);
        return DriverManager.getConnection(url,"root","ricardo");
    }
    public Connection AbrirConexion() throws ClassNotFoundException, SQLException{
        con = getConnection();
        return con;
    }
    public void CerrarConexion() throws SQLException{
       con.close();
    }
}