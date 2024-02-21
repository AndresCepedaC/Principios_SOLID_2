package co.edu.uniquindio.biblioteca.model;

public class Libro {
    private String autor;
    private Prestamo prestamo;

    public Libro(String autor, Prestamo prestamo) {
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
}
