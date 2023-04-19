package lab7.prog3;

import java.util.*;
import java.util.ArrayList;

public class Marketing {
    private String employeeName;
    private String productName;
    private double salesAmount;

    Marketing(String employeeName, String productName, double salesAmount){
        this.employeeName = employeeName;
        this.productName = productName;
        this.salesAmount = salesAmount;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public String getProductName() {
        return productName;
    }

    public double getSalesAmount() {
        return salesAmount;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setSalesAmount(double salesAmount) {
        this.salesAmount = salesAmount;
    }


    @Override
    public String toString() {
        return "[" +
                employeeName + ", " + productName + ", " + salesAmount +
                ']';
    }

    @Override
    public boolean equals(Object aMarketing) {
        if(aMarketing == null) return false;
        if(!(aMarketing instanceof Marketing)) return false;
        Marketing mark = (Marketing) aMarketing;
        boolean isTrue = this.employeeName.equals(mark.employeeName)&&
                         this.productName.equals(mark.productName) &&
                         this.salesAmount == mark.salesAmount;
        return isTrue;
    }

    public static List<Marketing> listMoreThan1000(List<Marketing> list) {
        List<Marketing> higherSales = new ArrayList<>();
        for (Marketing mark : list) {
            if (mark.getSalesAmount() > 1000) {
                higherSales.add(mark);
            }
        }
        return higherSales;
    }

    public static void main(String[] args) {
        List<Marketing> myList = new ArrayList<Marketing>();
        myList.add(new Marketing("john","Carret",2300));
        myList.add(new Marketing("mark","bottle",200));
        myList.add(new Marketing("simon","tire",5300));
        myList.add(new Marketing("Lina","screw",450));
        Iterator it = myList.iterator();
        while (it.hasNext()){
            var nextItem = it.next();
            System.out.println(nextItem);
        }

        //remove
        myList.remove(1);

        //or
//        String nameTobeRemoved = "Smith";
//        Iterator nameIterator = myList.iterator();
//        while(nameIterator.hasNext()){
//            var nextItem = nameIterator.next();
//            if(nextItem.getEmployeeName().equals(nameTobeRemoved))
//                nameIterator.remove();
//        }

        System.out.println(myList);

        System.out.println(myList.size());

        List<Marketing> highEarners = listMoreThan1000(myList);
        Collections.sort(highEarners, Comparator.comparing(Marketing::getEmployeeName));


// Print the list of high earners sorted by firstName
        for (Marketing mark : highEarners) {
            System.out.println(mark.getEmployeeName() + " " + mark.getProductName() + " " + mark.getSalesAmount());
        }

    }
}
