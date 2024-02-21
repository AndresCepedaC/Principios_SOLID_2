package co.edu.uniquindio.biblioteca.model;

import java.util.List;

public class Miembro {
    private String nombre;
    private String ID;
    private List<Prestamo> listaPrestamos;


    public Miembro() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }


}