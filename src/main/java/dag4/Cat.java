package dag4;

import java.time.LocalDate;

//not the assignment, checking dates
public class Cat implements Comparable<Cat> {
    private String name;
    private LocalDate localDate;

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Cat o) {
        return this.name.compareTo(o.getName());
    }
}
