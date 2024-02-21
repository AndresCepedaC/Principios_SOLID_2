package co.edu.uniquindio.biblioteca;

public class Bibliotecario extends Empleado implements IGestionarInventario, IGestionarLibros, IGestionarPrestamos {
    public Bibliotecario(String nombre, String id) {
        super(nombre, id);
    }
    @Override
    public void gestionarLibros(String ISBN) {
        Biblioteca biblioteca = new Biblioteca();
        for (Libro libro : biblioteca.getListaLibros()){
            if (libro.getISBN().equalsIgnoreCase(ISBN)){
                System.out.println( "el libro se encuentra en la biblioteca, con estas caracteristicas: "+libro.toString());
            }else{
                System.out.println("El libro no se encuentra en la biblioteca.");
            }
        }
    }

    @Override
    public void gestionarPrestamos(Item item) {
        Biblioteca biblioteca = new Biblioteca();
        for (Prestamo prestamo : biblioteca.getListaPrestamos()){
            if (prestamo.getItem() == item){
                System.out.println("Prestamo: " + prestamo.toString());
            }else{
                System.out.println("El prestamo no existe.");
            }
        }
    }

    @Override
    public void gestionarItem(String ISBN) {
        Biblioteca biblioteca = new Biblioteca();
        for (Item item : biblioteca.getListaItems()){
            if (item.getISBN().equalsIgnoreCase(ISBN)){
                System.out.println("El item " + item.toString() + "se encuentra en la biblioteca");
            }else{
                System.out.println("El item no se encuentra en la biblioteca.");
            }
        }
    }
}
