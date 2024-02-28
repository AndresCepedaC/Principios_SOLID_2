package co.edu.uniquindio.biblioteca.model;

public class Libro extends Item {
    private String autor;
    public Libro(String titulo, String ISBN, boolean estado, String autor) {
        super(titulo, ISBN, estado);
        this.autor = autor;
    }
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "autor='" + autor + '\'' +
                '}';
    }
}
