package model;

public abstract class Persona {
    private String nombre;
    private int id;
    private String contrasenia;


    public abstract String mostrarInfo();
    public abstract void registrar();
    
    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    public String getContrasenia() {
        return contrasenia;
    }
    public int getId() {
        return id;
    }
    public String getNombre() {
        return nombre;
    }
}
