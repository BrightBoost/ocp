package dag8;

import java.text.NumberFormat;
import java.text.ParseException;
import java.time.format.FormatStyle;
import java.util.Locale;

public class Formatting {
    public static void main(String[] args) {
        NumberFormat de = NumberFormat.getInstance(Locale.GERMAN);
        System.out.println(de.format(12345.88));

        NumberFormat us = NumberFormat.getInstance(Locale.US);
        System.out.println(us.format(12345.88));

        try {
            System.out.println(de.parse("1.23"));
            System.out.println(us.parse("1.23"));

        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
