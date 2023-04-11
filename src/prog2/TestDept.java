package prog2;

import java.util.Scanner;

public class TestDept {
    public static void main(String[] args) {
        DeptEmployee[] department = new DeptEmployee[5];
        department[0] = new Professor("John",3400, 1965,4,3,3);
        department[1] = new Professor("Bob",5400, 1976,12,6,5);
        department[2] = new Professor("Mayer",24000, 1956,3,6,2);
        department[3] = new Secretary("Susan",4009,1996,11,4,34);
        department[4] = new Secretary("Yani",4500,1997,1,5,24);

        Scanner sc = new Scanner(System.in);
        System.out.println("Would you like to see the sum of two departmet salaries? y/n");
        String input = sc.nextLine();
        switch (input){
            case "y":
                double sum = 0.0;
                for( DeptEmployee dept : department){
                    sum += dept.computeSalary();
                }
                System.out.println(sum);
                break;
            case "n":
                System.out.println("Have a good day!!!");

        }

    }
}
