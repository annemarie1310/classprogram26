package Collection_framework.collectionPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Account implements Comparable {

     int account_no;
     String owner_name,accountType;
     double balance,intrestRate;

    public Account() {
        account_no = 11200;
        owner_name = "Adam";
        balance = 50000;
        accountType = "savings";
        intrestRate = 5.5;
    }

    public Account(int account_no, String owner_name, double balance, String accountType, double intrestRate) {
        this.account_no = account_no;
        this.owner_name = owner_name;
        this.balance = balance;
        this.accountType = accountType;
        this.intrestRate = intrestRate;
    }


    public String toString() {
        return "Accno : " + account_no + ", name : " + owner_name + ", Balance: " + balance + "AccountType : " + accountType + "Intrest rate :" + intrestRate;
    }

    @Override
    public int compareTo(Object o) {
        if (this.account_no>((Account)o).account_no)
            return 1;
        else if ((this.account_no<((Account)o).account_no))
            return -1;
        else
            return 0;
    }



    public static void main(String[] args) {
        ArrayList<Account> a1 = new ArrayList<>();
        a1.add(new Account());
        a1.add(new Account(35244, "Pranay", 555500, "Savings", 5.5));
        a1.add(new Account(24488, "Lorry", 44000, "Current", 2.5));
        a1.add(new Account(46565, "Harry", 77705, "Saving", 5.5));
        a1.add(new Account(3588, "Josh", 80000, "Current", 2.5));
        a1.add(new Account(3996, "Nate", 90000, "Savings", 5.5));




Collections.sort(a1);
        Iterator <Account>it = a1.iterator();
//        while (it.hasNext()) {
//            System.out.println(it.next());
//        }


        //  BELOW:- program to find a particular account in the list through account number .

        System.out.println("Bank System\n1. Show all\n"+"2.Search\n"+ "3.");
            Scanner s=new Scanner(System.in);
        System.out.println("Enter your choice");
        int choice= s.nextInt();
        switch (choice){
            case 1:
                     while (it.hasNext()) {
                    System.out.println(it.next());
                    }

            case 2:
                // sorting code
                Iterator<Account>it1=a1.iterator();
                System.out.println("before sort");
                while (it1.hasNext()){
                    System.out.println(it1.next());
                }
                Collections.sort(a1);
                it=a1.iterator();
                System.out.println("\nAfter sort");
                while (it.hasNext()){
                    System.out.println(it.next());
                }
                break;
            default:
                System.out.println("Not found");
                break;

            }


    }

}//end main class
