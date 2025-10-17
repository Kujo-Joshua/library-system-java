package src.service;

import java.util.List;

import src.dao.LibrosDAO;
import src.model.Libro;

public class ArticlesService {
    LibrosDAO librosDAO=new LibrosDAO();

    private AltaLibro altaLibro=new AltaLibro(librosDAO);
    private BajaLibro bajaLibro=new BajaLibro(librosDAO);
    private ModLibro modificarLibro=new ModLibro(librosDAO);
    private LeerLibro leerLibro=new LeerLibro(librosDAO);

    public void agregarLibro(Libro libro){
        altaLibro.ejecutar(libro);
    }
    public void bajaLibro(Libro libro){
        bajaLibro.ejecutar(libro);
    }
    public void actualizarInfoLibro(Libro libro, int id){
        libro.setId(id);
        modificarLibro.ejecutar(libro);
    }
    public List<Libro> ListaLibros(){
        return librosDAO.getEntidad();
    }
    public Libro buscarLibro(int id){
        leerLibro.procesar(librosDAO.getEntityForId(id));
        return librosDAO.getEntityForId(id);
    }


}
