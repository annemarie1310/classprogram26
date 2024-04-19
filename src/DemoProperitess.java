import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class DemoProperitess {
    public static void main(String[] args) throws IOException {

        Properties p =new Properties();
        FileInputStream fi =new FileInputStream("prop1.properties");
        p.load(fi);
        String s1=p.getProperty("User");
        System.out.println(s1);
        String s2=p.getProperty("Password");
        System.out.println(s2);

    }
}
