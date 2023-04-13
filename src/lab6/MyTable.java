package lab6;

public class MyTable {
    Entry[] entries = new Entry[26];

    public String get(char c) {
        int index = c - 'a';
        if (index >= 0 && index < entries.length && entries[index] != null) {
            return entries[index].str;
        } else {
            return null;
        }
    }

    public void add(char c, String s) {
        int index = c - 'a';
        entries[index] = new Entry(c, s);
    }

    public String toString() {
        String output = "";
        for (int i = 0; i < entries.length; i++) {
            if (entries[i] != null) {
                output += entries[i].toString() + "\n";
            }
        }
        return output;
    }

    private class Entry {
        char ch;
        String str;

        Entry(char ch, String str) {
                this.ch = ch;
                this.str = str;

        }
        //returns a String of the form "ch->str"
         public String toString() {
           return ch + " -> " + str;
    }
}

    public static void main(String[] args) {
        MyTable t = new MyTable();
        t.add('a', "Andrew");
        t.add('b',"Billy");
        t.add('c',"Charlie");
        String s = t.get('b');
        System.out.println(s);
    }
}
