package p7;

import java.util.Arrays;

public class MyArrayList<E>
{
    private Object[] a;
    private int size;

    public MyArrayList()
    {
        a = new Object[10];
        //size = 10;
    }

    public MyArrayList(int initialCapacity)
    {
        if (initialCapacity < 0)
            throw new IllegalArgumentException();
        else if(initialCapacity == 0)
        	a = new Object[0];
        else
        	a = new Object[initialCapacity];
    }
    
    public String toString()
    {
    	String str = "[";
    	for(int i=0; i<size; i++)
    		str += a[i]+" ";
    	return str+"]";
    }

    public int size()
    {
        return size;
    }

    public E get(int index)
    {
        if (index < 0 || index >size-1)
            throw new IndexOutOfBoundsException();

        // Note: You must cast the reference from the array to type E.
        // For example, to return element 6 from a: return (E) a[6];

        return (E) a[index];
    }

    public E set(int index, E element)
    {
        if (index < 0)
            throw new IndexOutOfBoundsException();
        
        E before = (E) a[index];
        
        a[index] = element;

        return before; 
    }

    public boolean contains(Object elem)
    {
    	boolean contains = false;
    	
    	for(int i=0; i<size;i++)
    		if(a[i].equals(elem))
    			contains = true;
        return contains; // TODO: implement
    }

    public void trimToSize()
    {
    	boolean hasnull = false;
    	
    	for (Object i : a)
    		  if (i == null)
    		    hasnull = true;
    
    	if(hasnull)
    	{
    		for(int i=size-1; i >0; i--)
    			if(a[i] == null)
    				size--;
        
    		Object[] temp = new Object[size];
        
    		for(int i=0; i<size; i++)
    			temp[i] = a[i];
        
    		a = temp;
    	}
    }

    public void add(int index, E element)//I cant get this to work. I give up
    {
        if (index < 0 || index > size-1)
            throw new IndexOutOfBoundsException();
 
        checksize();
    	
        int nullct = 0;
    	for(int i=0; i<size; i++)
			if(a[i] == null)
				nullct++;
        
        System.out.println("Check: "+toString());
    	
        for(int i=index; i<size-nullct; i++)
        	a[i+1] = a[i];
        
        a[index] = element;
        
        
    }
    
    public boolean add(E elem)//Makes a the right size, counts the # of nulls, then add elem to the size-the # of nulls
    {
    	checksize();
    	
    	int nullct = 0;
    	for(int i=0; i<size; i++)
			if(a[i] == null)
				nullct++;
    	
    	a[size-nullct] = elem;

        return true;
    }
    
    private void checksize()//If there are no more nulls it adds more
    {
    	boolean hasnull = false;
    	
    	for (int i=0; i<size; i++)
    		  if (a[i] == null)
    		    hasnull = true;
    	
    	if(hasnull == false)
    	{
    		Object[] temp = Arrays.copyOf(a, size*2+1);
    		size = size*2+1;
    		a = temp;
    	}
    }

    public E remove(int index)
    {
        if (index <0 || index>size-1)
            throw new IndexOutOfBoundsException();

        return (E)a[index]; // TODO: implement
    }

    public boolean remove(Object elem)
    {
        return true; // TODO: implement
    }

    Object[] getA()
    {
        return a;
    }

    void setA(Object[] newA)
    {
        a = newA;
    }

    int getSize()
    {
        return size;
    }

    void setSize(int newSize)
    {
        size = newSize;
    }
}
