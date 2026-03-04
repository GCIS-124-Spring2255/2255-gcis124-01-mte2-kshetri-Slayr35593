// Question: Q2 (mte2, gcis124, 2255)
// Package name: deques
// File name: MyDeque.java

package mte2.deques;

import java.util.Iterator;

 import java.util.LinkedList;
import java.util.Iterator;

 public class MyDeque<E> implements Deque<E> {
    
     private final LinkedList<E> list;
     public MyDeque() {    
        list = new LinkedList<>();    
    }

    // ... for enqueueFront ...
    @Override 
    public void enqueueFront(E element) {
        list.add(element);
    }
    // ... for enqueueBack ...
    @Override
    public void enqueueBack(E element) {
        list.addLast(element);
    }
    // ... for dequeueFront ...
    @Override
    public E dequeueFront() {
        list.removeFirst();
        return list.removeFirst();
    }
    // ... for dequeueBack ... 
    @Override
    public E dequeueBack() {
        return list.removeLast();
    }
    // ... for size ...
    @Override
    public int size() {
        
        return list.size();
    }
    // ... for iterator ...
    @Override
    public Iterator<E> iterator() {

        return null;
    }

    public static void main(String[] args) { 

        // ...
    }
}