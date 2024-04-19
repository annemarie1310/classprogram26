package Collection_framework;

import java.util.ArrayList;
import java.util.Iterator;

public class IterratorDemo {
    public static void main(String[] args) {

        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();

        l1.add(6);
        l1.add(7);
        l1.add(4);
        l1.add(6);
        l1.add(0, 5);    // here we add two number at same position then the last added num will be first .
        l1.add(0, 1);   //  like here 1 will be stored at 0th index .

        l2.add(15);
        l2.add(65);
        l2.add(25);


        // Iterator is used to get all the output on the next line .
        Iterator it = l1.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
