package db;
// RICARDO FABIAN ESPINOSA LARGO
import modelo.Cliente;

import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DBcliente {
    Conexion BLcon = new Conexion();
    
    // Metodo para insertar datos en la tabla Cliente
    public int InsertarCliente(Cliente objCliente) throws ClassNotFoundException, SQLException {
        String Sentencia = "INSERT INTO cliente (Cedula, nombres, apellidos)"
                + " VALUES (?,?,?)";
        PreparedStatement ps = BLcon.getConnection().prepareStatement(Sentencia);
        ps.setString(1, objCliente.getCedula());
        ps.setString(2, objCliente.getNombres());
        ps.setString(3, objCliente.getApellidos());
        return ps.executeUpdate();
    }
    
    // Metodo para traer el maximo id de la tabla Cliente
    public ResultSet BuscarMaximoIdCliente(Cliente objCliente) throws ClassNotFoundException, SQLException {
        String Sentencia = "SELECT MAX(idClie) FROM cliente";
        PreparedStatement ps = BLcon.getConnection().prepareStatement(Sentencia);
        ResultSet rs = ps.executeQuery();
        return rs;
    }
    
    // Metodo para traer un cliente desde la DB consultando por cedula
    public ResultSet BuscarClienteCedula(Cliente objCliente) throws ClassNotFoundException, SQLException {
        String Sentencia = "SELECT idClie FROM Cliente WHERE cedula = ?";
        PreparedStatement ps = BLcon.getConnection().prepareStatement(Sentencia);
        ps.setString(1, objCliente.getCedula());
        return ps.executeQuery();
    }
}