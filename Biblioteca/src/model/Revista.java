package src.model;

import src.templates.ArticuloBiblioteca;

public class Revista extends ArticuloBiblioteca{
    private int Volumen;

    public void setVolumen(int volumen) {
        Volumen = volumen;
    }
    public int getVolumen() {
        return Volumen;
    }

    @Override
    public String mostrarInfo() {
        return new String(this.getTitulo()+this.getAnioPublicacion()+" "+this.getId()+this.Volumen);
    }
}
