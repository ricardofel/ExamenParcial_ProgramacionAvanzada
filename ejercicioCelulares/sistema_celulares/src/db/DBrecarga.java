package db;
// RICARDO FABIAN ESPINOSA LARGO
import modelo.Celular;
import modelo.Recarga;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBrecarga {
    Conexion BLcon = new Conexion();
    
    // Metodo para insertar un datos en la tabla Recarga
    public int insertReca(Celular celular) throws ClassNotFoundException, SQLException {
        String Sentencia = "INSERT INTO Recarga (valor, saldo, megas, idCel)"
                + " VALUES (?,?,?,?)";

        int posicion = celular.getRecargas().size() - 1;

        PreparedStatement x = BLcon.getConnection().prepareStatement(Sentencia);
        
        x.setInt(1, celular.getRecargas().get(posicion).getValor());
        x.setInt(2, celular.getRecargas().get(posicion).getSaldo());
        x.setInt(3, celular.getRecargas().get(posicion).getMegas());
        x.setInt(4, celular.getIdCel());

        return x.executeUpdate();
    }
}