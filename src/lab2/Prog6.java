package lab2;

import java.util.Scanner;

public class Prog6 {

    public static int min(int[] arrayOfInts){
        int length = arrayOfInts.length;
        int min = arrayOfInts[0];
        for(int i = 1; i < length; i++){
            if(arrayOfInts[i] <= min){
                min = arrayOfInts[i];
            }
        }
        return min;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("provide the size of the array");
        int arraySize = sc.nextInt();
        System.out.println("provide "+arraySize+" elements");
        int[] elements = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            elements[i] = sc.nextInt();
        }
       int result  =  min(elements);
        System.out.println(result);
    }
}
