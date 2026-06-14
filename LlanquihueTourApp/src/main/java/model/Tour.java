package model;

public class Tour {

    // Atributos
    private String nombreCentro;
    private String nombreTour;
    private int precio;

    // Constructor
    public Tour(String nombreCentro, String nombreTour, int precio) {
        this.nombreCentro = nombreCentro;
        this.nombreTour = nombreTour;
        this.precio = precio;
    }

    // Getters y Setters
    public String getNombreCentro() {
        return nombreCentro;
    }
    public void setNombreCentro(String nombreCentro) {
        this.nombreCentro = nombreCentro;
    }
    public String getNombreTour() {
        return nombreTour;
    }
    public void setNombreTour(String nombreTour) {
        this.nombreTour = nombreTour;
    }
    public int getPrecio() {
        return precio;
    }
    public void setPrecio(int precio) {
        this.precio = precio;
    }

    // Metodo toString
    @Override
    public String toString() {
        return " Nombre del Centro='" + nombreCentro + '\'' +
                ", Nombre del Tour='" + nombreTour + '\'' +
                ", precio=" + precio;
    }

}