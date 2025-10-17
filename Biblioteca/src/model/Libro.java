package src.model;

import src.templates.ArticuloBiblioteca;

public class Libro extends ArticuloBiblioteca{
    private int paginas;
    public Libro(String titulo, int anioPublicacion, int paginas){
        super(titulo, anioPublicacion);
        setPaginas(paginas);
    }
    @Override
    public String mostrarInfo() {
        return new String("Titulo: "+this.getTitulo()+" anio: "+this.getAnioPublicacion()+" ID: "+this.getId()+" pag: "+this.paginas);
    }
    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }
    public int getPaginas() {
        return paginas;
    }
}
