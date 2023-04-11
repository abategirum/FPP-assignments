package prog4;

public class ComissionEmployee extends Employee{
    private double grossSales;
    private double commissionRate;

    public ComissionEmployee(double grossSales, double commissionRate) {
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    @Override
    public String toString() {
        return "ComissionEmployee{" +
                "grossSales=" + grossSales +
                ", commissionRate=" + commissionRate +
                '}';
    }

    public void setGrossSales(double grossSales) {
        this.grossSales = grossSales;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }

    @Override
    public double getPayment() {
        return grossSales * commissionRate;
    }
}
