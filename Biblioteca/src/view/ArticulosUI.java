package src.view;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import src.model.Libro;
import src.service.ArticlesService;

public class ArticulosUI {
    Scanner scanner;
    ArticlesService articlesService=new ArticlesService();
    ArticulosUI(Scanner scanner){
        this.scanner=scanner;
    }


    public static void mostrarOpcionesAdminLibros(){
        System.out.println("Sistema de biblioteca - Administrar libros");
        System.out.println();
        System.out.println("1.Dar de alta un Articulo");
        System.out.println("2.Dar de baja Articulo");
        System.out.println("3.Listar Articulos");
        System.out.println("4.Mostrar Articulo");
        System.out.println("5.Modificar info de libro");
        System.out.printf("Opcion: ");
    }
    public Libro pedirDatosLibro(){
        String titulo;
        int paginas;
        int anio;
        
        System.out.println("Dame el titulo del libro");
        titulo=scanner.nextLine();
        System.out.println("En que anio se lanzo el libro:");
        anio=scanner.nextInt();
        scanner.nextLine();
        System.out.println("Cuantas paginas tiene");
        paginas=scanner.nextInt();
        scanner.nextLine();
        return new Libro(titulo, anio, paginas);
    }
    public void darDeAlta(){
        
        Libro libro= pedirDatosLibro();
        articlesService.agregarLibro(libro);
    }
    private void descontinuar(){
        int id;
        System.out.println("Dime el id del libro");
        id=scanner.nextInt();
        scanner.nextLine();
        articlesService.bajaLibro(articlesService.buscarLibro(id));
        System.out.println("El id es:"+ id);
        System.out.println("Si hice algo, lo desactive cone exito");
    }
    private void listar(){
        int cantidad, option;
        HashMap libros;
        try{
            libros=articlesService.devolverLibros();
        }catch(IndexOutOfBoundsException e){
            System.out.println("No hay libros para mostrar");
            libros=null;
            break;
        }
            System.out.println("Dame un numero de cantidad maxima de libros que te mostrare");
        cantidad=scanner.nextInt();
        scanner.nextLine();
        do{
            if (libros.isEmpty()) {
                    System.out.println("Vaya... ya no hay mas libros para mostrar");
                    break;
                }
            for(Map.Entry<Integer,Libro> libroAMostrar : libros.entrySet()){
                
                if (libroAMostrar==null) {
                    System.out.println("Vaya... ya no hay mas libros para mostrar");
                    break;
                }
                System.out.println(libroAMostrar.getKey()" id: "+libroAMostrar.getValue());
            }
            System.out.println("Mostrar proximos "+cantidad+"?");
            System.out.println("1.Si");
            System.out.println("2.No");
            option=scanner.nextInt();
            scanner.nextLine();
        }while(option==1);
    }
    private void mostrarArticulo(){
        int id;
        System.out.println("Dame el id del articulo a consultar");
        id=scanner.nextInt();
        scanner.nextLine();
        Libro libroAMostrar=articlesService.buscarLibro(id);

        System.out.println(libroAMostrar.mostrarInfo());
    }
    public void modificar(){
        int id;
        System.out.println("Ingresa el Id del libro a modificar");
        id=scanner.nextInt(); scanner.nextLine();
        Libro libroAModificar = pedirDatosLibro();
        articlesService.actualizarInfoLibro(libroAModificar, id);
    }
    public void interfazArticulos(){
        int option;
        do{
            mostrarOpcionesAdminLibros();
            option=scanner.nextInt();
            scanner.nextLine();
            switch (option) {
                case 1:
                    darDeAlta();
                    break;
                case 2:
                    descontinuar();
                    break;
                case 3:
                    listar();
                    break;
                case 4:
                    mostrarArticulo();
                    break;
                case 5:
                    modificar();
                default:
                    System.out.println("No se ingreso una opcion valida UILibros");
                    break;
            }
        }while (option!=6);
    }
}
