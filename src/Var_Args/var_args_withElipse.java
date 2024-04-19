package Var_Args;

public class var_args_withElipse {

    public void addit(String name, int... nums)  //   (...) the 3 dots after int makes the input variable.... also called as varArgs variable arguments..
    // in one method only 1 varArgs can be used nad only handles 1 data type  .
    // if we have more than 1 arguments to pass  the varArgs should be at last .
    {
        int sum = 0;
        for (int temp : nums) {
            sum += temp;
        }
        System.out.println("Addition is " + sum);
    }
}

class StudentwithvarArgs {

    public void Stud(String name,int...marks){
        int sum=0;
        for (int temp:marks) {
            sum+=temp;
        }
        System.out.println("\nName of student is "+name+"\nTotal Marks are : "+sum);
        System.out.println("avg marks are "+sum/ marks.length);
        System.out.println("\n");
    }

}

class test {
    public static void main(String args[]) {
        var_args_withElipse a1 = new var_args_withElipse();
       // a1.addit("Anna", 1, 2, 1, 2, 1, 2, 122);  // here while we make and object and pass the arguments we can pass as many as arguments as we want .
        //a1.addit("Josh", 10, 20, 10, 20, 10, 20);


        StudentwithvarArgs s1 = new StudentwithvarArgs();
        s1.Stud("marie",55,55,57,76,90,80);
        s1.Stud("Bear",59,65,87,72,50,70);
        s1.Stud("Bill",80,85,67,70,60,90);
    }
}

