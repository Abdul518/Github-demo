package JavaTutorial;

import org.openqa.selenium.json.JsonOutput;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMap_Example
// This interface takes the value in the form of key value pairs
// Syntax for HashMap is    HashMap hm= new HashMap();
// Example          HashMap<Integer,Integer> hm= new HashMap<Integer,Integer>();
{

    public static void main(String[] args)
    {

        HashMap<Integer,String> hm= new HashMap<Integer,String>();
        hm.put(0,"Hello"); // key, value
        hm.put(1,"GoodBye");
        hm.put(2,"Morning");
        hm.put(3,"Evening");
        System.out.println(hm.get(2));
        System.out.println(hm.remove(2));
        System.out.println(hm.remove(2));

// when we use  Entry set each & every value to be used as set see below
        Set sn =hm.entrySet();

        Iterator it= sn.iterator();

        while (it.hasNext())
        {

            Map.Entry mp= (Map.Entry) it.next();

            System.out.println(mp.getKey());
            System.out.println(mp.getValue());
        }


// Interview hashtable -pass table set collections

    }



}
