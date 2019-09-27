package myLinkedListwIterator;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.ConcurrentModificationException;

public class MyLinkedList<E> implements Iterable<E> //implements List<E>
{
    // list uses dummy head and tail nodes
    private ListNode<E> head;
    private ListNode<E> tail;

    private int size;
    private int modCount;

    public MyLinkedList()
    {
        head = new ListNode<E>(null);
        tail = new ListNode<E>(null);
        head.next = tail;
        tail.prev = head;
        
        size = 0;
        modCount = 0;
    }

    private ListNode<E> getNodeBeforeIndex(int index)
    {
        int distanceFromStart = index;
        int distanceFromEnd = size - index;
        
        if(distanceFromEnd < 0 || distanceFromStart <= distanceFromEnd)
        {
            ListNode<E> nodeBeforeIndex = head;
            for (int x = 1; x <= distanceFromStart; x++)
                nodeBeforeIndex = nodeBeforeIndex.next;
            
            return nodeBeforeIndex;
        }
        else
        {
            ListNode<E> nodeBeforeIndex = tail;
            
            // want node before so run distance + 1 times
            for(int x = 1; x <= distanceFromEnd + 1; x++)
                nodeBeforeIndex = nodeBeforeIndex.prev;
            
            return nodeBeforeIndex;
        }
    }
    
    public int size()
    {
        return size;
    }

    public E get(int index)
    {
        if (index < 0 || index >= size())
            throw new IndexOutOfBoundsException();

        return getNodeBeforeIndex(index).next.value;
    }

    public E getFirst()
    {
        if (isEmpty())
            throw new NoSuchElementException();

        return get(0);
    }

    public E getLast()
    {
        if (isEmpty())
            throw new NoSuchElementException();

        return get(size - 1);
    }
    
    public E set(int index, E element)
    {
        if (index < 0 || index >= size())
            throw new IndexOutOfBoundsException();

        ListNode<E> node = getNodeBeforeIndex(index).next;

        E oldData = node.value;
        node.value = element;
        return oldData;
    }

    public void add(int index, E element)
    {
        if (index < 0 || index > size())
            throw new IndexOutOfBoundsException();

        ListNode<E> nodeBeforeInsertPosition = getNodeBeforeIndex(index);

        ListNode<E> newNode = new ListNode<E>(element, nodeBeforeInsertPosition, nodeBeforeInsertPosition.next);
        nodeBeforeInsertPosition.next = newNode;
        newNode.next.prev = newNode;

        size++;
        modCount++;
    }

    public void addFirst(E o)
    {
        add(0, o);
    }

    public void addLast(E o)
    {
        add(size, o);
    }
    
    public boolean add(E o)
    {
        addLast(o);
        return true;
    }

    public E remove(int index)
    {
        if (index < 0 || index >= size())
            throw new IndexOutOfBoundsException();

        ListNode<E> nodeBeforeRemovePosition = getNodeBeforeIndex(index);

        E removed = nodeBeforeRemovePosition.next.value;

        nodeBeforeRemovePosition.next.next.prev = nodeBeforeRemovePosition;
        nodeBeforeRemovePosition.next = nodeBeforeRemovePosition.next.next;

        size--;
        modCount++;
        return removed;
    }

    public E remove()
    {
        if (isEmpty())
            throw new NoSuchElementException();

        return remove(0);
    }
    
    public E removeFirst()
    {
        return remove();
    }

    public E removeLast()
    {
        if (isEmpty())
            throw new NoSuchElementException();

        return remove(size - 1);
    }

    public String toString()
    {
        String myString = "[";

        ListNode<E> current = head.next;
        for (int x = 0; x < size; x++)
        {
            if (x != 0)
                myString += ", ";

            myString += current.value;
            current = current.next;
        }

        myString += "]";
        return myString;
    }

    public void clear()
    {
        head.next = tail;
        tail.prev = head;
        size = 0;
        modCount++;
    }

    public boolean contains(Object o)
    {
        ListNode<E> current = head.next;
        for (int i = 0; i < size; i++)
        {
            if (o == null ? current.value == null : o.equals(current.value))
                return true;

            current = current.next;
        }

        return false;
    }

    public boolean isEmpty()
    {
        return size == 0;
    }

    public int hashCode()
    {
        int hashCode = 1;
        for (E e : this)
            hashCode = 31 * hashCode + (e == null ? 0 : e.hashCode());
        return hashCode;
    }

    @SuppressWarnings("rawtypes")
    public boolean equals(Object other)
    {
        if (!(other instanceof List))
            return false;

        List otherList = (List) other;

        if (this.size() != otherList.size())
            return false;

        Iterator thisItr = this.iterator();
        Iterator otherItr = otherList.iterator();
        while(thisItr.hasNext())
        {
            Object e1 = thisItr.next();
            Object e2 = otherItr.next();

            if (!(e1 == null ? e2 == null : e1.equals(e2)))
                return false;
        }

        return true;
    }

    public Iterator<E> iterator()
    {
        return listIterator();
    }

    public ListIterator<E> listIterator()
    {
        return new MyListIterator();
    }

    private class MyListIterator implements ListIterator<E>
    {
    	private int imodCount;
    	private int index;
    	private ListNode cursor;
    	
        public MyListIterator()
        {
        	index = 0;
            imodCount = 0;
            cursor = head;
        }

        private void verifyModCount()
        {
            if(modCount != imodCount)
            	throw new ConcurrentModificationException();
        }

        public boolean hasNext()
        {
        	verifyModCount();
            return index +1 < size;
        }

        public boolean hasPrevious()
        {
        	verifyModCount();
            return index -1 >= 0;
        }

        public int previousIndex()
        {
        	verifyModCount();
        	
        	if(index == 0)
        		return -1;
        	
        	return index-1;
        }

        public int nextIndex()
        {
        	verifyModCount();
        	
        	if(index == size-1)
        		return size;
        	
        	return index+1;
        }

        public E previous()
        {
        	verifyModCount();
        	
        	if(hasPrevious())
        	{
        		ListNode temp = cursor.prev;
        		cursor = cursor.prev;
        		index--;
        		
        		return (E) temp.value;
        	}
        		
        	
        	throw new NoSuchElementException();
        }

        public E next()
        {
        	verifyModCount();
        }
        
        public void set(E o)
        {
        	verifyModCount();
        }

        public void add(E o)
        {
        	verifyModCount();
            imodCount++;
            add(o);
        }

        public void remove()
        {
        	verifyModCount();
            imodCount++;
            remove();
            
        }
    }

    private class ListNode<V>
    {
        public V value;
        public ListNode<V> prev;
        public ListNode<V> next;

        public ListNode(V da)
        {
            value = da;
            prev = null;
            next = null;
        }

        public ListNode(V da, ListNode<V> pr, ListNode<V> ne)
        {
            value = da;
            prev = pr;
            next = ne;
        }
    }
}