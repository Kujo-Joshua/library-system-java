package src.dao;


import src.model.Libro;
import src.templates.EntidadesConId;

public class LibrosDAO extends EntidadesConId<Libro>{
    @Override
    public void updateEntidad(Libro entidad, int id) {
        // TODO Auto-generated method stub
        super.updateEntidad(entidad, id);
        entidad.setId(id);
    }
    @Override
    public void readEntidad(int id) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void deleteEntidad(int id) {
        // TODO Auto-generated method stub
        
    }
    
}
