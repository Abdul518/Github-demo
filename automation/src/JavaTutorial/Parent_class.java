package JavaTutorial;

public class Parent_class {
    public static void main(String[] args) {


        // classname object = new classname();
        //objectname.methodname();
        Child_class s = new Child_class();
        s.add();
        System.out.println("The subtraction of 3 integers is   " +s.sub());
        System.out.println("The multiplication of 3 integers is   " +s.mul());
        System.out.println("The division of 2 integers is   "+s.div());
        System.out.println(s.ValidateHeader());
        s.Password();


    }
}
