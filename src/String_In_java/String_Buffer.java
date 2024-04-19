package String_In_java;

public class String_Buffer {

    public static void main(String[] args) {

        StringBuffer sb1=new StringBuffer("Pune");
        StringBuffer sb2=new StringBuffer("Pune");
        System.out.println(sb1+" "+sb2);
        if(sb1==sb2){
            System.out.println("both are same");
        }
        else System.out.println("both strings are different");

        if (sb1.equals(sb2))    // here .equal function is not checking because .equal function doesn't work in StringBuffer.
        {
            System.out.println("both are same");
        }
        else {
            System.out.println("both strings are different"); // by default it will give this output .
        }

        sb1.append(" is a city");  // if we want ot concatenate a string to existing we will have to use .append function.
        System.out.println(sb1);
    }
}
