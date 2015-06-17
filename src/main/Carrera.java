
package main;


public class Carrera {
    
    private String nombre;
    private Pensum pensum;

    public Carrera(String nombre, Pensum pensum) {
        this.nombre = nombre;
        this.pensum = pensum;
    }

    public Carrera() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Pensum getPensum() {
        return pensum;
    }

    public void setPensum(Pensum pensum) {
        this.pensum = pensum;
    }
    
    
    
}
