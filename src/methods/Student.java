package methods;

class Student1 {

    private int rollnumber;
    private String name ;
    private float percentage;

    public void initStudent(){
        rollnumber=32;
        name="pranay k";
        percentage=79.80F;


    }
    public void PrintDetails(){
        System.out.println("roll no -"+rollnumber+"\n"+"Name -"+name+"\n"+"percentage -"+percentage);
    }

}


public class Student {

    public static void main(String args[]){
        Student1 s1 =new Student1();
        s1.initStudent();
        s1.PrintDetails();

    }
}





