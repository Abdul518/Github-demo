package JavaTutorial;

import java.util.HashSet;
import java.util.Iterator;

public class Hashset_IteratorExample
{
    // Iterator is traverse or move every index in the HashSet;
    // Syntax for HashSet                 HashSet<String> hs = new HashSet<String>();

    public static void main(String[] args)
    {

        // HashSet treeset, LinkedHashset implements set interface;
        //Set Interface does not accept duplicate values
        // Example mobile recharge where someone recharge the mobile but if it is again passed it will be rejected;
        //Example Items added to your cart one is added ......
        //There is no guarantee that elements stored in sequential order it could be random

        // Syntax for Hashset         HashSet <Integer> hs = new HashSet<Integer>();

        HashSet<String> hs = new HashSet<String>();

        hs.add("USA");
        hs.add("UK");
        hs.add("India");
        hs.add("he");
        hs.add("she");


       hs.add("India"); // it is not allowing the duplicate values whereas in ArrayList this can be possible

        System.out.println(hs);

        // Remove any object from the HashSet
       /* hs.remove("India");
        System.out.println("After removing the String Answer is "+ hs.remove("UK"));*/

        hs.isEmpty();
        System.out.println("Check HashSet is empty "+hs.isEmpty());
        hs.size();
        System.out.println("Size of the HashSet is "+hs.size());
        hs.contains("USA");
        System.out.println("Contains " +hs.contains("USA"));

        //This is the Syntax for Iterator         Iterator<String> i= hs.iterator();
        Iterator<String> i= hs.iterator();
        System.out.println("This is iterator value " +i.next());

        System.out.println("This is second iterator value " +i.next());

        // lets say if we need to traverse or print next 99 values in the index how will you do that
        while (i.hasNext())
        {

            System.out.println(i.next());

        }



    }




}





