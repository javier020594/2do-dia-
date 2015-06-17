package main;

public class MAIN {

    public static void main(String[] args) {

       Universidad univ = new Universidad();
       Carrera carr = new Carrera();
       carr.setNombre("Ing.Informatica");
       univ.getCarrera().add(carr);
        
        Profesor prof= new Profesor("Ingeniero", 14, "Rafael", 37, 'M');
        
       Materia materia = new Materia();
       materia.setNombre("Programacion");
        
        for (int i = 0; i < 10; i++) {
            
            Seccion seccion = new Seccion();
            seccion.setNumeroSeccion(+1);
            seccion.setProfesorAsignado(prof);
            
            for (int j = 0; j < 10; j++) {
                
                Estudiante e= new Estudiante("1123",carr.getNombre(),
                "estudiante"+j,20,'m');
                
                seccion.getEstudiantes().add(e);
            }
            
            materia.getSecciones().add(seccion);
        }

        Pensum pensum = new Pensum();
        pensum.getMaterias().add(materia);
        carr.setPensum(pensum);
        
    }

}
