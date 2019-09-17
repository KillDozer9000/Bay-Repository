package p13;

public class MineWithoutAnswers
{
    public static void main(String[] args)
    {
        System.out.println(mystery1(54321));
//        System.out.println(mystery2(6789));
//        System.out.println(mystery4("abcabc", "abc"));
    }
    
    // mystery1(54321)
    public static int mystery1(int n)
    {
        if(n == 0)
            return 0;
        
        if(n % 2 == 1)
            return 1 + mystery1(n / 10);
        else
            return mystery1(n / 10);
    }
    
    // mystery2(67890)
    public static int mystery2(int n)
    {
        if(n == 0)
            return 0;
        
        int c = mystery2(n / 10);
        
        if(n % 2 == 1)
            c++;
        
        return c;
    }
    
    public static int mystery3(int n)
    {
        if(n == 0)
            return 0;
        
        if(n % 2 == 0)
            return n % 10 + mystery3(n / 10);
        else
            return mystery3(n / 10);
    }
    
    public static int mystery3Alt(int n)
    {
        if(n == 0)
            return 0;
        
        int s = mystery3(n / 10);
        
        if(n % 2 == 0)
            s += n % 10;
        
        return s;
    }
    
    public static int mystery4(String str, String p)
    {
        if(str.length() < p.length())
            return 0;
        
        int c = mystery4(str.substring(1), p);
        
        if(str.substring(0, p.length()).equals(p))
            c++;
        
        return c;
    }
    
    public static String mystery7(String str, String fnd, String rpl)
    {
        if(str.length() < fnd.length())
            return str;
        
        if(str.substring(0, fnd.length()).equals(fnd))
            return rpl + mystery7(str.substring(fnd.length()), fnd, rpl);
        else
            return str.substring(0, 1) + mystery7(str.substring(1), fnd, rpl);
    }
    
    public static int mystery8(int[] arr)
    {
        return mystery8(arr, 0);
    }
    
    private static int mystery8(int[] arr, int index)
    {
        if(index >= arr.length)
            return 0;
        
        int c = mystery8(arr, index + 1);
        
        if(arr[index] < 0)
            c++;
        
        return c;
    }
    
    public static void mystery9(int[] arr, int a, int b)
    {
        mystery9(arr, a, b, 0);
    }
    
    private static void mystery9(int[] arr, int a, int b, int index)
    {
        if(index >= arr.length)
            return;
        
        if(arr[index] < a)
            arr[index] = a;
        
        if(arr[index] > b)
            arr[index] = b;
        
        mystery9(arr, a, b, index + 1);
    }
    
    public static int[] mystery10(int[] arr)
    {
        int[] newArr = new int[arr.length * 2];
        mystery10(arr, newArr, 0);
        return newArr;
    }
    
    private static void mystery10(int[] oldArr, int[] newArr, int oldIndex)
    {
        if(oldIndex >= oldArr.length)
            return;
        
        newArr[oldIndex] = oldArr[oldIndex];
        newArr[oldArr.length + oldIndex] = oldArr[oldIndex];
        
        mystery10(oldArr, newArr, oldIndex + 1);
    }
}