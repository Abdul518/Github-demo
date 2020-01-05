package JavaTutorial;

import java.util.ArrayList;

//              Print the unique number from the list   -Amazon
public class Collection_Demo
{


    public static void main(String[] args)
    {
        int a []={4,5,5,5,4,6,6,9,4};

/*      Lets say you have been given an array and asked to print the unique number from the array
        and how many times the numbers are repeated in an array

        4 is repeated 3 times
        5 is repeated 3 times
        6 is repeated 2 times
        9 is repeated 1 times

        Let's create Empty ArrayList


 */
        ArrayList<Integer> ab= new ArrayList<Integer>();
        for (int i=0; i<a.length; i++)
        {
            int k=0;

            if(!ab.contains(a[i]))
            {
             ab.add(a[i]);
             k++;

                for (int j=i+1; j<a.length; j++)
                {
                    if (a[i]==a[j])
                    {
                        k++;
                    }
                }

                System.out.println(a[i]);
                System.out.println(k);

                if(k==1)
                {
                    System.out.println(a[i]+ "Unique Number");
                }

            }


        }






    }







}
