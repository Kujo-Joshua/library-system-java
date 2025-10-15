package src.model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import src.templates.Persona;


public class Alumn extends Persona{
    int diasMaximosPrestamo;
    boolean hasLoan;
    DateFormat returnBookBefore=new SimpleDateFormat("dd/MM/yyyy");
    int idLastBorrowedBook;
    boolean activo;

    Alumn(String nombre, int id, String password){
        this.setNombre(nombre);
        this.setId(id);
        this.setContrasenia(password);
        this.diasMaximosPrestamo=7;
        this.activo=true;
        setHasLoan(false);
        returnBookBefore.format("00/00/00");
        setIdLastBorrowedBook(0);
    }

    public void pedirLibro(int idLibro){
        this.idLastBorrowedBook=idLibro;
        this.hasLoan=true;
        Calendar fechaDevolucion=Calendar.getInstance();
        fechaDevolucion.add(Calendar.DATE, diasMaximosPrestamo);
        this.returnBookBefore.format(fechaDevolucion);
    }

    public void devolverLibro(){
        this.hasLoan=false;
    }

    @Override
    public void registrar() {
        // TODO Auto-generated method stub
        
    }
    @Override
    public String mostrarInfo() {
        return new String("name:"+getNombre()+"Id:"+getId()+"Tiene prestamo activo:"+getHasLoan()+"UltimaFechaDevolucion: "+getReturnBookBefore());
    }

    public DateFormat getReturnBookBefore() {
        return returnBookBefore;
    }
    public int getIdLastBorrowedBook() {
        return idLastBorrowedBook;
    }
    public boolean getHasLoan() {
        return hasLoan;
    }

    public void setHasLoan(boolean hasLoan) {
        this.hasLoan = hasLoan;
    }
    public void setIdLastBorrowedBook(int idLastBorrowedBook) {
        this.idLastBorrowedBook = idLastBorrowedBook;
    }
    public void setReturnBookBefore(DateFormat returnBookBefore) {
        this.returnBookBefore = returnBookBefore;
    }
}
