package lab4;

public class countDigit {
    public static int countDigit(int num){
        int count = 0;
        while(num  != 0){

           int digit = num % 10;
            count++;
           num /= 10;
           countDigit(num);
        }
           return count;
    }

    public static void main(String[] args) {
        int countDigit = countDigit(12230034);
        System.out.println(countDigit);
    }
}
