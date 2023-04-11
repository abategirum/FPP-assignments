package prog3;

import java.util.Arrays;

public class TestFigure {
    public static void main(String[] args) {
        Figure[] figures = {
                new DownwardHat(),
                new DownwardHat(),
                new UpwardHat(),
                new FaceMaker(),
                new Vertical()
        };
        for(Figure fig : figures){
           fig.getFigure();
        }
        System.out.println();
        for(Figure fig : figures){
            System.out.print(fig.getClass().getSimpleName()+":");
            fig.getFigure();
            System.out.println("\n");
        }
    }
}
