package prog1;

public class Rectangle extends Shape {
    double width;
    double height;

    public Rectangle(String color, double width, double height){
        super(color);
        this.width = width;
        this.height = height;
    }

    public double calculateArea(){
        return width *  height;
    }

    public double calculatePermeter(){
        return 2 * width + 2 * height;
    }
}
