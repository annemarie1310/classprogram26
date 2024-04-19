package Exception_handelling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

class Emp{
    int empid;String name;
    public Emp(){
        empid=55;
        name="adrian";
    }
    public void Show(){
        System.out.println("employee : "+empid+" "+name);
    }

}
public class exception_demo2 {

    public static void main(String[] args) {

        // below is null pointer exception.
        Emp e=null;

        try {
            e.Show();
        }
        catch (NullPointerException c){
          //  c.printStackTrace();
            System.out.println("Null pointer exception Occurred ");
        }

        // below is file not found exception .
        FileInputStream file = null;
        try {
            file =new FileInputStream("C:\\Users\\dell\\Desktop\\B\\ATM1.java"); // valid file for this is ( ATM.java ).
            System.out.println("Reading the file");
            int ch =file.read();
            while (ch!=-1){
                System.out.print((char)ch);
                ch=file.read();
            }
        }
        catch (FileNotFoundException z){
            z.printStackTrace();
            System.out.println("file not found , check again ...");
        }
        catch (IOException z){
            z.printStackTrace();
            System.out.println("IO exception");
        }

        //finally block cleans the memory and of open resources .
        // finally block will always get executed no matter there is error or not .
        finally
        {
            System.out.println("closing the file .");
            try {
                if (file!=null) {
                    file.close();
                }
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        }




    }
}
