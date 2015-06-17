
package main;

import java.util.ArrayList;
import java.util.List;


public class Universidad {
    
    public static final String nombre="UNEG";
    public static final String ubicacion="ATLANTICO";
    
    
    private List<Carrera> carreras;

    public Universidad() {
        
        carreras =new ArrayList<>();
        
    }

    public List<Carrera> getCarrera() {
        return carreras;
    }

    public void setCarrera(List<Carrera> carrera) {
        this.carreras = carrera;
    }

    
    }

    
    
    
    
    
    
    

