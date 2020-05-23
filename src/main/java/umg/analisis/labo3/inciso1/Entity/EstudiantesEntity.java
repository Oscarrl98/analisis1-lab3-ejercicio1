 package umg.analisis.labo3.inciso1.Entity;

import java.util.*;

public class EstudiantesEntity {
    
    public static EstudiantesEntity instance;
    private EstudiantesEntity() {
    }
    
   public static EstudiantesEntity getInstanceEs(){
        if(instance == null){
             instance = new EstudiantesEntity();
        }
            return instance;        
   }
    
    private String nombre;
    private String apellido;

    public void setNombre(String nombre) {
       this.nombre=nombre;
    }

    public String getNombre() {
       
        return this.nombre;
    }
    
    public void setApellido(String apellido) {
        this.apellido=apellido;
    }

    public String getApellido() {
   
        return this.apellido;
    }

}