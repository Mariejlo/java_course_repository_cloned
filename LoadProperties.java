import java.io.*;
import java.util.Properties;

public class LoadProperties {
    /**
     * @param args
     */
    public static void main(String[] args) {
       try (InputStream input = new FileInputStream( "example.properties")) {
          Properties prop = new Properties();
          prop.load(input);

          prop.forEach((key, value) -> System.out.println(key + ": " + value));
       } catch (IOException ex) {
           ex.printStackTrace();
       } 
    }
}