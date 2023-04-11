package prog6;

public class TestComputer {
    public static void main(String[] args) {
        Computer[] comp = new Computer[2];
        comp[0] = new Computer("Apple","M2",512,16);
        comp[1] = new Computer("Apple","M2",512,16);

        boolean isTrue = comp[0].equals(comp[1]);
        System.out.println(isTrue);
    }
}
