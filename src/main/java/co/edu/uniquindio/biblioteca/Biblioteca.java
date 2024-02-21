package co.edu.uniquindio.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private String nombre;

    private List<Empleado> listaEmpleados = new ArrayList<>();
    private List<Libro> listaLibros = new ArrayList<>();
    private List<Dvd> listaDvds = new ArrayList<>();
    private List<Revista> listaRevistas = new ArrayList<>();
    private List<Item> listaItems = new ArrayList<>();
    private List<Prestamo> listaPrestamos = new ArrayList<>();
    private List<Multa> listaMultas = new ArrayList<>();

    public Biblioteca() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }

    public void setListaEmpleados(List<Empleado> listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }

    public List<Libro> getListaLibros() {
        return listaLibros;
    }

    public void setListaLibros(List<Libro> listaLibros) {
        this.listaLibros = listaLibros;
    }

    public List<Dvd> getListaDvds() {
        return listaDvds;
    }

    public void setListaDvds(List<Dvd> listaDvds) {
        this.listaDvds = listaDvds;
    }

    public List<Revista> getListaRevistas() {
        return listaRevistas;
    }

    public void setListaRevistas(List<Revista> listaRevistas) {
        this.listaRevistas = listaRevistas;
    }

    public List<Item> getListaItems() {
        return listaItems;
    }

    public void setListaItems(List<Item> listaItems) {
        this.listaItems = listaItems;
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
}
