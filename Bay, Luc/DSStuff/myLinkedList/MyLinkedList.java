package myLinkedList;

import java.util.NoSuchElementException;

public class MyLinkedList<E>
{    
	
	private ListNode head;
	private ListNode tail;

	private int size = 0;
	
    public MyLinkedList()
    {
    	head = new ListNode(null);
    	tail = new ListNode(null);
    	
    	head = tail;
    	
    }
    
    public void reverse()
    {
    	ListNode curr = head;
    	ListNode before = null;
    	
    	while(curr != null)
    	{
    		ListNode temp = curr.next;
    		curr.next = before;
    		before = curr;
    		curr = temp;
    	}
    	
    	head = tail;
    	head = before;
    }
    
    public E getNodeBeforeIndex(int i)
    {
    	ListNode curr = head.next;
    	
    	for(int j=0; j < i; j++)
    		curr = curr.next;
    	
    	return (E) curr;
    }
    
    public boolean add(E o)
    {
    	add(size-1, o);
    	
        return true;
    }
    
    public void add(int index, E element)
    {
    	ListNode curr = (ListNode) getNodeBeforeIndex(index);
    	
    	ListNode<E> newelem = new ListNode<E>(element, curr, curr.next);
    	
    	curr.next.prev = newelem;
    	curr.next = newelem;
    	
    	size++;
    }
    
    public void addFirst(E o)
    {
    	add(size, o);
    }
    
    public void addLast(E o)
    {
    	add(o);
    }
    
    public E getFirst()
    {
    	if(head == null)
    		throw new NoSuchElementException();
    	
        return (E)head.next;
    }
    
    public E getLast()
    {
    	if(tail == null)
    		throw new NoSuchElementException();
    	
        return (E)tail.prev;
    }
    
    public E removeFirst()
    {
    	size--;
    	
        return null;
    }
    
    public E removeLast()
    {
    	size--;
    	
    	return remove();
    }
    
    public void clear()
    {
        
    }
    
    public E get(int index)
    {
    	ListNode<E> curr = head;
    	
    	for(int i=0; i < size; i++)
    		curr = curr.next;
    		
    	return curr.value;
    }
    
    public boolean isEmpty()
    {
        return size == 0;
    }
    
    public E remove()
    {
    	size--;
    	
    	return remove(size-1);
    }
    
    public E remove(int index)
    {
    	size--;
    	
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
    	
    	ListNode curr = head.next;
    	String str = "[";
    	
    	for(int i=0; i<size-1; i++)
    	{
    		str += curr.value + ", ";
    		curr = curr.next;
    	}
    	
    	str+= curr.next.value+"]";
    	
    	return str;
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