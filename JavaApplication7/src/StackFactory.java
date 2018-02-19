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
   public Stack<E> getStack(String entry) {
    // seleccion de la implementacion a utilizar:
	if (entry.equals("ArrayList")){
            return new StackArrayList<E>();
        }//regresa ArrayList
	if (entry.equals("Vector")){
            return new StackVector<E>(); //regresa Vector
        }
        else{
           return new StackLista<E>();
        }
   }
}