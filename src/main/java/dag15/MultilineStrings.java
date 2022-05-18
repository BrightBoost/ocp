package dag15;

public class MultilineStrings {
    public static void main(String[] args) {
        //oude situatie multiline string
        String old = "blabla \nnieuwe regel";
        String nieuw =
            """
                <html>
                    <body>
                      <h1>blabla</h1> 
                    </body>
                </html>
                """;
        System.out.println(old);
        System.out.println(nieuw);
    }
}
