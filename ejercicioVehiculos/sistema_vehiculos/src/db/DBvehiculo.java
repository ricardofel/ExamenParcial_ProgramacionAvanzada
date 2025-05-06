package db;
// RICARDO FABIAN ESPINOSA LARGO
import modelo.Propietario;
import modelo.Vehiculo;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBvehiculo {
    Conexion conexion = new Conexion();
    // Metodo para buscar vehiculo por placa
    public ResultSet BuscarVehiculoPorPlaca(String placa) throws ClassNotFoundException, SQLException {
        String Sentencia = "SELECT idVehiculo FROM Vehiculo WHERE placa = ?";
        PreparedStatement ps = conexion.getConnection().prepareStatement(Sentencia);
        ps.setString(1, placa);
        return ps.executeQuery();
    }
    
    // Metodo para insertar datos a la tabla vehiculo
    public int InsertarVehiculo(Propietario objProp) throws ClassNotFoundException, SQLException {
        String Sentencia = "INSERT INTO Vehiculo (placa, marca, estado, idPropietario)"
                + " VALUES (?,?,?,?)";
        int posicion = objProp.getListaVehiculos().size() - 1;
        PreparedStatement x = conexion.getConnection().prepareStatement(Sentencia);
        x.setString(1, objProp.getListaVehiculos().get(posicion).getPlaca());
        x.setString(2, objProp.getListaVehiculos().get(posicion).getMarca());
        x.setInt(3, objProp.getListaVehiculos().get(posicion).getEstado());
        x.setInt(4, objProp.getIdProp());
        return x.executeUpdate();
    }
    
    // Metodo para cambiar el estado de los vehiculos
    public void CambiarVehiculosAnteriores(Propietario objProp) throws ClassNotFoundException, SQLException {
        String sql = "UPDATE Vehiculo SET estado = 0 WHERE idPropietario = ?";
        PreparedStatement ps = conexion.getConnection().prepareStatement(sql);
        ps.setInt(1, objProp.getIdProp());
        ps.executeUpdate();
    }
    
    // Metodo para buscar vehiculo por placa
    public ResultSet BuscarVehiculoPorPlaca(Vehiculo objVehiculo) throws ClassNotFoundException, SQLException {
        String Sentencia = "SELECT idVehiculo, marca, placa, estado, idPropietario FROM Vehiculo WHERE placa = ?";
        PreparedStatement ps = conexion.getConnection().prepareStatement(Sentencia);
        ps.setString(1, objVehiculo.getPlaca());
        return ps.executeQuery();
    }
}