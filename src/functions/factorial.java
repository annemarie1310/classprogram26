package functions;

public class factorial {

    public void factorial(int num){
        int n, fact = 1;
//        System.out.println("enter a number of which u want the functions.factorial : ");
//        Scanner sc = new Scanner(System.in);
//        n=sc.nextInt();
        if(num<0)
        {
            System.out.println("negative number sorry ");
        }
        else {
            for (int i = 1; i <= num; i++)
            {
                fact = fact * i;
            }
            System.out.println("final functions.factorial is " + fact);
        }
    }



    public static void main(String args[])
    {

    factorial z = new factorial();
    z.factorial(0);


}}
