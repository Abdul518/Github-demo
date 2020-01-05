package JavaTutorial;

import java.util.HashSet;

public class Hashset_Example
{

    public static void main(String[] args)
    {

        // HashSet treeset, LinkedHashset implements set interface;
        //Set Interface does not accept duplicate values
        // Example mobile recharge where someone recharge the mobile but if it is again passed it will be rejected;
        //Example Items added to your cart one is added ......
        //There is no guarantee that elements stored in sequential order it could be random

        // Syntax for Hashset         HashSet <Integer> hs = new HashSet<Integer>();

        HashSet <String>hs = new HashSet<String>();
        hs.add("USA");
        hs.add("UK");
        hs.add("India");

        hs.add("India"); // it is not allowing the duplicate values whereas in ArrayList this can be possible

        System.out.println(hs);

        // Remove any object from the HashSet
        hs.remove("India");
        System.out.println("After removing the String Answer is "+ hs.remove("UK"));
        hs.isEmpty();
        System.out.println(hs.isEmpty());
        hs.size();
        System.out.println(hs.size());
        hs.contains("USA");
        System.out.println(hs.contains("USA"));




    }




}
