package ToString;

class Employee {

    public String name;
    private int employee_id ;
    protected double salary ;



public String toString()            // use of toString method is u can print directly the object in sysout ..
{
    return name+"\n"+employee_id+"\n"+salary+"\n";
}

}
public class EmployeeDetails {
    public static void main(String args []){

        Employee e1=new Employee();
        System.out.println(e1);       // ..like over here .

    }

}




