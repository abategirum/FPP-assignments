package lab1;

public class DataType {
    public static void main(String[] args){
        long randomNumber = RandomNumbers.getRandomInt(0,2_000_000_000);
        if(randomNumber >= Byte.MIN_VALUE && randomNumber <= Byte.MAX_VALUE){
            System.out.println("Byte");
        }
        else if(randomNumber >= Short.MIN_VALUE && randomNumber <= Short.MAX_VALUE){
            System.out.println("Short");
        }
        else if(randomNumber >= Integer.MIN_VALUE && randomNumber <= Integer.MAX_VALUE){
            System.out.println("Int");
        }
        else{
            System.out.println("Long");
        }

    }


}
