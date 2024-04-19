package Final_keyword;

/*
The final keyword in java is used to restrict the user. The java final keyword can be used in many context. Final can be:
variable
method
class
1) The final keyword can be applied with the variables, a final variable that have no value it is called
   blank final variable or uninitialized final variable. It can be initialized in the constructor only.
2) The blank final variable can be static also which will be initialized in the static block only.
3) We will have detailed learning of these. Let's first learn the basics of final keyword.


*/


class Bike9 {
    final int speedlimit = 90;//final variable

    void run() {
    //    speedlimit = 400;   // so here -- error cauz we cannot change value of the final variable .
    }

}

class Bike{
    final void run(){System.out.println("running");}
}

class Honda extends Bike {
//    void run()
    {
       // System.out.println("running safely with 100kmph");  // so here -- error cauz final method cannot be overridden .
    }
}


final class Bike1{}
/*
class Honda1 extends Bike1  // so here -- error cauz we cannot extend the final class .
{
    void run() {
        System.out.println("running safely with 100kmph");
    }
}
*/

    public class final_keyw {

        public static void main(String[] args) {

        }

    }
