package myLinkedList;

import java.util.NoSuchElementException;

public class MyLinkedList<E>
{    
	
	private Object head;
	private Object tail;
	private Object cur;
	private int size;
	
    public MyLinkedList()
    {
       head = null;
       tail = null;
    }
    
    public boolean add(E o)
    {
        return true;
    }
    
    public void add(int index, E element)
    {
        
    }
    
    public void addFirst(E o)
    {
        
    }
    
    public void addLast(E o)
    {
        
    }
    
    public E getFirst()
    {
    	if(head == null)
    		throw new NoSuchElementException();
    	
        return (E)head;
    }
    
    public E getLast()
    {
    	if(tail == null)
    		throw new NoSuchElementException();
    	
        return (E)tail;
    }
    
    public E removeFirst()
    {
        return null;
    }
    
    public E removeLast()
    {
    	return null;
    }
    
    public void clear()
    {
        
    }
    
    public E get(int index)
    {
    	return null;
    }
    
    public boolean isEmpty()
    {
        return size == 0;
    }
    
    public E remove()
    {
    	return null;
    }
    
    public E remove(int index)
    {
    	return null;
    }
    
    public E set(int index, E element)
    {
    	return null;
    }
    
    public int size()
    {
        return size;
    }
    
    public String toString()
    {
    	return null;
    }
    
    private class ListNode<E>
    {
        public E value;
        public ListNode<E> prev;
        public ListNode<E> next;
    
        public ListNode(E initValue)
        {
            value = initValue;
            prev = null;
            next = null;
        }
    
        private ListNode(E initValue, ListNode<E> initPrev, ListNode<E> initNext)
        {
            value = initValue;
            prev = initPrev;
            next = initNext;
        }
    }
}