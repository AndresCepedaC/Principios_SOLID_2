package co.edu.uniquindio.biblioteca.main;

import co.edu.uniquindio.biblioteca.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

public class Main {
    public static void main(String[] args) throws ParseException {
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.setNombre("Bliblioteca UQ");
        SimpleDateFormat sdf = new SimpleDateFormat();
        Prestamo prestamo = null;
        Libro libro = new Libro("Andres","123","Gabriel", prestamo);
        Dvd dvd = new Dvd("jorge el curioso", "321");
        Revista revista = new Revista("Ivone", "234", "volumen 2");
        Miembro miembro = new Miembro("Ivan", "1234", (List<Prestamo>) prestamo);
        prestamo = new Prestamo(libro, miembro, sdf.parse("20/01/2024"), sdf.parse("30/12/2023"));
        Bibliotecario bibliotecario = new Bibliotecario("Raul", "12345");
        Multa multa = new Multa();
        biblioteca.getListaItems().add(dvd);biblioteca.getListaItems().add(libro);biblioteca.getListaItems().add(revista);
        biblioteca.getListaPrestamos().add(prestamo);biblioteca.getListaEmpleados().add(bibliotecario);biblioteca.getListaMultas().add(multa);
    }
}