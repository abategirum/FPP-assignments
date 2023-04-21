package lab9;

public class stackLinkedList {
    private Node top;

    private static class Node {
        private String data;
        private Node next;
    }

    public void push(String s) {
        Node newNode = new Node();
        newNode.data = s;
        newNode.next = top;
        top = newNode;
    }

    public String peek() {
        if (top != null) {
            return top.data;
        } else {
            return null;
        }
    }

    public String pop() {
        if (top != null) {
            String s = peek();
            top = top.next;
            return s;
        } else {
            return null;
        }
    }
    public void printAll() {
        if(peek() == null) return;
        else {
            Node next = top;
            while(next != null) {
                System.out.println(next.data + "");
                next = next.next;
            }
        }
    }


    public static void main(String[] args) {
        stackLinkedList lk = new stackLinkedList();
        lk.push("hello");
        lk.push("hellolll");
        lk.printAll();

    }
}
