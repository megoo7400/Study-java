import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;

public class CharSetTest {
    public static void main(String[] args) {
        try (
            Reader fr = new FileReader("Study-java.iml");
            BufferedReader br = new BufferedReader(fr);

        ){
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (Exception e) {
            // 
            e.printStackTrace();
        }
    }

    // InputStreamReader(InputStream, charactar  编码)  --- OutputSteamWriter(同前...)

}
