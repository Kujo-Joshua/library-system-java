package src.dao;


import src.model.Libro;
import src.templates.EntidadesConIdDAO;

public class LibrosDAO extends EntidadesConIdDAO<Libro>{
    @Override
    public int getIdWithoutUsing() {
        return entidadId.size()+1;
    }
    @Override
    public void addEntidad(Libro entidad) {
        entidadId.put(entidad.getId(), entidad);
    }
    public void updateEntidad(Libro entidad) {
        entidadId.put(entidad.getId(), entidad);
    }
    @Override
    public void readEntidad(int id) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void deleteEntidad(int id) {
        Libro desactive=getEntityForId(id);
        desactive.setDescontinuado(true); 
        
    }
    
}
