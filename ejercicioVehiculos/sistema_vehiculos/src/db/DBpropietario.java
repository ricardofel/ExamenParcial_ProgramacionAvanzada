package db;
// RICARDO FABIAN ESPINOSA LARGO
import modelo.Propietario;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBpropietario {
    Conexion conexion = new Conexion();
    // Metodo para insertar datos a la tabla propietario
    public int InsertarPropietario(Propietario objPropietario) throws ClassNotFoundException, SQLException {
        String Sentencia = "INSERT INTO Propietario (apellido, nombre, cedula)"
                + " VALUES (?,?,?)";
        PreparedStatement ps = conexion.getConnection().prepareStatement(Sentencia);
        ps.setString(1, objPropietario.getCedula());
        ps.setString(2, objPropietario.getNombre());
        ps.setString(3, objPropietario.getApellido());
        return ps.executeUpdate();
    }
    
    // Metodo para traer el ultimo propietario insertado
    public ResultSet BuscarIDmaxPropietario() throws ClassNotFoundException, SQLException {
        String Sentencia = "SELECT MAX(idPropieatario) FROM Propietario";
        PreparedStatement ps = conexion.getConnection().prepareStatement(Sentencia);
        ResultSet rs = ps.executeQuery();
        return rs;
    }
    
    // Metodo para buscar un propietario por la cedula
    public ResultSet BuscarPropietarioPorCedula(Propietario objPropietario) throws ClassNotFoundException, SQLException {
        String Sentencia = "SELECT idPropietario, apellido, nombre FROM Propietario WHERE cedula = ?";
        PreparedStatement ps = conexion.getConnection().prepareStatement(Sentencia);
        ps.setString(1, objPropietario.getCedula());
        return ps.executeQuery();
    } 
}