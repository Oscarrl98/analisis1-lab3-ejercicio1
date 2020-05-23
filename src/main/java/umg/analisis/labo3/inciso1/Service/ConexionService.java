package umg.analisis.labo3.inciso1.Service;
import java.sql.Connection;
import java.sql.DriverManager;

import java.util.*;

public class ConexionService {
    public static ConexionService instance;
    private Connection conexion = null;
    

    private ConexionService() {
    }
    public static ConexionService getInstance(){
        if(instance == null){
           instance = new ConexionService();
        }
           return instance;
        
    }
    public Connection conectar() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");      
            conexion = DriverManager.getConnection("jdbc:mysql://192.185.4.65:3306/jbarilla_ingsoftware", "jbarilla_estudia", "2Ui!OssHDQGv");  
        } catch (Exception e) {
        }
        return conexion;
    }
    

}