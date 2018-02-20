
import java.util.Iterator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gustavo
 */
public interface List<E> extends Stack<E> 
{

   public int size();
   // post: returns number of elements in list

   public boolean isEmpty();
   // post: returns true iff list has no elements

   public void clear();
   // post: empties list

   public void addFirst(E value);
   // post: value is added to beginning of list

   public void addLast(E value);
   // post: value is added to end of list

   public E getFirst();
   // pre: list is not empty
   // post: returns first value in list

   public E getLast();
   // pre: list is not empty
   // post: returns last value in list

   public E removeFirst();
   // pre: list is not empty
   // post: removes first value from list

   public E removeLast();
   // pre: list is not empty
   // post: removes last value from list


}