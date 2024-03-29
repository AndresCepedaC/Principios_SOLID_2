package co.edu.uniquindio.biblioteca.model;

public class Revista extends Item{
    private String volumen;

    public Revista(String titulo, String ISBN, boolean estado, String volumen) {
        super(titulo, ISBN, estado);
        this.volumen = volumen;
    }

    public String getVolumen() {
        return volumen;
    }

    public void setVolumen(String volumen) {
        this.volumen = volumen;
    }

    @Override
    public String toString() {
        return "Revista{" +
                "volumen='" + volumen + '\'' +
                '}';
    }
}
