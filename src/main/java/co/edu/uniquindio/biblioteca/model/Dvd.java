package co.edu.uniquindio.biblioteca.model;

import java.time.LocalDate;

public class Dvd extends Item{
    private LocalDate fechaLanzamiento;

    public Dvd(String titulo, String ISBN, boolean estado, LocalDate fechaLanzamiento) {
        super(titulo, ISBN, estado);
        this.fechaLanzamiento = fechaLanzamiento;
    }

    public LocalDate getFechaLanzamiento() {
        return fechaLanzamiento;
    }

    public void setFechaLanzamiento(LocalDate fechaLanzamiento) {
        this.fechaLanzamiento = fechaLanzamiento;
    }
}
