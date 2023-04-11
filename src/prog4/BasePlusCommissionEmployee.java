package prog4;

public class BasePlusCommissionEmployee extends ComissionEmployee{
    double baseSalary;

    @Override
    public String toString() {
        return "BasePlusCommissionEmployee{" +
                "baseSalary=" + baseSalary +
                '}';
    }

    public BasePlusCommissionEmployee(double grossSales, double commissionRate, double baseSalary) {
        super(grossSales, commissionRate);
        this.baseSalary = baseSalary;

    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public double getPayment() {
        return baseSalary + (super.getGrossSales() * super.getCommissionRate());
    }
}
