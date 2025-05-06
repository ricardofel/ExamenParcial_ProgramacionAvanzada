package logica;
// RICARDO FABIAN ESPINOSA LARGO
import db.DBpropietario;
import modelo.Propietario;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LogicaPropietario {
    DBpropietario objBDprop = new DBpropietario();
    
    public void insertarPropietario( Propietario objProp)
            throws ClassNotFoundException, SQLException {
        objBDprop.InsertarPropietario(objProp);
    }
    
    public Propietario BuscarUltimo(Propietario objProp) throws ClassNotFoundException, SQLException {
        ResultSet rs = objBDprop.BuscarIDmaxPropietario();
        while (rs.next()) {
            objProp.setIdProp(rs.getInt(1));
        }
        rs.close();
        return objProp;
    }
    
    public Propietario BuscarPorCedula(Propietario objProp) throws ClassNotFoundException, SQLException {
        ResultSet rs = objBDprop.BuscarPropietarioPorCedula(objProp);
        if (rs.next()) {
            objProp.setIdProp(rs.getInt("idProp"));
            objProp.setNombre(rs.getString("nombre"));
            objProp.setApellido(rs.getString("apellido"));
        }
        rs.close();
        return objProp;
    }
}