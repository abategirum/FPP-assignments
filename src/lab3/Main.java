package lab3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter C for Circle\n" +
                "Enter R for Rectangle\n" +
                "Enter T for Triangle");

        Scanner sc = new Scanner(System.in);
        String shape = sc.nextLine();

        switch (shape) {
            case "C":
                System.out.print("Enter the Radius of the Rectangle: ");
                Scanner scanner = new Scanner(System.in);
                double radius = scanner.nextDouble();
                Circle circle = new Circle(radius);
                double circleArea = circle.computeArea();
                System.out.printf("The area of Rectangle is : %.2f", circleArea);

                break;
            case "R":
                // Calculate area of rectangle
                System.out.print("Enter the width of the Rectangle: ");
                Scanner scan = new Scanner(System.in);
                double width = scan.nextDouble();
                System.out.print("Enter the height of the Rectangle: ");
                double height = scan.nextDouble();
                Rectangle rec = new Rectangle(width, height);
                double area = rec.computeArea();
                System.out.printf("The area of Rectangle is : %.2f", area);
                break;
            case "T":
                System.out.print("Enter the base of the Triangle: ");
                Scanner scann = new Scanner(System.in);
                double base = scann.nextDouble();
                System.out.print("Enter the height of the Triangle: ");
                double height2 = scann.nextDouble();
                Triangle tri = new Triangle(base, height2);
                double triArea = tri.computeArea();
                System.out.printf("The area of Rectangle is : %.2f", triArea);
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }
    }

}
