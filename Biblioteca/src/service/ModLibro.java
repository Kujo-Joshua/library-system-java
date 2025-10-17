package src.service;

import src.dao.LibrosDAO;
import src.model.Libro;
import src.templates.OperationCrud;

public class ModLibro extends OperationCrud<Libro>{
    LibrosDAO dao;
    ModLibro(LibrosDAO dao){
        this.dao=dao;
    }
    @Override
    protected void validar(Libro object) {
        // TODO Auto-generated method stub
        
    }
    @Override
    protected void procesar(Libro object) {
        
        dao.updateEntidad(object);
    }
    @Override
    protected void persistir(Libro object) {
        // TODO Auto-generated method stub
        
    }
}
