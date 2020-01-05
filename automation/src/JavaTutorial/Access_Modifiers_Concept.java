package JavaTutorial;

public class Access_Modifiers_Concept
{

/*  Access Modifiers: WE HAVE 4 ACCESS MODIFIERS (PPD)
                                                        PUBLIC, PRIVATE, PROTECTED, DEFAULT.

    Default : Access Modifier
    If we don't declare any access modifier than Java compiler thinks it is a default access modifier
    eg. void abc() { System.out.println (" This is a default access modifier");}
    Which means you can only access methods anywhere in package but once you move out of the current package
    and enter into another package you cannot access this method present in this package as you haven't
    delcare it as a public access modifier.

    Public : Access Modifier
    If we declare method as public than you will have access to the methods / variables present in this package
    or even outside the package by importing the package into the current package and accessing the required
    methods needed from the required package.

    Private : Access Modifier
    If we declare the class any method or variable  as private than we cannot access method or variables outside the class
    Example as CreditCard or Payments go as private as you don't want to give that access anywhere outside the class
    In real time scenerio when doing the frameworks you don't want to change its value so we can declare it as private

    Protected : Protected Modifier
    If we declare variable/method as protected you can access all the methods & variables
     + sub classes(other packages). i.e e.g below
     In other package we need to extend the parent class using the inheritance concept only for the parent class
     in the child class.


*/
void abc()
{
    System.out.println (" This is a default access modifier");
}

public void def()
{
    System.out.println("This is a Public access modifier");
}






}
