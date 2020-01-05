package JavaTutorial;

import java.util.*;
// Interview Question Difference between HashMap and HashTable
//          1.  Synchronisation  or Thread safe
//  HashMap is not synchronised and not Thread Safe
// HashTable is Synchronized and Thread Safe
//          2.  Null keys and null values
//HashMap allows one null key and any number of null values
//HasTable do not allow null keys and null values in the HashTable object.
//          3.Iterating the values
//HashMap object values are iterated by using the HashMap iterator.
//HashTable is the only class other than Vector which uses enumerator to iterate the values of HashTable object.#


public class HashTable_Example
    {
   public static void main(String[] args)
    {

        Hashtable<Integer,String> hm= new Hashtable<Integer, String>();
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




    }



}




