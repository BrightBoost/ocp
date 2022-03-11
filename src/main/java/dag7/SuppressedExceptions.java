package dag7;

import dag2.A;

import java.sql.SQLException;
import java.time.DayOfWeek;

public class SuppressedExceptions {


    static int test;
    public static void main(String[] args) {

        test = 3;
        try(AutoCloseableExample autoCloseableExample = new AutoCloseableExample()){
            throw new SQLException();
        } catch(SQLException e) {
            e.printStackTrace();
            System.out.println(e.getSuppressed().length);
        } catch(CustomException e) {
            e.printStackTrace();
            System.out.println(e.getSuppressed().length);
        }
    }
}
