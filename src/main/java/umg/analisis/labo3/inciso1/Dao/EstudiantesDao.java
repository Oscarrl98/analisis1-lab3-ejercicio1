package umg.analisis.labo3.inciso1.Dao;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.*;
import umg.analisis.labo3.inciso1.Entity.EstudiantesEntity;
import umg.analisis.labo3.inciso1.Service.ConexionService;

/**
 * 
 */
public class EstudiantesDao {

    public static EstudiantesDao instance;
    private EstudiantesDao() {
    }
    public static EstudiantesDao getInstance(){
        if(instance == null){
             instance = new EstudiantesDao();
        }
            return instance;      
    }
    
    public void getSqlSelect(EstudiantesEntity student) {
        try{
        ConexionService newconnection=ConexionService.getInstance();
         Connection conection =newconnection.conectar();
         Statement consulta = conection.createStatement();
            ResultSet resultado = consulta.executeQuery ("SELECT id_student,name,surname FROM t2_student WHERE (name='"+student.getNombre()+"' and surname='"+student.getApellido()+"')or(name='"+student.getNombre()+"'or surname='"+student.getApellido()+"') LIMIT 20");
            System.out.println (" id<------>Nombre<----->Apellido<");
            while (resultado.next()){
                System.out.println (resultado.getInt ("id_student") + "     " + resultado.getString (2)+ "      "+ resultado.getString (3)+ "");
            }     
            conection.close();        
        }
        catch (Exception e){
            e.printStackTrace();
            ;
        }        
    }

}