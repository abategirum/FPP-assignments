package prog2;

import java.time.LocalDate;

public class DeptEmployee {
    private String name;
    private double salary;
    private LocalDate hireDate;

    DeptEmployee(String name, double salary, int year, int month, int date){
        this.name = name;
        this.hireDate = LocalDate.of(year,month,date);
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }

    public double computeSalary(){
        return salary;
    }
}
