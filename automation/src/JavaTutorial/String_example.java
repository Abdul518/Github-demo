package JavaTutorial;

public class String_example
{
public static void main(String args[]) {

    String str1 = "Payment £100 paid";
    //String is a predefined class present in the java
    // String is a class which contain methods on its own.
    //Create a object and call the methods present in the class with the help of the object
    //Generally we use this string syntax creating an object and calling the method with the help of object as below
    //........................  String so=new String(); normally this is how you declare and call the object
    str1.charAt(8); //This is how you extract at what index what is the value
    System.out.println("The value at the 8 index is   " + str1.charAt(8));

    //lets  say if we want to print the index then
    String str2 = " Payments $200 debited";
    str2.indexOf("$");
    System.out.println("The value at the $ index is "+str2.indexOf("$"));
    System.out.println("Contains"  +str2.contains("Payment"));
    System.out.println("The substring at the 10th index is  " +str2.substring(10));


}
}

