package src.model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Prestamo {
    DateFormat fechaInicio=new SimpleDateFormat("dd/MM/yyyy");
    DateFormat fechaMaximaDevolucion=new SimpleDateFormat("dd/MM/yyyy");
    Alumn realizadoPor;
    boolean libroDevuelto;

    public void setFechaInicio(DateFormat fechaInicio) {
        this.fechaInicio = fechaInicio;
    }
    public void setFechaMaximaDevolucion(DateFormat fechaMaximaDevolucion) {
        this.fechaMaximaDevolucion = fechaMaximaDevolucion;
    }
    public void setLibroDevuelto(boolean libroDevuelto) {
        this.libroDevuelto = libroDevuelto;
    }
    public void setRealizadoPor(Alumn realizadoPor) {
        this.realizadoPor = realizadoPor;
    }
    public DateFormat getFechaInicio() {
        return fechaInicio;
    }
    public DateFormat getFechaMaximaDevolucion() {
        return fechaMaximaDevolucion;
    }
    public Alumn getRealizadoPor() {
        return realizadoPor;
    }
    public boolean getLibroDevuelto(){
        return libroDevuelto;
    }
}
