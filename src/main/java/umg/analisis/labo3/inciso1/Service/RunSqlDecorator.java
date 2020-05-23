package umg.analisis.labo3.inciso1.Service;

import java.util.*;
import umg.analisis.labo3.inciso1.Entity.EstudiantesEntity;

 public abstract class RunSqlDecorator implements IRunSqlAction {

    public RunSqlDecorator() {
    }

    protected IRunSqlAction query;

    public void setQuery(IRunSqlAction query) {
        this.query=query;
    }

    public IRunSqlAction getQuery() {
        // TODO implement here
        return this.query;
    }
   
    public void runSqlQuery(EstudiantesEntity est) {
        this.query.runSqlQuery(est);
    }

}