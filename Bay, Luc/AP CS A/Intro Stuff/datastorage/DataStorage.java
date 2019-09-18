package datastorage;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class DataStorage
{
    private String filePath;
    private ArrayList<String> values;
    
    public DataStorage(String filePath)
    {
        this.filePath = filePath;
        values = new ArrayList<String>();
    }
    
    public void addValue(String value)
    {
        values.add(value);
    }
    
    public ArrayList<String> getValues()
    {
        return new ArrayList<String>(values);
    }
    
    public void loadValues() throws FileNotFoundException
    {
        Scanner fromFile = new Scanner(new File(filePath));
        
        while(fromFile.hasNextLine())
        {
            String line = fromFile.nextLine();
            values.add(line);
        }
        
        fromFile.close();
    }
    
    public void saveValues() throws FileNotFoundException
    {
        PrintWriter toFile = new PrintWriter(filePath);
        
        for(String value : values)
        {
            toFile.println(value);
        }
        
        toFile.close();
    }
}
