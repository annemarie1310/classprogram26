package Employee_using_static;

public class employee_using_static {

    int empid;
    String name;
    double salary;
     static  int count;
    static String company_name;
     static int empIdauto;

     static {
         empIdauto=1;
     }
    public employee_using_static(){
        this(employee_using_static.empIdauto,"josh",50000);
    }
    public void  autoemp(){
        this.empIdauto=empIdauto;
        empIdauto++;
    }
    public employee_using_static(int empid , String name , double salary){
        this.empid=empIdauto++;
        this.name=name;
        this.salary=salary;
        this.count=count;
        System.out.println(empid+" "+name+" "+salary);
    }
    public static void showcount()
    {
        System.out.println("the total count is  : "+count);
    }
    public static void assign_company(String company_name1)
    {
        company_name=company_name1;
        System.out.println(company_name1);
    }


    public static void main(String args []){
        employee_using_static.assign_company("Infosys");

        employee_using_static e1 = new employee_using_static();
        employee_using_static e2 = new employee_using_static(employee_using_static.empIdauto,"anne",60000);
        employee_using_static e3 = new employee_using_static(employee_using_static.empIdauto,"marie",55000);
        employee_using_static.showcount();    // static is called using class name .


    }}
