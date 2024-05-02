 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package FinalAB;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author 179287
 */
public class GramaticaMain {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opc;
        do{
            

            System.out.println("1.- Ingresar Nueva Palabra");
            System.out.println("2.- Palabras Ingresadas");
            System.out.println("3.- Palabras Validas");
            System.out.println("4.- Palabras No Validas");
            System.out.println("5.- Salir");
            do{
                System.out.print("Ingresa una opcion: ");
                opc = entrada.nextInt();
            }while(opc <1 || opc > 5);
            System.out.println("\n\n");
            switch(opc){
                case 1:
                    Palabras.nueva();
                    System.out.println("\n\n");
                    break;
                case 2:
                    Palabras.revision();
                    System.out.println("\n\n");
                    break;
                case 3:
                    Palabras.Validas();
                    System.out.println("\n\n");
                    break;
                case 4:
                    Palabras.NoValidas();
                    System.out.println("\n\n");
                    break;
            }
        }while(opc != 5);
        
        
        
    }
    
    
}
