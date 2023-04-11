package prog1;

public class Circle extends Shape {
    double radius;

    public Circle(String color, double radius){
        super(color);
        this.radius = radius;
    }
    public double calculateArea(){
        return Math.PI * radius * radius;
    }

    public double calculatePermeter(){
        return 2 * Math.PI * radius;
    }
}
