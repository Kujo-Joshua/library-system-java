package src.service;


import src.dao.LibrosDAO;
import src.exception.ObjetoNuloException;
import src.model.Libro;
import src.templates.OperationCrud;

public class AltaLibro extends OperationCrud<Libro>{
    LibrosDAO dao;

    AltaLibro(LibrosDAO dao){
        this.dao=dao;
    }
    
    public void setDao(LibrosDAO dao) {
        this.dao = dao;
    }
    public LibrosDAO getDao() {
        return dao;
    }
    @Override
    protected void validar(Libro object){
        if (object == null) {
            throw new ObjetoNuloException("El objeto no puede ser nulo");
        }
        
    }
    @Override
    protected void procesar(Libro object) {
        object.setId(dao.getentidadId().size()+1);
        dao.addEntidad(object);
        
        
    } 
    @Override
    protected void persistir(Libro object) {
        // TODO Auto-generated method stub
        
    }
}
