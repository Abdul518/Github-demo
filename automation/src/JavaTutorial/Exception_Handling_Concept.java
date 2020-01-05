package JavaTutorial;

public class Exception_Handling_Concept {




    public static void main(String[] args)
    {
        int a = 4;
        int b = 7;
        int c = 0 ;

/* Try & Catch Block  (Exception)
    Let's say we need to handle a pop up on the website on christmas day where a pop will display and we
    use automation to handle it next day boxing day there is no pop up so our concept will fail
    To handle this situation we use try & catch blocks what it means is in
    Try{ } Block handle the the pop up if there is no pop up
    Catch{} Block will handle this issue ( Retry with other method)

    Try should be immediately followed by catch block;

    Point to remember here is one try block can be followed by mutliple catch blocks
*/

        try

        {
            int k = b / c;

            System.out.println(k);

           /*       int arr[]=new int[5];
                    System.out.println(arr[7]);             */

        }
        catch (ArithmeticException et) // This is Arithmetic Exception catch block to catch any Arithmetic errors
        {
            System.out.println(" I have catched the Arithmetic Exception");
        }
        catch(IndexOutOfBoundsException ioe)
        {
            System.out.println("I have catched the IndexoutofBound Exception");
        }


        catch(Exception e)// This is general Exception catch block to catch any error.
        {
            System.out.println("I catched the Error or Exception");

        }


/*      Below finally block is excecuted irreespective of exception error thrown or not.
        Even the script got fail finally blocks still get executed that's the beauty of finally block
        Let's in automation if we need to clear the cookies or close the browser even though the automation
        script fails. It serves really a good way to handles this sort of issues.

        Interview Question:
                            Is there anyway finally block won't get excecuted
        Answer          :   only when we forcibly stop the JVM compiler when it is executing the code.
*/
        finally
        {
            System.out.println("This finally blocks is used to excecute another task even though the script pass or fail ");
            System.out.println("To Delete the Cookies");
        }

/*
       Exception_Handling_Concept eh = new Exception_Handling_Concept();
       eh.get_data();
*/

    }
}
