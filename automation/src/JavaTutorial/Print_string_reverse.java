package JavaTutorial;

public class Print_string_reverse {
    public static void main(String[] args) {
        // How to print the string in reverse
        //Print the unique number from the list - Amazon
        // palindrome is the string if you print reverse as well still it is same

        String s = "MADAM";
        //String s = "QADEER";
        String t = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            //System.out.println(s.charAt(i));
            t = t + s.charAt(i);
            System.out.println("Tha value of t at o index is   " + t);
        }

        System.out.println(" The REVERSE STRING IS  " + t);

        if (s == t);
        {


            System.out.println("The string is same after reverser it is called palindrome " + s + t);
        }

    }
}

