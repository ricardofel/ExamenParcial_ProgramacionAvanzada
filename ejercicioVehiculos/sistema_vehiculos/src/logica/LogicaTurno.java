package logica;
// RICARDO FABIAN ESPINOSA LARGO
import db.DBturno;
import modelo.Turno;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LogicaTurno {
    DBturno objBDturno = new DBturno();
    
    public boolean verificarTurnoDoble(Turno objTurno) throws ClassNotFoundException, SQLException {
        ResultSet rs = objBDturno.BuscarTurno(objTurno);
        if (rs.next()) {
            return true;
        }
        rs.close();
        return false;
    }
    
    public boolean verificarTurnoDobleAnden(Turno objTurno) throws ClassNotFoundException, SQLException {
        ResultSet rs = objBDturno.BuscarAnden(objTurno);
        if (rs.next()) {
            return true;
        }
        rs.close();
        return false;
    }
    
    public void insertarTurno( Turno objTurno)
            throws ClassNotFoundException, SQLException {
        objBDturno.InsertarTurno(objTurno);
    }
}