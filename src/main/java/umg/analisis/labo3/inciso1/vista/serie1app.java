package umg.analisis.labo3.inciso1.view;

import java.util.*;
import umg.analisis.labo3.inciso1.Entity.EstudiantesEntity;
import umg.analisis.labo3.inciso1.Service.EstudiantesService;
import umg.analisis.labo3.inciso1.Service.IRunSqlAction;
import umg.analisis.labo3.inciso1.Service.RunSqlDecorator;
import umg.analisis.labo3.inciso1.Service.mostrarFecha;

public class serie1app {

  
    public serie1app() {
    }

    public static void main(String[] args) {

     EstudiantesEntity est=EstudiantesEntity.getInstanceEs();
     String entradaTeclado ="";

        Scanner entradaEscaner = new Scanner (System.in); 
        
        entradaTeclado = entradaEscaner.nextLine (); 
        String[] parts = entradaTeclado.split(" ");
        String part1 = parts[0];
        String part2 = parts[1];
        est.setNombre(part1);
        est.setApellido(part2);
        
        IRunSqlAction service=EstudiantesService.getInstance();    
        service.runSqlQuery(est);
        
        RunSqlDecorator deco= mostrarFecha.getInstance();
        deco.setQuery(service);
        deco.runSqlQuery(est);
         
       
    }

}