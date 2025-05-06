package modelo;
// RICARDO FABIAN ESPINOSA LARGO
import java.util.ArrayList;

public class Celular {
    public int idCel;
    public String numero;
    public int estado;
    public int saldo;
    public int megas;
    public ArrayList<Recarga> recargas; // UN CELULAR PUEDE HACER MUCHAS RECARGAS

    public Celular() {
    }

    public Celular(int idCel, String numero, int estado, int saldo, int megas, ArrayList<Recarga> recargas) {
        this.idCel = idCel;
        this.numero = numero;
        this.estado = estado;
        this.saldo = saldo;
        this.megas = megas;
        this.recargas = recargas;
    }

    public void setIdCel(int idCel) {
        this.idCel = idCel;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public void setMegas(int megas) {
        this.megas = megas;
    }

    public void setRecargas(ArrayList<Recarga> recargas) {
        this.recargas = recargas;
    }

    public int getIdCel() {
        return idCel;
    }

    public String getNumero() {
        return numero;
    }

    public int getEstado() {
        return estado;
    }

    public int getSaldo() {
        return saldo;
    }

    public int getMegas() {
        return megas;
    }

    public ArrayList<Recarga> getRecargas() {
        return recargas;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Celular{");
        sb.append("idCel=").append(idCel);
        sb.append(", numero=").append(numero);
        sb.append(", estado=").append(estado);
        sb.append(", saldo=").append(saldo);
        sb.append(", megas=").append(megas);
        sb.append(", recargas=").append(recargas);
        sb.append('}');
        return sb.toString();
    }
}