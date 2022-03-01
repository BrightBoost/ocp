package dag7;

import java.sql.SQLException;
import java.util.ArrayList;

public class ExceptionalExamples {
    public void uncheckedBlabla() {
        throw new NullPointerException();
    }

    //method signature throws - dealing with checked exception
    public void checkedBlabla() throws SQLException {
        throw new SQLException();
    }

    //dealing with exception using try catch
    public void callCheckedBlabla() {
        try {
            checkedBlabla();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //dealing with exception using try catch
    public void callCheckedBlabla2() {
        try {
            checkedBlabla();
        } catch (SQLException e) {
            e.printStackTrace();
            ArrayList<Object> arrayList = new ArrayList<>();
//            while(true) {
//                arrayList.add(new Object());
//            }
        } finally {
            System.out.println("always executed");
        }
    }

    public static void main(String[] args) {
        ExceptionalExamples exceptionalExamples = new ExceptionalExamples();
        exceptionalExamples.callCheckedBlabla2();
    }
}
