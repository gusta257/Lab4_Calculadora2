/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gustavo
 */
public class StackFactory<E> {
//selecciona la implementacion a utilizar para un stack
//se utiliza el patron Factory
   public static Stack getStack(String entry) {
    // seleccion de la implementacion a utilizar:
    if (entry.equals("ArrayList")){
       System.out.println("-------------------------------------------------------------------------------------");
       System.out.println("Usted escogio ArrayList");
        return new StackArrayList();
    }//regresa ArrayList
    if (entry.equals("Lista simple")){
       System.out.println("-------------------------------------------------------------------------------------");
       System.out.println("Usted escogio Lista simple");
        return new SinglyLinkedList();
    }//regresa ArrayList
    if (entry.equals("Lista doblemente enlazada")){
       System.out.println("-------------------------------------------------------------------------------------");
       System.out.println("Usted escogio Lista doblemente enlazada");
        return new DoublyLinkedList();
    }//regresa ArrayList
    if (entry.equals("Lista circular")){
       System.out.println("-------------------------------------------------------------------------------------");
       System.out.println("Usted escogio Lista Circular");
        return new DoublyLinkedList();
    }//regresa ArrayList
    if(entry.equals("Vector")){
       System.out.println("-------------------------------------------------------------------------------------");
       System.out.println("Usted escogio Vector");
       return new StackVector(); //regresa Vector
    }
    else{
        System.out.println("Usted escrbio mal xd");
    }
       return null;
   }
}
