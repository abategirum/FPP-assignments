package lab1;

public class Alphabet {
    public static void main(String[] args){
        String name = "Hi \uD83D\uDC4B,"+" "+ "my name is "+"\"\u130D\u1229\u121D\".";
        System.out.println(name);
        System.out.println(name.length());//the wave emoji is made up of two unicodeValues and my name is made up of three unicodeValues
        // so intotal the .length function will return 24 characters including spaces.

    }

}
