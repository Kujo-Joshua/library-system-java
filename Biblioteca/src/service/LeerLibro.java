package src.service;

import src.dao.LibrosDAO;
import src.exception.ObjetoNuloException;
import src.model.Libro;
import src.templates.OperationCrud;

public class LeerLibro extends OperationCrud<Libro>{
    LibrosDAO dao;
    LeerLibro(LibrosDAO dao){
        this.dao=dao;
    }
    @Override
    protected void validar(Libro object) {
        if (object==null) {
            throw new ObjetoNuloException("El Libro no fue encontrado");
        }
        
    }
    @Override
    protected void procesar(Libro object) {
        // Nada que procesar, solo realizamos validaciones de que el libro exista
    }
    @Override
    protected void persistir(Libro object) {
        // TODO Auto-generated method stub
        
    }
}
