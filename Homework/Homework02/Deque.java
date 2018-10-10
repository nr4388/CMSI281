public class Deque {
    private int maxSize;
    private long[] dequeArray;
    private int front;
    private int rear;
    private int nItems;

    public Deque(int s) {   //constructor
        maxSize = s;
        dequeArray = new long[maxSize];
        front = 0;
        rear = -1;
        nItems = 0;
    }

    public void insertRight(long j) {          // put item at rear of queue
        if (rear == maxSize - 1) {
            removeLeft();
            // rear--;
        }
        rear++;
        dequeArray[rear] = j;
        nItems++;
    }

    public void insertLeft(long j) {          // put item at front of queue
        if (rear == maxSize - 1) {
            removeRight();
            rear = -1;
        }
        for (int i = nItems; i > front; i--) {
            dequeArray[i] = dequeArray[i - 1];
        }
        dequeArray[front] = j;
        nItems++;
        rear++;
    }

    public long removeLeft() {                // take item from front of queue
        long temp = dequeArray[front];
        if (rear == maxSize - 1) {
            rear--;
        }
        for (int i = 0; i < nItems - 1; i++) {
            dequeArray[i] = dequeArray[i + 1];
        }
        nItems--;
        return temp;
    }

    public long removeRight() {                // take item from back of queue
        long temp = dequeArray[rear];
        if (rear == maxSize - 1) {
            rear--;
        }
        nItems--;
        return temp;
    }

    public long peekFront() {             // peek at front of queue
        return dequeArray[front];
    }

    public boolean isEmpty() {            // true if queue is empty
        return (nItems==0);
    }

    public boolean isFull() {           // true if queue is full
        return (nItems==maxSize);
    }

    public int size() {                 // number of items in queue
        return nItems;
    }

    public void displayDequeContent() {
        for (int i = 0; i < nItems; i++) {
            System.out.println("List: " + dequeArray[(front + i) % nItems]);
        }
    }

}
