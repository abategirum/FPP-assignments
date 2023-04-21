package lab9;

public class ArrayQueueImpl {
    private int[] arr = new int[10];
    private int front = -1;
    private int rear = 0;

    private int size = 0;

    public int peek() {
        if (isEmpty()) throw new IllegalStateException("Queue is Empty");
        return arr[front];

    }

    public void enqueue(int obj) {
        if (isEmpty()) {
            front = rear = obj;
            front++;
            size++;
        }
        if (rear == arr.length) {
            resize();
        }
        arr[rear++] = obj;
        front++;
        size++;
    }

    public int dequeue() {
        if (isEmpty()) throw new IllegalStateException("Queue is Empty");
        int item = arr[front];
        front++;
        size--;

        if(isEmpty()){
            front = -1;
            rear = 0;
        }
        return item;
    }

    public boolean isEmpty() { //implement
        return size == 0;
    }

    public int size() { //implement
        return size;
    }

    private void resize() {
        int[] temp = new int[arr.length * 2];
        System.arraycopy(arr,0,temp,0,arr.length);
        arr = temp;

    }

    public static void main(String[] args) {
        ArrayQueueImpl q = new ArrayQueueImpl();
        for (int i = 0; i < 15; i++) {
            q.enqueue(i);
        }
        for(int i = 0; i < 7; i++){
            q.dequeue();
        }
        System.out.println(q.size());
        System.out.println(q.peek());
    }
}
