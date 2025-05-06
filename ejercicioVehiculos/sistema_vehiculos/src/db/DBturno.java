package db;
// RICARDO FABIAN ESPINOSA LARGO
import modelo.Turno;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBturno {
    Conexion conexion = new Conexion();
    // Metodo para insertar datos a la tabla turno
    public int InsertarTurno(Turno objTurno) throws ClassNotFoundException, SQLException {
        String Sentencia = "INSERT INTO Turno (anden, dia, hora, idVehiculo)"
                + " VALUES (?,?,?,?)"; 
        PreparedStatement x = conexion.getConnection().prepareStatement(Sentencia); 
        x.setInt(1, objTurno.getAnden());
        x.setInt(2, objTurno.getDia());
        x.setInt(3, objTurno.getHora());
        x.setInt(4, objTurno.getObjVehiculo().getIdVehiculo());       
        return x.executeUpdate();
    }
    
    // Metodo para traer el id del turno 
    public ResultSet BuscarTurno(Turno objTurno) throws ClassNotFoundException, SQLException {
        String Sentencia = "SELECT idTurno FROM Turno WHERE dia = ? AND idVehiculo = ?";
        PreparedStatement ps = conexion.getConnection().prepareStatement(Sentencia);
        ps.setInt(1, objTurno.getDia());
        ps.setInt(2, objTurno.getObjVehiculo().getIdVehiculo());
        return ps.executeQuery();
    }
    
    // Metodo para buscar anden del turno
    public ResultSet BuscarAnden(Turno objTurno) throws ClassNotFoundException, SQLException {
        String Sentencia = "SELECT idTurno FROM Turno WHERE anden = ? AND idVehiculo = ?";
        PreparedStatement ps = conexion.getConnection().prepareStatement(Sentencia);
        ps.setInt(1, objTurno.getAnden());
        ps.setInt(2, objTurno.getObjVehiculo().getIdVehiculo());
        return ps.executeQuery();
    }  
}