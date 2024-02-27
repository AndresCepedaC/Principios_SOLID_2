package co.edu.uniquindio.biblioteca.main;

import co.edu.uniquindio.biblioteca.*;

import java.net.IDN;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args){
        Biblioteca biblioteca = inicializarDatosPrueba();

        imprimirPrestamoMiembro(biblioteca,"1234");
        imprimirItems(biblioteca.getListaItems());
    }
    public static Biblioteca inicializarDatosPrueba(){
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.setNombre("Bliblioteca UQ");
        SimpleDateFormat sdf = new SimpleDateFormat();
        Prestamo prestamo = new Prestamo();
        Libro libro = new Libro("Andres","123",true, "Jorge");
        Dvd dvd = new Dvd("jorge el curioso", "321", true, LocalDate.of(2021,10,20));
        Revista revista = new Revista("Ivone", "234", false, "volumen 3");
        Miembro miembro = new Miembro("Ivan", "1234");
        prestamo = new Prestamo(libro, miembro, LocalDate.of(2024,02,01), LocalDate.of(2023, 01, 30));
        libro.setPrestamo(prestamo);miembro.getListaPrestamos().add(prestamo);
        Bibliotecario bibliotecario = new Bibliotecario("Raul", "12345");
        Multa multa = new Multa();
        biblioteca.getListaItems().add(dvd);biblioteca.getListaItems().add(libro);biblioteca.getListaItems().add(revista);biblioteca.getListaMiembros().add(miembro);
        biblioteca.getListaPrestamos().add(prestamo);biblioteca.getListaEmpleados().add(bibliotecario);biblioteca.getListaMultas().add(multa);
        return biblioteca;
    }

    /**
     * Metodo para imprimir los items de la lista de items {comprobar principio de liskov}
     * @param listaItems
     */
    public static void imprimirItems(List<Item> listaItems){
        for (Item item : listaItems){
            System.out.println("Item: " + item.toString());
        }
    }

    /**
     * metodo para imprimir la lista de prestamos que tenga un miembro
     * @param biblioteca
     * @param ID
     */
    public static void imprimirPrestamoMiembro(Biblioteca biblioteca, String ID){
        for (Miembro miembro: biblioteca.getListaMiembros()){
            if (miembro.getID().equalsIgnoreCase(ID)){
                for (Prestamo prestamo : miembro.getListaPrestamos()){
                    System.out.println(prestamo.toString());
                }
            }else{
                System.out.println("No existe el miembro.");
            }
        }
    }

    /**
     * Metodo para encontrar el miembro en base al item
     * @param biblioteca
     * @param ISBN
     */
    public static void buscarMiembroAsociado(Biblioteca biblioteca, String ISBN){
        for (Item item : biblioteca.getListaItems()){
            if (item.getISBN().equalsIgnoreCase(ISBN)){
                System.out.println(item.getPrestamo().getMiembro().toString());
            }else{
                System.out.println("No se encuentra el item.");
            }
        }
    }

    /**
     * Metodo para confirmar un prestamo ingresando el Id del miembro e ISBN del Item
     * @param biblioteca
     * @param ID
     * @param ISBN
     */
    public static void confirmarPrestamoMiembro(Biblioteca biblioteca, String ID, String ISBN){
        for (Miembro miembro : biblioteca.getListaMiembros()){
            if (miembro.getID().equalsIgnoreCase(ID)) {
                for (Prestamo prestamo : miembro.getListaPrestamos()){
                    if (prestamo.getItem().getISBN().equalsIgnoreCase(ISBN)){
                        System.out.println("El item con titulo " + prestamo.getItem().getTitulo() + "esta asociado a el miembro con nombre: " + miembro.getNombre());
                    }else{
                        System.out.println("El item no existe.");
                    }
                }
            }else{
                System.out.println("El miembro no existe.");
            }
        }
    }
}