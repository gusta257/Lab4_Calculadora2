/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * @author Luis Esturban 17256
 * @author Gustavo De Leon 17085
 */
public class SinglyLinkedList<E> extends AbstractList<E> {
   protected int count; // list size
   protected Node<E> head; // ref. to first element

    /**
     * Constructor generico para SinglyLinkedList
     */
    public SinglyLinkedList()
   // post: generates an empty list
   {
      head = null;
      count = 0;
   }
   
   @Override
   public int size()
   // post: returns number of elements in list
  {
    return count;
  }
  
    /**
     * Agrega un valor al inicio de la lista
     * @param value valor a ser agregado
     */
    @Override
  public void addFirst(E value)
  // post: value is added to beginning of list
  {
     // note order that things happen:
     // head is parameter, then assigned
     head = new Node<E>(value, head);
     count++;
  }
  
    /**
     * Elimina el primer valor de la lista
     * @return el valor del principio de la lista
     */
    @Override
  public E removeFirst()
  // pre: list is not empty
  // post: removes and returns value from beginning of list
 {
     Node<E> temp = head;
     head = head.next(); // move head down list
     count--;
     return temp.value();
  }
  
    /** 
     * Retorna el primer valor de la lista
     * @return head.value() el valor de la cabeza
     */
    @Override
  public E getFirst()
  // pre: list is not empty
  // post: returns first value in list
  {
      return head.value();
  }
  
    /**
     * Agrega un valor al final de la lista
     * @param value el valor a ser agregado
     */
    @Override
  public void addLast(E value)
  // post: adds value to end of list
  {
      // location for new value
      Node<E> temp = new Node<E>(value,null);
      if (head != null)
     {
         // pointer to possible tail
         Node<E> finger = head;
         while (finger.next() != null)
         {
                finger = finger.next();
         }
		 
         finger.setNext(temp);
      } else head = temp;
	  
	  count++;
	  
   }
   
  
    @Override
    public void clear() {
        head=null;
       count=0;
    }

    /**
     *
     * @return
     */
    @Override
    public E getLast() {
        
       Node node=head;
       while((node.next()!=(null)))
       {
           node=node.next();
       }
       
       return (E)node.data;
    }

    @Override
    public E removeLast() {
       Node node1 = head;
        Node node2 = node1;
        while (node1.next() != null){
            node2 = node1;
            node1 = node1.next();
        }
        node2.nextElement = null;
        count--;
        return (E)node1.data;
    }

}