package logica;
// RICARDO FABIAN ESPINOSA LARGO
import modelo.Cliente;
import db.DBcliente;

import java.sql.ResultSet;
import java.sql.SQLException;

public class LogicaCliente {
    DBcliente objBDCliente = new DBcliente();
    
    // Metodo para insertar un cliente
    public void InsertarCliente(Cliente objCliente)
            throws ClassNotFoundException, SQLException {
        objBDCliente.InsertarCliente(objCliente);
    }
    
    // Metodo para buscar el maximo id en la tabla cliente
    public Cliente BuscarMaximo(Cliente objCliente) throws ClassNotFoundException, SQLException {
        ResultSet rs = objBDCliente.BuscarMaximoIdCliente(objCliente);
        while (rs.next()) {
            objCliente.setIdClie(rs.getInt(1));
        }
        rs.close();
        return objCliente;
    }
    
    // Metodo para traer el id en caso de que exista el cliente
    public Cliente TraerID(Cliente objCliente) throws ClassNotFoundException, SQLException {
        ResultSet rs = objBDCliente.BuscarClienteCedula(objCliente);
        
        while (rs.next()) {
            objCliente.setIdClie(rs.getInt(1));
        }
        rs.close();
        return objCliente;
    }
    
    // Metodo para validar si existe un cliente
    public Boolean ValidarCliente(Cliente objCliente) throws ClassNotFoundException, SQLException {
        ResultSet rs = objBDCliente.BuscarClienteCedula(objCliente);
        Boolean existeCliente = rs.next(); // true si encontro por lo menos una fila
        rs.close();
        return existeCliente;
    }
    
}