import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

/**
 * PropertiesDemo
 * 学习 Propertes ,,
 */
public class PropertiesDemo {

    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        properties.put("admin", "1234");
        properties.put("deli", "12345");
        properties.put("admin1", "123400");
        properties.put("megoo", "0000");
        System.out.println(properties);

        properties.store(new FileWriter("users.properties"), "this is a users!");
    }
}