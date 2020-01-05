package JavaTutorial;
// inheriting the properties of the parent class using the key word extend Inheritance concept
public class Super_ChildDemo extends Super_ParentDemo
{
   String name ="QAClickacademy.com";
    public void getlocaldata()
    {

        System.out.println(name);
        System.out.println(super.name);
        System.out.println("Whenever we use the super word it always referes to the parent class variables");
        System.out.println("whenever we use local variable it referes to local variable");
        System.out.println("super keyword is used to differentiate betweent the child & parent class");
 //Whenever there is a duplicate string/ or any data type present if we need to inherit the parent properties
 //than we can inherit the parent properties by using the word super to inherit parent class

    }

// Now we see how to use the super keyword if child or parent has the same method present in the class.

    public void getData()
    {

       System.out.println("This method is present in the Child Class");
       super.getData();


    }

// Now we will see how to deal with constructors with the same name & properties in the parent & child class

    public Super_ChildDemo()
    {

        super(); // There is one rule whenever we call a constructor in the child class for the parent class
                // super(); should always be at the first line.
        System.out.println("This is the constructor present in the Child Class");

    }



    public static void main(String[] args)
    {

        Super_ChildDemo sc = new Super_ChildDemo();
        sc.getlocaldata();

// Whenever there is a conflict or duplicate string present it always give preference to local class or variable present

       sc.getData();


    }
}
