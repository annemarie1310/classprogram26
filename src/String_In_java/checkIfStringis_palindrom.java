package String_In_java;

import java.util.Scanner;

public class checkIfStringis_palindrom {

    public void palindrom(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string 1 ");
        String input1 =sc.nextLine();
        String s=input1;
        int i;
        String temp="" ;
        for (i=input1.length()-1;i>=0;i--){
             temp =temp+input1.charAt(i);
        }
        if(temp.equals(s)){
            System.out.println("is palindrom");
        }
        else
            System.out.println("not palindrom");

        System.out.println(input1.length());  //  this how we can display length of the String .
    }

}

class test {
    public static void main(String[] args) {

        checkIfStringis_palindrom p=new checkIfStringis_palindrom();
        p.palindrom();


    }


}
