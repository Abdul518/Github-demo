package JavaTutorial;

public class constructor_example
{
    //Below is the Default constructor
    public constructor_example()
    {
        System.out.println("This is a constructor class");
        System.out.println("The object should be created in the main method for constructor");
        System.out.println("The constructor always get iniatilised whenever object is created");
        System.out.println("The constructor always have the same name as class");
        System.out.println("whenver you create an object constructor is called by default");
        System.out.println("Compiler will call the implicit (default) constructor ");
        System.out.println("constructor will not accept any return type");
        System.out.println("Generally constructors are used to define the variables or initiate some properties in real time");

    }
// Below is the example of parameterized constructor;

    public constructor_example(int a, int b)
    {
        int c =a+b;
        System.out.println(" This is a Parameterised  constructor class ");
        System.out.println(c);
    }

    public constructor_example(String s) {

        System.out.println(s);

    }

    public void This_method()
    {
        System.out.println("This is a method");
        System.out.println("In Method we always needs to declare the return type");
        System.out.println("To call the method an object should be created and it need to be called using the object");
        System.out.println("Whenever we use the return type it needs to be the same data type when return toward the end.");
        System.out.println("method will always needs to be defined return type");

    }

    // This is the main
    public static void main(String[] args)
    {
        // To call the default constructor we just need to create a object for the class.
        constructor_example ce = new constructor_example();


        //To call the parameterised constructor after initialisation we need to pass the parameters as below
        constructor_example cus = new constructor_example(2, 4);
        //To call the parameterised constructor after initialisation we need to pass the parameters as String

        constructor_example c = new constructor_example("This is String");
        // if you define any constructor java compiler won't check for any default constructor even one constructed in
    }
}