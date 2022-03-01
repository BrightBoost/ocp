package dag7;

import dag2.A;

import java.sql.SQLException;

public class SuppressedExceptions {
    public static void main(String[] args) {
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
