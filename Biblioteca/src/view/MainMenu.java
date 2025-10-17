package src.view;

import java.util.Scanner;

public class MainMenu {
    Scanner scanner;
    MainMenu(Scanner scanner){
        this.scanner=scanner;
    }


    private static void mostrarOpcionesMenuPrincipal(){
        System.out.println("1.Administrar Articulos");
        System.out.println("2.Administrar Usuarios");
        System.out.println("3.Gestionar Prestamos");
        System.out.println("4.Gestionar historial");
        System.out.println("5.Salir");
    }
    public void mainInterface(){
        int option;
        ArticulosUI articulosUI=new ArticulosUI(scanner);

        do{
            mostrarOpcionesMenuPrincipal();
            option=scanner.nextInt();
            switch (option) {
                case 1:
                    articulosUI.interfazArticulos();
                    break;
            
                default:
                    break;
            }
        }while(option!=6);
    }
    
}
