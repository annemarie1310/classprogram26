package containment_account;

import Employee_using_static.MyDate;

public class DateMain {

    public static void main(String args []){
        Account a2= new Account(2000506,"Sara",100055,new MyDate());
        System.out.println(a2);

        Student s2= new Student(35,"Zarin",new containment_account.MyDate(15,9,2022));
        System.out.println(s2);
    }


}
