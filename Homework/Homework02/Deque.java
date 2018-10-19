/** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *  File name     :  Deque.java
 *  Purpose       :  Created a deque class with wraparound integration.
 *  Author        :  Nicolas Raymundo
 *  Date          :  10-17-2018
 *  Description   :  Added methods to be able to insert/remove from both sides with wraparound integration.
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */

public class Deque {
    private int maxSize;
    private long[] dequeArray;
    private int front;
    private int rear;
    private int nItems;
    private boolean leftOpen;
    private boolean rightOpen;

    public Deque(int s) {   //constructor
        maxSize = s;
        dequeArray = new long[maxSize];
        front = 0;
        rear = -1;
        nItems = 0;
        leftOpen = true;
        rightOpen = true;
    }

    public long[] shiftRight(long[] deque) {
        for (int i = maxSize - 1; i > front; i--) {
            deque[i] = deque[i - 1];
        }
        nItems++;
        rear++;
        return deque;
    }

    public void insertLeft(long j) {          // put item at front of queue
        if (nItems == maxSize) {
            System.out.println("Deque is full. Please remove first");
        } else if (leftOpen == false){
            insertRight(j);
        } else if (nItems == (maxSize - 1)) {
            leftOpen = false;
            shiftRight(dequeArray);
            dequeArray[front] = j;
        } else {
            shiftRight(dequeArray);
            dequeArray[front] = j;
        }
    }

    public void insertRight(long j) {          // put item at rear of queue
        if (nItems == maxSize) {
            System.out.println("Deque is full. Please remove first");
        } else if (rightOpen == false && leftOpen) {
            insertLeft(j);
        } else if ((nItems == (maxSize - 1)) && (rightOpen)) {
            rightOpen = false;
            rear++;
            dequeArray[rear] = j;
            nItems++;
        } else {
            rear++;
            dequeArray[rear] = j;
            nItems++;
        }
    }

    public long removeLeft() {                // take item from front of queue
        if (nItems == maxSize) {
            leftOpen = true;
            rightOpen = false;
        }
        long temp = dequeArray[front];
        for (int i = 0; i < maxSize - 1; i++) {
            dequeArray[i] = dequeArray[i + 1];
        }
        rear--;
        nItems--;
        if (nItems == 0) {
            leftOpen = true;
            rightOpen = true;
        }
        return temp;
    }

    public long removeRight() {                // take item from back of queue
        if (nItems == maxSize) {
            leftOpen = false;
            rightOpen = true;
        }
        long temp = dequeArray[rear];
        rear--;
        nItems--;
        if (nItems == 0) {
            leftOpen = true;
            rightOpen = true;
        }
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

    public String displayDequeContent() {
        String list = "Contents: ";
        for (int i = 0; i < nItems; i++) {
             list += ((dequeArray[(front + i) % nItems]) + " ");
        }
        return list;
    }

}
