package co.edu.uniquindio.biblioteca.model;

public class Bibliotecario extends Empleado implements IGestionarInventario, IGestionarLibros, IGestionarPrestamos {
    public Bibliotecario(String nombre, String id) {
        super(nombre, id);
    }
    @Override
    public void gestionarLibros() {

    }

    @Override
    public void gestionarPrestamos() {

    }

    @Override
    public void gestionarItem() {

    }
}
