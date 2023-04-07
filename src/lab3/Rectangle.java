package lab3;

final public class Rectangle {
    private Double width;
    private Double height;

    public Rectangle(Double width, Double height){
        this.width = width;
        this.height = height;
    }

    public double computeArea(){
        return width * height;
    }



}
