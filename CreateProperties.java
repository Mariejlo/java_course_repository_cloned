import java.io.*;
import java.util.Properties;

public class CreateProperties {
    public static void main(String[] args) {
       try (OutputStream output = new FileOutputStream("configuration.properties")) {
           Properties prop = new Properties();

           prop.setProperty("db.url", "localhost");
           proper
       }    })
}