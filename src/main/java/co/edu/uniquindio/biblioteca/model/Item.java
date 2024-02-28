package co.edu.uniquindio.biblioteca.model;

public abstract class Item {
    private String titulo;
    private String ISBN;
    private boolean estado;
    private Prestamo prestamo;

    public Item(String titulo, String ISBN, boolean estado) {
        this.titulo = titulo;
        this.ISBN = ISBN;
        this.estado = estado;

    }

    public Prestamo getPrestamo() {
        return prestamo;
    }

    public void setPrestamo(Prestamo prestamo) {
        this.prestamo = prestamo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
}
