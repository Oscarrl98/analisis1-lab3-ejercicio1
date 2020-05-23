package umg.analisis.labo3.inciso1.Service;
import java.util.Date;
import java.util.*;
import umg.analisis.labo3.inciso1.Entity.EstudiantesEntity;


public class mostrarFecha extends RunSqlDecorator {
    private static mostrarFecha instance;

    private mostrarFecha() {
    }
    public static mostrarFecha getInstance(){
        if(instance == null){
             instance = new mostrarFecha();
        }
            return instance;        
   }
    public void mostrarFecha() {
        System.out.println("--------------------");
        System.out.println("--------------------");
        System.out.println("Consulta ejecutada con fecha:");
        java.util.Date fecha = new Date();
        System.out.println (fecha);
        System.out.println("Espere porfavor..");  
    }
    
    @Override
    public void runSqlQuery(EstudiantesEntity est) {
        this.mostrarFecha();
        this.query.runSqlQuery(est);
    }
        
}