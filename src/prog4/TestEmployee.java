package prog4;

public class TestEmployee {
    public static void main(String[] args) {
        Employee[] employees = {
                new ComissionEmployee(4300,0.05),
                new HourlyEmployee(23,44),
                new SalariedEmployee(1300),
                new BasePlusCommissionEmployee(1200,0.05,1300)
        };
        double sum = 0.0;
        for(Employee emp : employees){
            sum += emp.getPayment();
        }
        System.out.println(sum);
    }
}
