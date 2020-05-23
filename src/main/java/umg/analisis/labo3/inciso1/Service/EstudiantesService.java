package umg.analisis.labo3.inciso1.Service;

import umg.analisis.labo3.inciso1.Dao.EstudiantesDao;
import umg.analisis.labo3.inciso1.Entity.EstudiantesEntity;

public class EstudiantesService implements IRunSqlAction{
     
    private EstudiantesService() {    
    }
    
   public static EstudiantesService instance;
   public static EstudiantesService getInstance(){
          if(instance == null){
             instance = new EstudiantesService();
        }
            return instance;
   }
   
    @Override
    public void runSqlQuery(EstudiantesEntity est) {
        EstudiantesDao eje =EstudiantesDao.getInstance();
        System.out.println("Ejecutando Consulta...");
        eje.getSqlSelect(est);
       
    }
}