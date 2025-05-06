package logica;
// RICARDO FABIAN ESPINOSA LARGO
import db.DBvehiculo;
import modelo.Propietario;
import modelo.Vehiculo;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LogicaVehiculo {
    DBvehiculo objBDvehic = new DBvehiculo();
    
    public boolean verifyPlaca(String numero) throws ClassNotFoundException, SQLException {
        ResultSet rs = objBDvehic.BuscarVehiculoPorPlaca(numero);
        if (rs.next()) {
            return true;

        }
        rs.close();
        return false;
    }
    
    public void insertarVehiculo( Propietario objProp)
            throws ClassNotFoundException, SQLException {
        objBDvehic.InsertarVehiculo(objProp);
    }
    
    public void CambiarVehiculosAnteriores(Propietario objProp) throws ClassNotFoundException, SQLException {
        objBDvehic.CambiarVehiculosAnteriores(objProp);
    }
    
    public Vehiculo BuscarPorNumero(Vehiculo objVehiculo) throws ClassNotFoundException, SQLException {
        ResultSet rs = objBDvehic.BuscarVehiculoPorPlaca(objVehiculo);
        if (rs.next()) {
            objVehiculo.setIdVehiculo(rs.getInt("idVehi"));
            objVehiculo.setMarca(rs.getString("marca"));
            objVehiculo.setPlaca(rs.getString("placa"));
            objVehiculo.setEstado(rs.getInt("estado"));
            Propietario objPropietario = new Propietario();
            objPropietario.setIdProp(rs.getInt("idProp"));
            objVehiculo.setObjPropietario(objPropietario);
        }
        rs.close();
        return objVehiculo;
    }
}
