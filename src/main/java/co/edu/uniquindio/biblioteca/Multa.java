package co.edu.uniquindio.biblioteca;

public class Multa {
    private String idMulta;
    private double valorMulta;
    private Miembro miembro;
    public Multa() {
    }

    public Miembro getMiembro() {
        return miembro;
    }

    public double getValorMulta() {
        return valorMulta;
    }

    public void setValorMulta(double valorMulta) {
        this.valorMulta = valorMulta;
    }

    public void setMiembro(Miembro miembro) {
        this.miembro = miembro;
    }
    public String getIdMulta() {
        return idMulta;
    }

    public void setIdMulta(String idMulta) {
        this.idMulta = idMulta;
    }

    @Override
    public String toString() {
        return "Multa{" +
                "idMulta='" + idMulta + '\'' +
                ", valorMulta=" + valorMulta +
                ", miembro=" + miembro +
                '}';
    }
}
