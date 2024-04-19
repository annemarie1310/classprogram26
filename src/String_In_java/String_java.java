package String_In_java;

public class String_java {

    public static void main(String[] args) {

        // here str1 and str2 both strings are same, so it is stored in String pool
        // means both str1 and str2 are pointing to the same String memory which is in String pool.

        String str1="Hello";
        String str2="Hello";


        // here below if we try to concatenate the existing the string it will create a new object and allocate new memory .
        //str1=str1+"World";


        // below if else using logic .
        if(str1==str2){
            System.out.println("Both strings are same ");
        }
        else {
            System.out.println("Both strings are different ");
        }

        // if else using inbuilt function which is ( .equals )
        if(str1.equals(str2)){
            System.out.println("Both Strings are same");
        }
        else {
            System.out.println("Both strings are different ");
        }



        // below is how you can pass the string to the switch case .
        String choice ="red";
        switch (choice){

            case "red":
                System.out.println("red");
            case "blue":
                System.out.println("blue");
            default:
                System.out.println("wrong choice ");

        }

    }
}
