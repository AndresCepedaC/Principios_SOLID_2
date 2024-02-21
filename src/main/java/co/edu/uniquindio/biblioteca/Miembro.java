package co.edu.uniquindio.biblioteca;

import java.util.List;

public class Miembro {
    private String nombre;
    private String ID;
    private List<Prestamo> listaPrestamos;

    public Miembro(String nombre, String ID, List<Prestamo> listaPrestamos) {
        this.nombre = nombre;
        this.ID = ID;
        this.listaPrestamos = listaPrestamos;
    }

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

    public List<Prestamo> getListaPrestamos() {
        return listaPrestamos;
    }

    public void setListaPrestamos(List<Prestamo> listaPrestamos) {
        this.listaPrestamos = listaPrestamos;
    }
}