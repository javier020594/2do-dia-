package main;

public class Profesor extends Persona {

    private String profesion;
    private int añoExperiencia;

    public Profesor(String profesion, int añoExperiencia, String nombre, int edad, char sexo) {
        super(nombre, edad, sexo);
        this.profesion = profesion;
        this.añoExperiencia = añoExperiencia;
    }

    public Profesor(String profesion, int añoExperiencia) {
        super();
        this.profesion = profesion;
        this.añoExperiencia = añoExperiencia;
    }

    public Profesor() {
        super();

    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public int getAñoExperiencia() {
        return añoExperiencia;
    }

    public void setAñoExperiencia(int añoExperiencia) {
        this.añoExperiencia = añoExperiencia;
    }

    @Override
    public String toString() {
        return super.toString()
                +"\nProfesion : "+profesion+"\nAñoExperiencia :"+añoExperiencia;
    }

    
    
    
    
    
}
