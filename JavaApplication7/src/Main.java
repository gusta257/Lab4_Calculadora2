/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
import java.io.*;
/**
 *
 * @author Gustavo De Leon 17085
 * @author Luis Esturban 17256
 */
import java.io.*;
/**
 *
 * @author Gustavo De Leon 17085
 * @author Luis Esturban 17256
 */
public class Main {

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
        System.out.println("Bienvenido");
        Calculadora calc = new Calculadora();
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el nombre del ADT que desea usar:");
          System.out.println("Vector");
          System.out.println("ArrayList");
          System.out.println("Lista simple");
          System.out.println("Lista doblemente enlazada");
          System.out.println("Lista circular");
          System.out.println("-------------------------------------------------------------------------------------");
          String opt = teclado.nextLine();
        
        int contador=0;
        try {
            String sCadena;
            //Funcion para abrir y leer el documento 
            FileReader fr = new FileReader("datos.txt");
            BufferedReader bf = new BufferedReader(fr);
            //bucle para hacer las funciones dependiendo de las lineas del documento
            while ((sCadena = bf.readLine())!=null) {       
                contador=contador+1;
                System.out.println(contador+(")Su resultado es: ")+calc.calcular(sCadena,opt));
            } 
        //Sirve si algun dato del documento no sirva
        }catch(Exception e){
            System.out.println("Documento no encontrado o dañado :( por favor verificar");
            }
        System.out.println("Gracias por esperar");
    }
}