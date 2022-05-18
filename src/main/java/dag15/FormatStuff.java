package dag15;

import java.text.NumberFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class FormatStuff {
    public static void main(String[] args) {
        NumberFormat shortformat = NumberFormat.getCompactNumberInstance(Locale.getDefault(), NumberFormat.Style.SHORT);
        NumberFormat longformat = NumberFormat.getCompactNumberInstance(Locale.getDefault(), NumberFormat.Style.LONG);
        System.out.println(shortformat.format(-999.4));
        System.out.println(longformat.format(1900000000000000000L));
        for (var n : NumberFormat.Style.values()) {
            System.out.println(n);
        }

        DateTimeFormatter dagdeelFormatter = DateTimeFormatter.ofPattern("B").withLocale(Locale.FRENCH);
        System.out.println(dagdeelFormatter.format(LocalTime.of(5, 59)));
    }
}
