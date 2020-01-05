package JavaTutorial;

public class Child_class
    {
        int a=20; int b=10; int c=5;

        public void add()
        {
            int add = a+b+c;
            System.out.println("The addition of 3 integers is " + add);

        }

        public int sub()
        {
            int sub = a-b-c;
            // System.out.println("The subtraction of 3 integers is" + sub);

            return sub;
        }




        public int mul()
        {
            int mul = a * b * c;
            //  System.out.println("The multiplication of 3 integers is" + mul);

            return mul;
        }



        public int div()
        {
            int div = a/c;
            //  System.out.println("The division of 3 integers is" + div);

            return div;
        }


        public String ValidateHeader()
        {

            System.out.println("validate Head");

            return "pass";

        }

        public String Password()
        {

            return "password";

        }


    }



