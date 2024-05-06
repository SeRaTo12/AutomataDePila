/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FinalAB;

import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
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
        try {
            PrintWriter writer = new PrintWriter(new OutputStreamWriter(System.out, "UTF-8"));
            writer.flush();
            
            boolean aprobado = true;
            palabra="";
            Scanner entrada = new Scanner(System.in);
            System.out.println("Ingresa la palabra (solo Minusculas): ");
            palabra = entrada.nextLine();
            String palabra2 = "";
            if(palabra.length()==0){
                aprobado = false;
            }
            Palabras.add(palabra);
            for (int i = 0; i < palabra.length(); i++) {
                if(palabra.length()%2!=0 || palabra.isEmpty()){
                    aprobado = false;
                }
                if(i%2==0){
                    if(palabra.charAt(i)==97){
                        palabra2 +="µ";
                        if(i==0){
                            writer.println("(i,a)=(q1,µ,R) -> "+palabra2+"\n");
                            writer.flush();
                        }else{
                            writer.println("(qi,a)=(q1,µ,R) -> "+palabra2+"\n");
                            writer.flush();
                        }
                    }else{
                        aprobado = false;
                        palabra2+="_";
                        if(i==0){
                            writer.println("(i,a)=(q1,µ,R) -> "+palabra2+"\n");
                            writer.flush();
                        }else{
                            writer.println("(q1,a)=(q1,µ,R) -> "+palabra2+"\n");
                            writer.flush();
                        }
                        break;
                    }
                    
                }else{
                    if(palabra.charAt(i)==98){
                        palabra2 +="ß";
                        writer.println("(q1,b)=(q1,ß,R) -> "+palabra2+"\n");
                        writer.flush();
                    }else{
                        aprobado = false;
                        palabra2+="_";
                        writer.println("(b,R) -> "+palabra2+"\n");
                        writer.flush();
                        break;
                    }
                }
            }
            
            if(aprobado){

                writer.println("(q2,■)=(T,■,R)-> "+palabra2);
                System.out.println("palabra valida");
                writer.println("Palabra ingresada: "+ palabra+"\nMaquina de turing: "+palabra2);
                writer.flush();
                PalabrasValidas.add(palabra);
            }else{
                System.out.println("Palabra no valida");
                writer.println("Palabra ingresada: "+ palabra+"\nMaquina de turing: "+palabra2);
                writer.flush();
                PalabrasNoValidas.add(palabra);            
            }
        } catch (UnsupportedEncodingException e) {
            System.err.println("Error: Codificación no soportada.");
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
