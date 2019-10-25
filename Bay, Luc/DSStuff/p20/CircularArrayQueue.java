package p20;

public class CircularArrayQueue<E>
{
    private int head, tail, capacity;
    private Object[] array;

    public CircularArrayQueue(int capacity)
    {
    	array = new Object[capacity];
        head = 0;
        tail = 0;
        this.capacity = capacity;
    }

    public void add(E x)
    {
    	checksize();
    	
        array[tail] = x;
        
        if(tail == capacity)
        	tail = 0;
        else
        	tail++;
    }

    public E remove()
    {
       Object tempelem = array[tail];
       
       Object[] temp = new Object[capacity];
       System.arraycopy(array, 1, temp, 0, size());
       array = temp;
       
       head++;
       
       return (E) tempelem;
    }

    public int size()
    {
        return Math.abs(tail-head);
    }
    
    private void checksize()
    {
    	if(size() == capacity)
    	{
    		Object[] newarray = new Object[capacity+1];
    		
    		for(int i=0; i < capacity; i++)
    		{
    			if(head == capacity)
    				head = 0;
    			else
    				head++;
    			
    			newarray[i] = array[head];
    		}
    		
    		array = newarray;
    		head = 0;
    		tail = capacity;
    		capacity++;
    	}
    }
}
