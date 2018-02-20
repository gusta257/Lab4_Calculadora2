/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gustavo
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
       
       return removeLast();
   }

   public E peek()
   {
       return getLast();
       
   }

   public boolean empty()
   {
       return size()==0;
   }

   public int size()
   {
       return 0;
   }
}