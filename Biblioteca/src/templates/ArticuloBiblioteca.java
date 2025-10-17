package src.templates;

public abstract class ArticuloBiblioteca {
    private String titulo;
    private int id;
    private int anioPublicacion;
    boolean disponible=true;
    boolean descontinuado=false;
    
    public ArticuloBiblioteca(String titulo, int anioPublicacion){
        this.titulo=titulo;
        this.anioPublicacion=anioPublicacion;
    }
    public boolean getDescontinuado(){
        return descontinuado;
    }
    public void setDescontinuado(boolean descontinuado) {
        this.descontinuado = descontinuado;
    }
    public int getAnioPublicacion() {
        return anioPublicacion;
    }
    public int getId() {
        return id;
    }
    public String getTitulo() {
        return titulo;
    }
    public boolean getDisponible(){
        return disponible;
    }
    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }
    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public abstract String mostrarInfo();
}
