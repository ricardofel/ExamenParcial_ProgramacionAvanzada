package modelo;
// RICARDO FABIAN ESPINOSA LARGO
import java.util.ArrayList;
import modelo.Vehiculo;

public class Propietario {
    public int idPropietario;
    public String cedula;
    public String apellido;
    public String nombre;
    public ArrayList<Vehiculo> vehiculos;

    public Propietario() {
    }

    public Propietario(int idProp, String cedula, String apellido, String nombre, ArrayList<Vehiculo> listaVehiculos) {
        this.idPropietario = idProp;
        this.cedula = cedula;
        this.apellido = apellido;
        this.nombre = nombre;
        this.vehiculos = listaVehiculos;
    }

    public void setIdProp(int idProp) {
        this.idPropietario = idProp;
    }

    public int getIdProp() {
        return idPropietario;
    }

    public String getCedula() {
        return cedula;
    }

    public String getApellido() {
        return apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Vehiculo> getListaVehiculos() {
        return vehiculos;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setListaVehiculos(ArrayList<Vehiculo> listaVehiculos) {
        this.vehiculos = listaVehiculos;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Propietario{");
        sb.append("idProp=").append(idPropietario);
        sb.append(", cedula=").append(cedula);
        sb.append(", apellido=").append(apellido);
        sb.append(", nombre=").append(nombre);
        sb.append(", listaVehiculos=").append(vehiculos);
        sb.append('}');
        return sb.toString();
    }
}