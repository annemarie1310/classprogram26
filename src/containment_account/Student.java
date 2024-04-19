package containment_account;

public class Student {

    private int rollnumber;
    private String name ;
    private MyDate joiningDate;

    public  Student(){
        rollnumber=32;
        name="pranay k";
        joiningDate=new MyDate(5,8,2022);
    }
    public  Student(int rollnumber,String name,MyDate joiningDate){
        this.rollnumber=rollnumber;
        this.name=name;
        this.joiningDate=joiningDate;

    }
    public String toString(){
        return "Roll no : "+rollnumber+" Name : "+name+" JoinDate : "+joiningDate;
    }

    public static void main(String args []){
        Student s1= new Student();
        Student s2= new Student(33,"Josh",new MyDate(13,10,2022));
        Student s3= new Student(34,"Adam",new MyDate(14,10,2022));
        System.out.println(s1+"\n"+s2+"\n"+s3);
    }
}
