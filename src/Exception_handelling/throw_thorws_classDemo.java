package Exception_handelling;

import java.io.FileInputStream;
import java.io.IOException;

public class throw_thorws_classDemo {

    // throws is always written to the method to inform the user that this method will throw a error.
    // and then it is liability of user to call the method surrounded by try and catch.
    // below we are writing the method as static showing that we can call the method without making a object.
    public static void read() throws IOException
    {

            FileInputStream file = new FileInputStream("C:\\Users\\dell\\Desktop\\B\\ATM1.java"); // valid file for this is ( ATM.java ).
            System.out.println("Reading the file");
            int ch = file.read();
            while (ch != -1) {
                System.out.print((char) ch);
                ch = file.read();
            }

    }


    public static void main(String[] args) {
        try {
            System.out.println("reading the file");
            read();
        } catch (IOException e) {
            System.out.println("file not found");
            throw new RuntimeException(e);

        }

    }
}
