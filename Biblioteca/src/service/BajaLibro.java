package src.service;

import src.dao.LibrosDAO;
import src.exception.ObjetoNuloException;
import src.model.Libro;
import src.templates.OperationCrud;

public class BajaLibro extends OperationCrud<Libro>{
    LibrosDAO dao;
    BajaLibro(LibrosDAO dao){
        this.dao=dao;
    }

    protected void validar(Libro object) {
        if (object==null) {
            throw new ObjetoNuloException("El objeto no fue encontrado");
        }
    };
    protected void procesar(Libro object) {
        dao.deleteEntidad(object.getId());
    };
    protected void persistir(Libro object) {};
    
}
