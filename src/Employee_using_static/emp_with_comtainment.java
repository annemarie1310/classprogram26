package Employee_using_static;

// containment gives advantage of reusability of code
// like here we have got joining dates from another class as MyDate.
// containment is object inside another object .

public class emp_with_comtainment
{


    public String name;
    private int employee_id ;
    protected double salary ;
    private  MyDate joiningDate;


    public emp_with_comtainment(){
        employee_id=1;
        name="allen";
        salary=50000;
        joiningDate=new MyDate(12,12,2018);
    }
    public emp_with_comtainment(int employee_id, String name, double salary, MyDate joiningDate){
        this.employee_id=employee_id;
        this.name=name;
        this.salary=salary;
        this.joiningDate=joiningDate;
    }

    public String toString()            // use of toString method is u can print directly the object in sysout ..
    {
        return name+" "+employee_id+" "+salary+" "+joiningDate;
    }

    public static void main(String args[]){
        emp_with_comtainment e1= new emp_with_comtainment();
        emp_with_comtainment e2= new emp_with_comtainment(2,"anna",40000,new MyDate());
        emp_with_comtainment e3= new emp_with_comtainment(3,"John",80000,new MyDate());
        System.out.println(e1+"\n"+e2+"\n"+e3);
    }
}
