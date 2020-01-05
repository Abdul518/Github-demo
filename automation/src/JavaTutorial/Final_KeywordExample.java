package JavaTutorial;

public class Final_KeywordExample {


    final int i=4;

    // it is also called constant variable
    //whenever we declare a variable as final it cannot be changeed.
    //Even entire class can be also marked as final
    //Methods can also be declared as final
    // if we declare Class as Final we won't be able to inherit the properties
    // in simple words we cannot extend that class to inherit the parent class properties,the concept of inheritance
    // Let's say if we declare a method as final example below

// Interview Questions will be based on this, super, try, catch, finally
// ( finally is about try, catch exception once we execute try catch loop if there is any errors than
// control will go to block finally no matter script is passed or fail
// Final :  Final is about restricting access you cannot use that to attain the values
// public, private, protected,default, packages, import packages, interfaces, runtime polymorphism, strings
// Array has fixed length whereas arrayList can grow dynamically.
//Arrray list can accept duplicate values




    final void final_methodexample()
    {

        System.out.println("This method is declared as Final method ");
    }


    public static void main(String[] args)
    {
        /*Final_KeywordExample f = new Final_KeywordExample();
        f.final_methodexample();*/
    }

}