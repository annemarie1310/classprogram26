package functions;

public class avgOfintergerInput {







}

class testfunction {

    public static void main(String[] args) {
        int arr []=new int[10];
        arr[0]=10;
        arr[1]=100;
        arr[2]=20;
        arr[3]=30;
        arr[4]=40;
        arr[5]=50;
        arr[6]=60;
        arr[7]=70;
        arr[8]=80;
        arr[9]=90;
        int sum=0;
        for (int i=0;i<arr.length;i++)
             {
                System.out.println(arr[i]);
                sum=sum+arr[i];
        }
        System.out.println(sum);
        System.out.println("avg of the above array is : "+sum/arr.length);
    }



}
