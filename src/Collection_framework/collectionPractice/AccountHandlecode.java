package Collection_framework.collectionPractice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class AccountHandlecode {
    public static void ShowAccounts(ArrayList a1) {
        Iterator it = a1.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }

    public static void SearchAccountCode(ArrayList a1) {
        System.out.println("enter account no to be searched");
        Scanner sc = new Scanner(System.in);
        int temp = sc.nextInt();
        Iterator<Account> it = a1.iterator();
        boolean found = false;
        Account a = null;
        while (it.hasNext()) {

            if (it.next().account_no == temp) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("Account Found");
        } else {
            System.out.println("Not Found");
        }

//
//        case2:
//        System.out.println("Enter name to be searched");
//        String name=sc.nextLine();
//        while (it.hasNext()){
//            a=it.next();
//            if (a.owner_name.equals(name)){
//                found=true;
//                break;
//            }
//        }break;
//        System.out.println("Wrong entry...");break;
//
//        default:
//
//
//
//
    }
}