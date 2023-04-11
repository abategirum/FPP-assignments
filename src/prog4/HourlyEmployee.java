package prog4;

public class HourlyEmployee extends Employee{
    private double wage;
    private double hours;

    public HourlyEmployee(double wage, double hours) {
        this.wage = wage;
        this.hours = hours;
    }

    @Override
    public String toString() {
        return "HourlyEmployee{" +
                "wage=" + wage +
                ", hours=" + hours +
                '}';
    }

    public double getWage() {
        return wage;
    }

    public double getHours() {
        return hours;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    @Override
     public double getPayment() {
        return wage * hours;
    }
}
