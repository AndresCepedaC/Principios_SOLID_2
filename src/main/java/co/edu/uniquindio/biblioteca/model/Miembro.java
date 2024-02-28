package co.edu.uniquindio.biblioteca.model;

import java.util.ArrayList;
import java.util.List;

public class Miembro {
    private String nombre;
    private String ID;
    private List<Prestamo> listaPrestamos = new ArrayList<>();
    private List<Multa> listaMultas = new ArrayList<>();
    public Miembro(String nombre, String ID) {
        this.nombre = nombre;
        this.ID = ID;
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

    public List<Multa> getListaMultas() {
        return listaMultas;
    }

    public void setListaMultas(List<Multa> listaMultas) {
        this.listaMultas = listaMultas;
    }

    @Override
    public String toString() {
        return "Miembro{" +
                "nombre='" + nombre + '\'' +
                ", ID='" + ID + '\'' +
                ", listaPrestamos=" + listaPrestamos +
                '}';
    }
}