package prog2;

import java.time.LocalDate;

public class Secretary extends DeptEmployee {
 private double overtimeHours;

 Secretary(String name, double salary, int year, int month, int date,double overtimeHours){
     super(name,salary,year,month,date);
     this.overtimeHours = overtimeHours;
 }

    public double getOvertimeHours() {
        return overtimeHours;
    }

    public void setOvertimeHours(double overtimeHours) {
        this.overtimeHours = overtimeHours;
    }

    public double computeSalary(){
        return super.computeSalary() + 12 * overtimeHours;
    }
}
