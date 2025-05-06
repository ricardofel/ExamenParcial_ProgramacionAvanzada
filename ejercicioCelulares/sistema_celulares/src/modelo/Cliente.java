package modelo;
// RICARDO FABIAN ESPINOSA LARGO
import java.util.ArrayList;

public class Cliente {
    public int idClie;
    public String cedula;
    public String nombres;
    public String apellidos;
    public ArrayList<Celular>  celulares; // UN CLIENTE PUEDE TENER VARIOS CELULARES

    public Cliente() {
    }

    public Cliente(int idClie, String cedula, String nombres, String apellidos, ArrayList<Celular> celulares) {
        this.idClie = idClie;
        this.cedula = cedula;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.celulares = celulares;
    }

    public void setIdClie(int idClie) {
        this.idClie = idClie;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setCelulares(ArrayList<Celular> celulares) {
        this.celulares = celulares;
    }

    public int getIdClie() {
        return idClie;
    }

    public String getCedula() {
        return cedula;
    }

    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public ArrayList<Celular> getCelulares() {
        return celulares;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cliente{");
        sb.append("idClie=").append(idClie);
        sb.append(", cedula=").append(cedula);
        sb.append(", nombres=").append(nombres);
        sb.append(", apellidos=").append(apellidos);
        sb.append(", celulares=").append(celulares);
        sb.append('}');
        return sb.toString();
    }
}