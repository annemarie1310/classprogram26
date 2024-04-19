package Exception_handelling;

import java.util.InputMismatchException;
import java.util.Scanner;

// we write 1 try and many catch when our 1 program may throw more than 1 error .
// so to catch all those errors we write more than 1 catch .
// also called as  : - SINGLE TRY MULTIPLE CATCH .

public class Specific_exception_handelling {

    public static void main(String[] args) {

        int marks []=new int[3];
        marks[0]=10;
        marks[1]=100;
        marks[2]=90;

        Scanner sc =new Scanner(System.in);
        System.out.println("enter the array index ");
        int ind = sc.nextInt();
        int num;

        try {
            System.out.println("enter a number by which you want to divide the array number ");
            num = sc.nextInt();

            System.out.println("the value at the index you entered is  : "+marks[ind]);
            System.out.println("the result is  : "+marks[ind]/num);
        }
        catch (ArithmeticException e){
            System.out.println("Arithmetic exception occurred :");
            System.out.println(e);
        }
        catch (IndexOutOfBoundsException e){
            System.out.println("index out of bound :");
            System.out.println(e);
        }
        catch (InputMismatchException e){
            e.printStackTrace();              // e.printStackTrace(); print's the error occurred .
            System.out.println("Input mismatch ( wrong input ) error occurred ");
        }
        // if we are writing multiple catch then Exception catch should always be at last of all catches.
        // it handles all exception which are not handled above .
        catch (Exception e)
        {
            System.out.println("Some other error occurred ");
            System.out.println(e);
        }

    }
}
