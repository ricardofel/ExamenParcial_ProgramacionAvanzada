package logica;
// RICARDO FABIAN ESPINOSA LARGO
import modelo.Cliente;
import modelo.Celular;
import db.DBcelular;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class LogicaCelular {
    DBcelular objDBcelular = new DBcelular();
    
    // Metodo insertar datos a la tabla celular
    public void insertarCelular(Cliente objClie)
            throws ClassNotFoundException, SQLException {
        objDBcelular.insertarCelular(objClie);
    }
    
    // Metodo para validar si existe un celular
    public Boolean ValidarCelular(Celular objcelular) throws ClassNotFoundException, SQLException {
        ResultSet rs = objDBcelular.BuscarPorNumero(objcelular);
        Boolean existeCelular = rs.next(); // true si encontro por lo menos una fila
        rs.close();
        return existeCelular;
    }
    
    // Metodo para validar el estado de un celular
    public Boolean ValidarEstadoCel(Celular objcelular) throws ClassNotFoundException, SQLException {
        if(objcelular.getEstado() == 1)
            return true;
        else
            return false;
    }
    
    // Metodo para buscar un celular por numero
    public Celular BuscarCelularxNumero(Celular celular) throws ClassNotFoundException, SQLException {
        ResultSet rs = objDBcelular.BuscarPorNumero(celular);
        while (rs.next()) {
            celular.setIdCel(rs.getInt(1));
            celular.setEstado(rs.getInt(2));
        }
        rs.close();
        return celular;
    }
}
