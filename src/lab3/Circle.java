package lab3;

final public class Circle {
    private Double radius;

    public Circle(Double radius){
        this.radius = radius;

    }

    public double computeArea(){
        return Math.PI * radius * radius;
    }
}
