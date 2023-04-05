package lab2;

import java.util.Arrays;
import java.util.Scanner;

public class Prog5 {
    public static int[] combine(int[] a, int[] b){
        int sumLength = a.length + b.length;
        int[] temp = new int[sumLength];
        System.arraycopy(a, 0, temp, 0, a.length);
        System.arraycopy(b, 0, temp, a.length, b.length);
        System.out.println(Arrays.toString(temp));
        return temp;
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

        System.out.println("provide the size of the array");
        int arraySize2 = sc.nextInt();
        System.out.println("provide "+arraySize2+" elements");
        int[] elements2 = new int[arraySize2];
        for(int i = 0; i<arraySize2; i++){
            elements2[i] = sc.nextInt();
        }
        sc.close();
        combine(elements,elements2);

    }
}
