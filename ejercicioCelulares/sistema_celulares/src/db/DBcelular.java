package db;
// RICARDO FABIAN ESPINOSA LARGO
import modelo.Celular;
import modelo.Cliente;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBcelular {
    Conexion BLcon = new Conexion();
    
    // Metodo para insertar un datos en la tabla Celular
    public int insertarCelular(Cliente objCliente) throws ClassNotFoundException, SQLException {
        String Sentencia = "INSERT INTO celular (numero, estado, saldo, megas, idClie)"
                + " VALUES (?,?,?,?,?)";

        PreparedStatement x = BLcon.getConnection().prepareStatement(Sentencia);
        
        int posicion = objCliente.getCelulares().size() - 1;
        
        x.setString(1, objCliente.getCelulares().get(posicion).getNumero());
        x.setInt(2, objCliente.getCelulares().get(posicion).getSaldo());
        x.setInt(3, objCliente.getCelulares().get(posicion).getEstado());
        x.setInt(4, objCliente.getCelulares().get(posicion).getMegas());
        x.setInt(5, objCliente.getIdClie());
        
        return x.executeUpdate();
    }
    
     // Metodo para traer un celular consultado por el numero
    public ResultSet BuscarPorNumero(Celular objcelular) throws ClassNotFoundException, SQLException {
        String Sentencia = "SELECT idCel, estado FROM Celular WHERE numero = ?";
        
        PreparedStatement ps = BLcon.getConnection().prepareStatement(Sentencia);
        
        ps.setString(1, objcelular.getNumero());
        
        return ps.executeQuery();
    }
}
