package modelo;
// RICARDO FABIAN ESPINOSA LARGO
public class Turno {
    public int idTurno;
    public int anden;
    public int dia;
    public int hora;
    public Vehiculo vehiculo;

    public Turno() {
    }

    public Turno(int idTurno, int anden, int dia, int hora, Vehiculo objVehiculo) {
        this.idTurno = idTurno;
        this.anden = anden;
        this.dia = dia;
        this.hora = hora;
        this.vehiculo = objVehiculo;
    }

    public void setIdTurno(int idTurno) {
        this.idTurno = idTurno;
    }

    public void setAnden(int anden) {
        this.anden = anden;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public void setObjVehiculo(Vehiculo objVehiculo) {
        this.vehiculo = objVehiculo;
    }

    public int getIdTurno() {
        return idTurno;
    }

    public int getAnden() {
        return anden;
    }

    public int getDia() {
        return dia;
    }

    public int getHora() {
        return hora;
    }

    public Vehiculo getObjVehiculo() {
        return vehiculo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Turno{");
        sb.append("idTurno=").append(idTurno);
        sb.append(", anden=").append(anden);
        sb.append(", dia=").append(dia);
        sb.append(", hora=").append(hora);
        sb.append(", objVehiculo=").append(vehiculo);
        sb.append('}');
        return sb.toString();
    }
}