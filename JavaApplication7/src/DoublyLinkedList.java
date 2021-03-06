
import java.util.Iterator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * @author Luis Esturban 17256
 * @author Gustavo De Leon 17085
 */
public class DoublyLinkedList<E> extends AbstractList<E>{
    protected int count;
    protected DoublyLinkedNode<E> head;
    protected DoublyLinkedNode<E> tail;

    public DoublyLinkedList()
    // post: constructs an empty list
    {
       head = null;
       tail = null;
       count = 0;
    }


    public void addFirst(E value)
    // pre: value is not null
    // post: adds element to head of list
    {
       // construct a new element, making it head
       head = new DoublyLinkedNode<E>(value, head, null);
       // fix tail, if necessary
       if (tail == null) tail = head;
       count++;
    }


    public void addLast(E value)
    // pre: value is not null
    // post: adds new value to tail of list
    {
       // construct new element
       tail = new DoublyLinkedNode<E>(value, null, tail);
       // fix up head
       if (head == null) head = tail;
       count++;
    }


    public E removeLast()
    // pre: list is not empty
    // post: removes value from tail of list
    {
       DoublyLinkedNode<E> temp = tail;
       tail = tail.previousElement;
       if (tail == null) {
           head = null;
       } else {
         //  tail.nextElement(null);
       }
       count--;
       return temp.data;
    }

    @Override
    public int size() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public E getFirst() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public E getLast() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public E removeFirst() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 
}