package co.edu.uniquindio.biblioteca;

import co.edu.uniquindio.biblioteca.Prestamo;

public class Libro extends Item {
    private String autor;
    public Libro(String titulo, String ISBN, boolean estado, Prestamo prestamo, String autor) {
        super(titulo, ISBN, estado, prestamo);
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
