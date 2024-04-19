package Collection_framework;

import java.util.Hashtable;

public class HashTableDemo {

    public static void main(String[] args) {
        Hashtable ht = new Hashtable<>();
        ht.put(12,"Hello");
        ht.put(22,"World");
        ht.put(35,"Guten Morgen");
        ht.put(05,"Hallo");
        ht.put(960,"Bonjour");
        ht.put(12,"Hello france");
        //   ht.put(null,"Emirates");     this null value is not allowed in hashtable .
        ht.put("Hello",66);
        System.out.println(ht+"\n");



    }

}
