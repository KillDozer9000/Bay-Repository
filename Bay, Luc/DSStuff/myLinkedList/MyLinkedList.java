package myLinkedList;

import java.util.NoSuchElementException;

public class MyLinkedList<E>
{    
	
	private ListNode<E> head;
	private ListNode<E> tail;

	private int size = 0;
	
    public MyLinkedList()
    {
    	head = new ListNode<E>(null);
    	tail = new ListNode<E>(null);
    	
    	head.next = tail;
    	tail.prev = head;
    }
    
    public void reverse()//only works for singly linked lists w no dummy nodes
    {
    	ListNode<E> curr = head;
    	ListNode<E> before = null;
    	
    	while(curr != null)
    	{
    		ListNode<E> temp = curr.next;
    		curr.next = before;
    		before = curr;
    		curr = temp;
    	}
    	
    	head = tail;
    	head = before;
    }
    
    public ListNode<E> getNodeBeforeIndex(int i)
    {	
    	if(i < (size/2))
    	{
    		ListNode<E> before = head;
    		
    		for(int j=0; j < i; j++)
    			before = before.next;
    	
    		return before;
    	}
    	
    	ListNode<E> before = tail;
    	
    	for(int j=0; j < (size-i+1); j++)
    		before = before.prev;
    	
    	return before;
    }
    
    public boolean add(E o)
    {
    	add(size, o);
    	
        return true;
    }
    
    public void add(int index, E element)
    {
    	if(index < 0 || index > size)
    		throw new IndexOutOfBoundsException();
    	
    	ListNode<E> beforeIndex = getNodeBeforeIndex(index);
    	
    	ListNode<E> newElem = new ListNode<E>(element, beforeIndex, beforeIndex.next);
    	
    	newElem.next.prev = newElem;
    	beforeIndex.next = newElem;
    	
    	size++;
    }
    
    public void addFirst(E o)
    {
    	add(0, o);
    }
    
    public void addLast(E o)
    {
    	add(o);
    }
    
    public E getFirst()
    {
        return head.next.value;
    }
    
    public E getLast()
    { 	
        return tail.prev.value;
    }
    
    public E removeFirst()
    {
        return remove(0);
    }
    
    public E removeLast()
    {
    	return remove(size-1);
    }
    
    public void clear()
    {
        head.next = tail;
        tail.prev = head;
    }
    
    public E get(int index)
    {		
    	return getNodeBeforeIndex(index).next.value;
    }
    
    public boolean isEmpty()
    {
        return size == 0;
    }
    
    public E remove()
    {
    	return remove(0);
    }
    
    public E remove(int index)
    {
    	if(index < 0 || index > size)
    		throw new IndexOutOfBoundsException();
    	
    	ListNode<E> before = getNodeBeforeIndex(index);
    	
    	E temp = before.next.value;
    	
    	before.next.next.prev = before;
    	before.next = before.next.next;
    	
    	size--;
    	
    	return temp;
    }
    
    public E set(int index, E element)
    {
    	ListNode<E> elem = getNodeBeforeIndex(index);
    	E temp = elem.next.value;
    	elem.next.value = element;
    	
    	return temp;
    }
    
    public int size()
    {
        return size;
    }
    
    public String toString()
    {
    	ListNode<E> curr = head;
    	String str = "[";
    	
    	for(int i=0; i<size; i++)
    	{
    		curr = curr.next;
    		str += curr.value + ", ";
    	}
    	
    	return str.substring(0, str.length()-2)+"]";//shhhh im lazy
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