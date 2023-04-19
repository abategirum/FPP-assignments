package lab7.prog3;

import java.util.Comparator;

public class SalesComparator implements Comparator<Marketing> {
    public int compare(Marketing m1, Marketing m2){
        String name1  = m1.getEmployeeName();
        String name2 = m2.getEmployeeName();
        String productName1 = m1.getProductName();
        String productName2 = m2.getProductName();
        double salesAmount1 = m1.getSalesAmount();
        double salesAmount2 = m2.getSalesAmount();


        if(name1.compareTo(name2) != 0){
            return name1.compareTo(name2);
        }

        if(productName1.compareTo(productName2) != 0){
            return productName1.compareTo(productName2);
        }
        if(salesAmount1 < salesAmount2) {
            return -1;
        }
        else if(salesAmount1 > salesAmount2) {
            return 1;
        }
        else {
            return 0;
        }


    }
}
