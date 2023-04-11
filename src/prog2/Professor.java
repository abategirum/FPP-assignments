package prog2;

import java.time.LocalDate;

public class Professor extends DeptEmployee {
    private int numberOfPublications;

    Professor(String name, double salary, int year, int month, int date,int numberOfPublications){
        super(name,salary,year,month,date);
        this.numberOfPublications = numberOfPublications;
    }

    public int getNumberOfPublications() {
        return numberOfPublications;
    }

    public void setNumberOfPublications(int numberOfPublications) {
        this.numberOfPublications = numberOfPublications;
    }
}
