package ui;

import data.GestorDatos;
import model.Tour;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // Instancia el gestor y carga los tours desde el archivo
        GestorDatos gestor = new GestorDatos();
        ArrayList<Tour> listaTours = gestor.cargarTours("src/main/resources/tours.txt");

        // Muestra todos los tours
        System.out.println("=== Lista de Tours ===");
        for (Tour tour : listaTours) {
            System.out.println(tour);
        }

        // Filtro - muestra solo los tours con precio mayor a 100000
        System.out.println("\n=== Tours con precio mayor a $100.000 ===");
        for (Tour tour : listaTours) {
            if (tour.getPrecio() > 100000) {
                System.out.println(tour);
            }
        }
    }
}