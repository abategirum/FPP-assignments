package lab3;

final public class Triangle {
    private Double base;
    private Double height;

    public Triangle(Double base, Double height){
        this.base = base;
        this.height = height;
    }

    public double computeArea(){
        return 0.5 * base * height;
    }
}
