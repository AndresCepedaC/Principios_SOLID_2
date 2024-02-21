package co.edu.uniquindio.biblioteca;

public class Revista extends Item{
    private String volumen;

    public Revista(String titulo, String ISBN, String volumen) {
        super(titulo, ISBN);
        this.volumen = volumen;
    }

    public Revista(String titulo, String ISBN) {
        super(titulo, ISBN);
    }

    public String getVolumen() {
        return volumen;
    }

    public void setVolumen(String volumen) {
        this.volumen = volumen;
    }
}
