public class Queue
{
  private int maxSize;
  private long[] queArray;
  private int front;
  private int rear;
  private int nItems;

  public Queue(int s){ //constrcutor
    maxSize = s;
    queArray = new long[maxSize];
    front = 0;
    rear = -1;
    nItems = 0;
  }

  public void insert(long j){          // put item at rear of queue
    if(rear == maxSize-1) {
      rear = -1;
    }
    queArray[++rear] = j;
    nItems++;
  }

  public long remove(){                // take item from front of queue
    long temp = queArray[front++];
    if(front == maxSize) {
      front = 0;
    }
    nItems--;
    return temp;
  }


  public long peekFront(){             // peek at front of queue
    return queArray[front];
  }

  public boolean isEmpty(){            // true if queue is empty
    return (nItems==0);
  }

  public boolean isFull() {           // true if queue is full
    return (nItems==maxSize);
  }

  public int size() {                 // number of items in queue
    return nItems;
  }

  // Note that this does not mean simply displaying the contents of the underlying array.
  // You should show the queue contents from the first item inserted to the last,
  // without indicating to the viewer whether the sequence is broken by wrapping around the end of the array.
  // Be careful that one item and no items display properly, no matter where front and rear are.

  // 10,20,30,40,
  // 60,70,80,40,50

  public void displayQueueContent() {
      for (int i = 0; i < nItems; i++) {
          System.out.println("List: " + queArray[(front + i) % nItems]);
      }
  }


}
