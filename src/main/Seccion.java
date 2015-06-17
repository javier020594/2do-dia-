
package main;

import java.util.ArrayList;
import java.util.List;


public class Seccion {
    
    
    private int numeroSeccion;
    private Profesor profesorAsignado;
    private List<Estudiante>estudiantes;

    public Seccion() {
        
         estudiantes =new ArrayList<>();
    }

    public Seccion(int numeroSeccion, Profesor profesorAsignado, List<Estudiante> estudiantes) {
        this.numeroSeccion = numeroSeccion;
        this.profesorAsignado = profesorAsignado;
        this.estudiantes = estudiantes;
    }
    
   
    

    public int getNumeroSeccion() {
        return numeroSeccion;
    }

    public void setNumeroSeccion(int numeroSeccion) {
        this.numeroSeccion = numeroSeccion;
    }

    public Profesor getProfesorAsignado() {
        return profesorAsignado;
    }

    public void setProfesorAsignado(Profesor profesorAsignado) {
        this.profesorAsignado = profesorAsignado;
    }

    public List<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(List<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }
    
    
    
    
    
    
}
