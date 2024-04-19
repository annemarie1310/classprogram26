package containment_account;

import Employee_using_static.MyDate;

public class Account {

    private int account_no;
    private String owner_name;
    private double balance;
    private MyDate AccountOpeningDate;

    public Account(){
        account_no=11200;
        owner_name="Adam";
        balance=50000;
        AccountOpeningDate=new MyDate(1,1,2023);

    }
    public Account(int account_no,String owner_name,double balance,MyDate accountOpeningDate){
        this.account_no=account_no;
        this.owner_name=owner_name;
        this.balance=balance;
        this.AccountOpeningDate=accountOpeningDate;

    }

    public String toString(){
        return "Accno : "+account_no+", name : "+owner_name+", Balance: "+balance+", AcopenDate: "+AccountOpeningDate ;
    }

    public static void main(String args []){
    Account a1= new Account();
        Account a2= new Account(2022511,"John",100000,new MyDate());
        Account a3= new Account(45225,"Brian",60000,new MyDate(5,6,2022));
        System.out.println(a1+"\n"+a2+"\n"+a3);

    }

}
