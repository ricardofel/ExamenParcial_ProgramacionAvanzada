package logica;
// RICARDO FABIAN ESPINOSA LARGO
import modelo.Recarga;
import modelo.Celular;
import db.DBrecarga;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
public class LogicaRecarga {
    DBrecarga objDBrecarga = new DBrecarga();
    
    // Metodo insertar datos a la tabla recarga
    public void insertarRecar(Celular celular)
            throws ClassNotFoundException, SQLException {
        objDBrecarga.insertReca(celular);
    }
    // Metodo para distribuir valores de saldo y megas #1
    public Recarga distribuirValores1(Recarga recarga){
        int valor = recarga.getValor();
        // VALOR PARA EL SALDO
        int saldo = valor * 2/3;
        // VALOR PARA LAS MEGAS
        int megas = (valor * 1/3)*5;
        recarga.setSaldo(saldo);
        recarga.setMegas(megas);
        return recarga;
    }
    
    // Metodo para distribuir valores de saldo y megas #2
    public Recarga distribuirValores2(Recarga recarga){
        int valor = recarga.getValor();
        // VALOR PARA EL SALDO
        int saldo = valor * 1/3;
        // VALOR PARA LAS MEGAS
        int megas = (valor * 2/3)*5;
        recarga.setSaldo(saldo);
        recarga.setMegas(megas);
        return recarga;
    }
    
    // Metodo para distribuir valores de saldo y megas #2
    public Recarga distribuirValores3(Recarga recarga){
        int valor = recarga.getValor();
        // VALOR PARA EL SALDO
        int saldo = valor * 1/2;
        // VALOR PARA LAS MEGAS
        int megas = (valor * 1/2)*5;
        recarga.setSaldo(saldo);
        recarga.setMegas(megas);
        return recarga;
    }
}