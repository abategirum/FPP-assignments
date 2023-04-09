package lab4;

public class ReverseInt {
    public static int reverse(int num){
        int reversed = 0;
        while(num != 0){
        int  digit = num % 10;

        reversed = reversed * 10 + digit;
        num /= 10;
        reverse(num);
        }
        return reversed;
    }

    public static void main(String[] args) {
        int reversedDigit = reverse(234);
        System.out.println(reversedDigit);
    }
}
