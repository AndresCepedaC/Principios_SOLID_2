package co.edu.uniquindio.biblioteca;

import java.util.Date;

public class Dvd extends Item{
    private Date fechaLanzamiento;
    public Dvd(String titulo, String ISBN) {
        super(titulo, ISBN);
    }
}
