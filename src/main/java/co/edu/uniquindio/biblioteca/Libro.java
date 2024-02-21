package co.edu.uniquindio.biblioteca;

import co.edu.uniquindio.biblioteca.Prestamo;

public class Libro extends Item {
    private String autor;
    private Prestamo prestamo;

    public Libro(String titulo, String ISBN, String autor, Prestamo prestamo) {
        super(titulo, ISBN);
        this.autor = autor;
        this.prestamo = prestamo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    public Prestamo getPrestamo() {
        return prestamo;
    }
    public void setPrestamo(Prestamo prestamo) {
        this.prestamo = prestamo;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "autor='" + autor + '\'' +
                ", prestamo=" + prestamo +
                '}';
    }
}
