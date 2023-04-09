package lab4;

public class sumArray {
    public static Integer sumArray(int[] element){
        Integer sum = sumArrayHelper(element, element.length - 1);
        return sum;
    }
    private static Integer sumArrayHelper(int[] arr, int length) {
        if (length <= 0 || arr == null) {
            return 0;
        }

        Integer sum = arr[length] + sumArrayHelper(arr, length - 1);
        return sum;

    }

    public static void main(String[] args) {
        int[] elements ={1,2,4,5,6,7};
        int sum  = sumArray(elements);
        System.out.println(sum);
    }
    }

