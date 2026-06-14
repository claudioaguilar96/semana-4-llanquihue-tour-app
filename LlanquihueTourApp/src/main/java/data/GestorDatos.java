package data;

import model.Tour;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class GestorDatos {

    public ArrayList<Tour> cargarTours(String ruta) {

        ArrayList<Tour> listaTours = new ArrayList<>();

        try {
            BufferedReader lector = new BufferedReader(new FileReader(ruta));
            String linea;

            while ((linea = lector.readLine()) != null) {
                String[] datos = linea.split(";");

                String nombreCentro = datos[0];
                String nombreTour = datos[1];
                int precio = Integer.parseInt(datos[2]);

                Tour tour = new Tour(nombreCentro, nombreTour, precio);
                listaTours.add(tour);
            }

            lector.close();

        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }

        return listaTours;
    }
}