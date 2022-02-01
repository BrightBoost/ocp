package dag1;

public class Fun {
    public static void main(String[] args) {
        int x = 5;
        Integer y = Integer.valueOf(Integer.MIN_VALUE);
        System.out.println(y-1);

        double a = 0.01;
        for(int i = 0; i < 10; i++) {
            a = a + 0.001;
            System.out.println(a);

        }

        System.out.println(Weekdays.MONDAY);
    }
}
