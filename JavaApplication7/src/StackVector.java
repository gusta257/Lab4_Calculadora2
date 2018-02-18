import java.util.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 * @author Luis Esturban 17256
 * @author Gustavo De Leon 17085
 */
public class StackVector<E> implements Stack<E> {
     protected Vector<E> lista;
     
     public StackVector(){
         lista= new Vector<E>();
     }
      public StackVector(int n){
         lista= new Vector<E>(n);
     }
     public void push(E item){
          lista.add(item);
     }
    /**
    * Remueve los valores de la lista
    * @return lista.remove(size()-1);
    */
   public E pop(){
        return lista.remove(size()-1);
   }
    /**
    * Retorna el tamaño de la lista
    * @return lista.get(size()-1);
    */
   public E peek(){
       return lista.get(size()-1);
   }
    /**
    * Verifica si la lista esta vacia
    * @return vacio
    */
   public boolean empty(){
       boolean vacio;
       if(lista.isEmpty()==true){
           vacio = true;
       }
       else{
           vacio = false;
       }
       return vacio;
   }
    /**
    * Retorna el tamaño de la lista
    * @return lista.size();
    */
   public int size(){
       return lista.size();
   }
}
