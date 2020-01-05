package JavaTutorial;

import com.google.common.collect.ArrayListMultimap;

import java.util.ArrayList;

public class Array_List_Example
{
    public static void main(String[] args)
    {

        // Syntax for ArrayList is ArrayList a = new ArrayList();
        // Three Types of ArrayList  [ ArrayList, LinkedList, Vector] Implementing List Interface
        // Important point about ArrayList is it also accept the duplicate values.
        // If we need to declare the variable as a integer than we should do it as below
        // Array has fixed length whereas ArrayList can grow dynamically;
        //you can access and insert any values at any index in the ArrayList;

        ArrayList <Integer> a = new ArrayList <Integer>();
        // If we need to declare the variable as a String than we should do it as below
        ArrayList <String> s=new ArrayList <String>();

        // In ArrayList you can increase or decrease the size of the array by adding or deleting from the ArrayList
        //Whereas in Array, the size of the Array is Fixed you cannot add or delete;
        //ArrayList is dynamic in size that means it can be increased or decreased in size

        // Important point about ArrayList is it also accept the duplicate values.
        // Lets say if i need to add a string to this variable s than?
        s.add("String 1");
        s.add("String 2");
        s.add("String 2");

        System.out.println(s);
        s.add(0,"String 0");
        System.out.println(s);

        /*
        s.remove(0);// you can remove either with the index value
        s.remove("String 2");// you can also remove with the help of the string value

        s.removeAll(s);
        System.out.println(s);

         */
        s.get(2);
        System.out.println("print what value is present on index 3 " +s.get(2));

        // I want to verify whether this string is present in the ArrayList;

        System.out.println(" Verify string name String 1 is present in ArrayList  "+ s.contains("String 1"));

        // what index String 2 is present in the Array list
        System.out.println("At what index it is present " +s.indexOf("String 2"));

        // Checking if the ArrayList is Empty or not?
        s.isEmpty();
        System.out.println( "Print is the ArrayList is empty "+s.isEmpty());
        // Size of the ArrayList
        s.size();
        System.out.println("Size of the ArrayList is " +s.size() );

    }



}
