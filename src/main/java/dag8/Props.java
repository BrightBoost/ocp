package dag8;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Locale;
import java.util.Properties;
import java.util.PropertyResourceBundle;
import java.util.ResourceBundle;

public class Props {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("src/main/resources/Voorbeeld_en.properties", true);
        fw.append("\nbla=bla");
        fw.close();
        Properties props = new Properties();

        System.out.println(Locale.getDefault());
        ResourceBundle rb = ResourceBundle.getBundle("Voorbeeld", new Locale("nl"));

        rb.keySet().stream().forEach(k -> props.put(k, rb.getString(k)));

        System.out.println("prop: " + props.getProperty("hoi"));
        System.out.println(rb.getString("hoi"));
        ResourceBundle rb2 = ResourceBundle.getBundle("Voorbeeld", new Locale("en"));

        System.out.println(rb2.getString("bla"));




    }


}
