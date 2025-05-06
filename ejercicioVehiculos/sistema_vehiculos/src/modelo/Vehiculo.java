package modelo;
// RICARDO FABIAN ESPINOSA LARGO
import java.util.ArrayList;

public class Vehiculo {
    public int idVehiculo;
    public String placa;
    public String marca;
    public int estado;
    public Propietario propietario;
    public ArrayList<Turno> turnos;

    public Vehiculo() {
    }

    public Vehiculo(int idVehiculo, String placa, String marca, int estado, ArrayList<Turno> listaTurnos, Propietario objPropietario) {
        this.idVehiculo = idVehiculo;
        this.placa = placa;
        this.marca = marca;
        this.estado = estado;
        this.turnos = listaTurnos;
        this.propietario = objPropietario;
    }

    public int getIdVehiculo() {
        return idVehiculo;
    }

    public String getPlaca() {
        return placa;
    }

    public String getMarca() {
        return marca;
    }

    public int getEstado() {
        return estado;
    }

    public ArrayList<Turno> getListaTurnos() {
        return turnos;
    }

    public Propietario getObjPropietario() {
        return propietario;
    }

    public void setIdVehiculo(int idVehiculo) {
        this.idVehiculo = idVehiculo;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public void setListaTurnos(ArrayList<Turno> listaTurnos) {
        this.turnos = listaTurnos;
    }

    public void setObjPropietario(Propietario objPropietario) {
        this.propietario = objPropietario;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Vehiculo{");
        sb.append("idVehiculo=").append(idVehiculo);
        sb.append(", placa=").append(placa);
        sb.append(", marca=").append(marca);
        sb.append(", estado=").append(estado);
        sb.append(", listaTurnos=").append(turnos);
        sb.append(", objPropietario=").append(propietario);
        sb.append('}');
        return sb.toString();
    }
}