package p13;

import java.io.File;

public class DirectoryTraversal
{
    public static void main(String[] args)
    {
        File f1 = new File("Luc");
        
        printFileNames(f1, 5);
    }
    
    public static void printFileNames(File f, int maxLevels)
    {
        if(maxLevels == 0)
        	return;
        
        if(! f.isDirectory())
        {
        	System.out.print(f.toString());
        	return;
        }
        
        
        File[] paths = f.listFiles();
        	
        for(int i=0; i < paths.length; i++)
        {
        	System.out.print(f);
        	printFileNames(f, maxLevels-1);
        }
    }
    
    //isDirectory();
    //listFiles();
    //getAbsoluteFile();
}
