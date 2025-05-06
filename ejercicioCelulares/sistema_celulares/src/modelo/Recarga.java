package modelo;
// RICARDO FABIAN ESPINOSA LARGO
public class Recarga {
    public int idReca;
    public int valor;
    public int saldo;
    public int megas;
    public int idCel;

    public Recarga(int idReca, int valor, int saldo, int megas, int idCel) {
        this.idReca = idReca;
        this.valor = valor;
        this.saldo = saldo;
        this.megas = megas;
        this.idCel = idCel;
    }

    public Recarga() {
    }

    public int getIdReca() {
        return idReca;
    }

    public void setIdReca(int idReca) {
        this.idReca = idReca;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public int getMegas() {
        return megas;
    }

    public void setMegas(int megas) {
        this.megas = megas;
    }

    public int getIdCel() {
        return idCel;
    }

    public void setIdCel(int idCel) {
        this.idCel = idCel;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Recarga{");
        sb.append("idReca=").append(idReca);
        sb.append(", valor=").append(valor);
        sb.append(", saldo=").append(saldo);
        sb.append(", megas=").append(megas);
        sb.append(", idCel=").append(idCel);
        sb.append('}');
        return sb.toString();
    }
    
    
    
}