package datastorage;

import java.io.FileNotFoundException;

public class DSRunner
{
    public static void main(String[] args) throws FileNotFoundException
    {
        DataStorage ds = new DataStorage("documents/demo.txt");
        ds.addValue("hamster");
        ds.addValue("fish");
        ds.addValue("pig");
        ds.saveValues();
        
        DataStorage ds2 = new DataStorage("documents/demo.txt");
        ds2.loadValues();
        System.out.println(ds2.getValues());
    }
}