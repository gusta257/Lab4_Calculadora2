/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * @author Luis Esturban 17256
 * @author Gustavo De Leon 17085
 */
public class StackFactory<E> {
//selecciona la implementacion a utilizar para un stack
//se utiliza el patron Factory
   public static Stack getStack(String entry) {
    // seleccion de la implementacion a utilizar:
    if (entry.equalsIgnoreCase("ArrayList")){
       System.out.println("-------------------------------------------------------------------------------------");
       System.out.println("Usted escogio ArrayList");
        return new StackArrayList();
    }//regresa ArrayList
    if (entry.equalsIgnoreCase("Lista simple")){
       System.out.println("-------------------------------------------------------------------------------------");
       System.out.println("Usted escogio Lista simple");
        return new SinglyLinkedList();
    }//regresa Lista simple
    if (entry.equalsIgnoreCase("Lista doblemente enlazada")){
       System.out.println("-------------------------------------------------------------------------------------");
       System.out.println("Usted escogio Lista doblemente enlazada");
        return new DoublyLinkedList();
    }//regresa Lista doble enlazada
    if (entry.equalsIgnoreCase("Lista circular")){
       System.out.println("-------------------------------------------------------------------------------------");
       System.out.println("Usted escogio Lista Circular");
        return new DoublyLinkedList();
    }//regresa Lista circular
    if(entry.equalsIgnoreCase("Vector")){
       System.out.println("-------------------------------------------------------------------------------------");
       System.out.println("Usted escogio Vector");
       return new StackVector();
    }//regresa Vector
    else{
        System.out.println("Usted escrbio mal xd");
    }
       return null;
   }
}
