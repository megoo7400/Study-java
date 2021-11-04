import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo1 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        Properties properties = new Properties();
        System.out.println(properties);
        properties.load(new FileReader("users.properties"));
        System.out.println(properties);

        String rs = properties.getProperty("megoo");
        System.out.println(rs);
    }
}
