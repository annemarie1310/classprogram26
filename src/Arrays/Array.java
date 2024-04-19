package Arrays;

public class Array {

    public static void main(String args []){
    int arr[]={10,20,30,45,55,65,70};   // type 1 to declare array

    int arr1[]=new int[2];             // type 2 to declare array
    arr1[0]=5;    arr1[1]=15;
/*
    for(int i=0;i< arr.length;i++)  // to display type 1 array elements.
    {
        System.out.println(arr[i]);
    }
    System.out.println("\n");

        for(int i=0;i< arr1.length;i++)  // to display type 2 array elements.
        {
            System.out.println(arr1[i]);
        }
    System.out.println("\n");

        for (int temp :arr)            // this is called for each loop .
        {
            System.out.println(temp);
        }
*/
        for (int temp :arr)            // to print odd numbers in above array .
        {
            if(temp%2!=0){
                System.out.println(temp);
            }
        }




    }
}
