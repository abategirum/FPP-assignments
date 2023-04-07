package lab3;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class HeartRates {
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;

    public HeartRates(String firstName, String lastName, LocalDate dateOfBirth){
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "HeartRates{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }


    public static int calculateAge(LocalDate dateOfBirth){
        LocalDate currentDate = LocalDate.now();
        Period gap = Period.between(dateOfBirth,currentDate);
        return gap.getYears();
    }

    public static double[] targetHeartRateRange(int mhr){
          final int RHR  = 70;
          final double LB = 0.5;
          final double UB = 0.85;
          int ahr = mhr - RHR;

          double lbhtr = (ahr*LB) + RHR;
          double ubthr =  (ahr*UB) + RHR;
          return new double[] {lbhtr, ubthr};
    }



    public static int maxHeartRate(int age){
        return 220 - age;
    }

    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Please, Enter your first name:");
        String fname = sc.nextLine();

        System.out.println("Please, Enter your last name");
        String lname = sc.nextLine();

        System.out.println("Please, Enter your birth date in the format - (yyyy-mm-dd) Example 1987-03-23");
        String dateOfBirth = sc.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate date = LocalDate.parse(dateOfBirth, formatter);

        int age = calculateAge(date);
        HeartRates heartRates = new HeartRates(fname,lname,date);

        int mhr = maxHeartRate(age);
        double[] range = targetHeartRateRange(mhr);

        System.out.println("The Target Heart Range is between "+ range[0] +" and "+range[1] );
        System.out.println("First Name: "+ heartRates.getFirstName() + "\n" +"Last Name:" + heartRates.getLastName()
        +"\n"+"Age:" + age + "\n" +"Date of Birth:"+ heartRates.getDateOfBirth() +"\n"+"Maximum heart rate:" +mhr);



    }

}
