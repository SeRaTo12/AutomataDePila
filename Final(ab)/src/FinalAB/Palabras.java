/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FinalAB;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author 179287
 */
public class Palabras {
    public static String palabra;
    
    public static ArrayList<String> Palabras = new ArrayList<String>();
    public static ArrayList<String> PalabrasValidas = new ArrayList<String>();
    public static ArrayList<String> PalabrasNoValidas = new ArrayList<String>();
    
    
    public static void nueva(){
        boolean aprobado = true;
        palabra="";
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa la palabra (solo Minusculas): ");
        palabra = entrada.nextLine();
        if(palabra.length()==0){
            aprobado = false;
        }
        Palabras.add(palabra);
        for (int i = 0; i < palabra.length(); i++) {
            if(palabra.length()%2!=0 || palabra.isEmpty()){
                aprobado = false;
                break;
            }
            if(i%2==0){
                if(palabra.charAt(i)==97){
                    continue;
                }else{
                    aprobado = false;
                    break;
                }
            }else{
                if(palabra.charAt(i)==98){
                    continue;
                }else{
                    aprobado = false;
                    break;
                }
            }
        }

        if(aprobado){
            System.out.println("palabra valida");
            PalabrasValidas.add(palabra);
        }else{
            System.out.println("Palabra no valida");
            PalabrasNoValidas.add(palabra);
        }
    }
    
    public static void revision(){
        for (int i = 0; i < Palabras.size(); i++) {
            System.out.println((i+1)+".- "+Palabras.get(i));
        }
    }
    
    public static void Validas(){
        for (int i = 0; i < PalabrasValidas.size(); i++) {
            System.out.println((i+1)+".- "+PalabrasValidas.get(i));
        }
    }
    public static void NoValidas(){
        for (int i = 0; i < PalabrasNoValidas.size(); i++) {
            System.out.println((i+1)+".- "+PalabrasNoValidas.get(i));
        }
    }
}
