package JavaTutorial;

public class Arrray_RS
{
    public static void main(String[] args) {
        int c[]={2,5,8,7,4};
        int sum=0; // just declare sum as zero value data type integer you want to store value after increment
        for(int i=0; i<c.length;i++)
        {

          //This is the simple way to find out the value of i at the each index in for loop before incrementing
            System.out.println ("The value of i is " +c[i]);
            sum=sum+c[i];
            System.out.println("The sum of the array is " +sum);
        }
        System.out.println("The final value of the array is " +sum);

    }
}
