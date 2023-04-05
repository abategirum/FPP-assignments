package lab2;

import java.util.Arrays;

public class RemoveDups {
    public static void main(String[] args) {
        String[] collections = {"house", "furniture", "tv", "house", null,"bed", "sofa", "tv", "cabinet", "wardrobe"};
        int length = collections.length;
        String[] temp = new String[length];
        int count = 0;
        for (int i = 0; i < length; i++) {
            boolean isDuplicate = false;
            for (int j = length-1; j > i; j--) {
                if (collections[i] == null || collections[j] == null) {
                    continue;
                }
                if (collections[i].equals(collections[j])) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate && collections[i] != null) {
                temp[count] = collections[i];
                count++;
            }
        }
        temp = Arrays.copyOf(temp,count);
        System.out.println(Arrays.toString(temp));
    }

}
