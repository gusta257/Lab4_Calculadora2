/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *@author Luis Esturban 17256
 * @author Gustavo de Leon 17085
 */
public abstract class AbstractList<E> implements List<E>{
   public AbstractList()
   // post: does nothing
   {
   }

   public boolean isEmpty()
   // post: returns true iff list has no elements
   {
      return size() == 0;
   }
  public void push(E item)
    {
        addLast(item);
    
    }

   public E pop()
   {
   // pre: stack is not empty
   // post: most recently pushed item is removed and returned
       return removeLast();
   }

   public E peek()
   {// pre: stack is not empty
   // post: top value (next to be popped) is returned
       return getLast();
       
   }

   public boolean empty()
   { // post: returns true if and only if the stack is empty
       return size()==0;
   }

   public int size()
   {// post: returns the number of elements in the stack
       return 0;
   }
}