package Collection_framework;

import java.util.TreeMap;

// this is sorted list ,  which will get the output in ascending order acc to key values .

public class TreeMapDemo {
    public static void main(String[] args) {

        TreeMap tm = new TreeMap<>();
        tm.put(12,"Hello");
        tm.put(22,"World");
        tm.put(35,"Guten Morgen");
        tm.put(05,"Hallo");
        tm.put(960,"Bonjour");
        tm.put(12,"Hello france");
//      ht.put(null,"Emirates");     this null value is not allowed in hashtable .
        tm.put("Hello",66);
        System.out.println(tm+"\n");


    }
}
