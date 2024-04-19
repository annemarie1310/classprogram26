package Inheritece;

class Employee {

    public String name;
    private int employee_id ;
    protected double pf,pt,hra,da ;
    protected double salary ;
    // protected available anywhere in the package and in different package with inherited classes.

    public Employee(){
        this(1,"Adrian",50000);
    }

    public Employee(int employee_id, String name, double salary){
        this.employee_id=employee_id;
        this.name=name;
        this.salary=salary;
        hra=salary*0.5;
        pf=salary*0.12;
        pt=200;
        da=salary*0.13;

    }

    public double calculatesalary(){
        return salary+hra+da-pf-pt;
    }
    public String toString()
    {
        return name+" "+employee_id+" "+salary;
    }

}


class Developer extends Employee {

    private int noOfProjects;
    private int ProjectIncentive;

    public Developer() {
        noOfProjects = 10;
        ProjectIncentive = 15000;
    }

    public Developer(int employee_id, String name, double salary, int noOfProjects, int ProjectIncentive) {
        super(employee_id, name, salary);  // using super class here default constructor of super class is compulsory.
        // super constructor call should be first in sub class .
        this.noOfProjects = noOfProjects;
        this.ProjectIncentive = ProjectIncentive;
    }

    public String toString() {
        return "Developer = " + super.toString() + " " + noOfProjects + " " + ProjectIncentive;  // here we want info of Employee so we used Super keyword.
    }

    public double calculateIncentive() {
        if(noOfProjects * ProjectIncentive>salary*0.5){
            return salary*0.5;
        }
        else {
            return noOfProjects * ProjectIncentive;
        }
    // the above if else block is to restrict the incentive of the employee to the 50 percent of the basic salary .
        //means we are restricting the incentive to it should not be more than 50% of the salary .
    }
    public double calculatesalary()  // this method overrides & done through polymorphism .
    {
        return super.calculatesalary()+calculateIncentive();
    }
}



class testAbove {
    public static void main(String args[]) {
        // Employee e1=new Employee();
        Developer d1 = new Developer();
        Developer d2 = new Developer(2, "Jacob", 25000, 5, 7500);
        //System.out.println(e1+"\n"+e1.calculatesalary());
        System.out.println("\n" + d1 + "\nd1 Total salary : " + d1.calculatesalary());
        System.out.println("\n" + d2 + "\nd2 Total salary : " + d2.calculatesalary());
    }
}
