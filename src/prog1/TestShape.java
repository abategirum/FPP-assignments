package prog1;

public class TestShape {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[5];
        shapes[0] = new Rectangle("brown",4,5);
        shapes[1] = new Square("yellow",4);
        shapes[2] = new Circle("brown",4);
        shapes[3] = new Square("yellow",4);
        shapes[4] = new Rectangle("green",2,5);
        printTotal(shapes);
    }
    public static void printTotal(Shape[] shapes){
        double sumArea = 0.0;
        double sumPermimeter = 0.0;
        for(Shape sh : shapes){
            sumArea += sh.calculateArea();
            sumPermimeter += sh.calculatePermeter();

        }
        System.out.println("Total Area is: "+sumArea+"\n"+"Total Perimeter is:"+sumPermimeter);
    }
}
