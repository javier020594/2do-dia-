
package main;


public class Estudiante extends Persona {
    
    private String fichaAcademica;
    private String carrera;

    public Estudiante(String fichaAcademica, String carrera, String nombre, int edad, char sexo) {
        super(nombre, edad, sexo);
        this.fichaAcademica = fichaAcademica;
        this.carrera = carrera;
    }

    public Estudiante(String fichaAcademica, String carrera) {
        super();
        this.fichaAcademica = fichaAcademica;
        this.carrera = carrera;
    }
    
    public Estudiante() {
        super();
        
    }
   
    
    public String getFichaAcademica() {
        return fichaAcademica;
    }

    public void setFichaAcademica(String fichaAcademica) {
        this.fichaAcademica = fichaAcademica;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    @Override
    public String toString() {
        return super.toString()
                +"\nFicha Academica : "+fichaAcademica+"\nCarrera :"+carrera;
    }
    
    
  
    
    
}
