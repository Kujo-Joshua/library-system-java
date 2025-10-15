package src.model;

import src.templates.ArticuloBiblioteca;

public class Libro extends ArticuloBiblioteca{
    private int paginas;

    @Override
    public String mostrarInfo() {
        return new String(this.getTitulo()+this.getAnioPublicacion()+" "+this.getId()+this.paginas);
    }
    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }
    public int getPaginas() {
        return paginas;
    }
}
