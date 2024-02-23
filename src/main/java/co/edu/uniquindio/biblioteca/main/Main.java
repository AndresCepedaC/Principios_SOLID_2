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

        encontrarPrestamoMiembro(biblioteca,"1234");
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
    public static void imprimirItems(List<Item> listaItems){
        for (Item item : listaItems){
            System.out.println("Item: " + item.toString());
        }
    }
    public static void encontrarPrestamoMiembro(Biblioteca biblioteca, String ID){
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
    public static void buscarMiembroAsociado(Biblioteca biblioteca, String ISBN){
        for (Item item : biblioteca.getListaItems()){
            if (item.getISBN().equalsIgnoreCase(ISBN)){
                System.out.println(item.getPrestamo().getMiembro().toString());
            }else{
                System.out.println("No se encuentra el item.");
            }
        }
    }

}