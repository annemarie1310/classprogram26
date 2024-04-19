package JavaGenerics;


//     BELOW PROGRAM SHOULDN'T BE WRITTEN (no generics and no type safety ) .
class Gen{

    Object obj ;
    Gen(Object ob){
        obj=ob;
    }
    public Object getObj(){
        return obj;
    }

}


public class JavaGenericsDemo {

    public static void main(String[] args) {

        Gen g1 = new Gen(5);                 //Upcasting
        Integer i1 =(Integer)g1.getObj();       // Downcasting .
        System.out.println(i1);

        Gen g2 = new Gen ("Welcome");       //Upcasting
        String i2 =(String)g2.getObj();       // Downcasting .
        System.out.println(i2);

        g1=g2;      // this assignment is not possible . //  here it will not show any error even though g1 is integer and g2 is String .
        //  so this does not provide type safety .

        Integer i3 =(Integer) g1.getObj();
        System.out.println(i3);




    }


}
