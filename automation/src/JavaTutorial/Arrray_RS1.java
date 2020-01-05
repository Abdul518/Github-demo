package JavaTutorial;
// Printing the index of desired number in the array using the for loop and if condition
public class Arrray_RS1
{
    public static void main(String[] args) {
        int c[]={2,5,8,7,4};
        for(int i=0; i<c.length;i++)
        {
          //This is the simple way to find out the value of i at the each index in for loop before incrementing
            System.out.println ("The value of i at this index is  " +c[i]);

            if (c[i]==7)
            {
                System.out.println("7 is stored at this index in an array " + i);
             //break is used to stop the test once our result is fetched or purpose is served to optimise the code.
                break;
            }
        }

    }
}
