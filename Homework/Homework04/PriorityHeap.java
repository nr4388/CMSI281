/** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *  File name     :  BinaryTreeNode.java
 *  Purpose       :  Insert/remove items from a heap and display whether it is empty or full.
 *  Author        :  Maya Pegler Gordon, Nicolas Raymundo, Talia Bahar
 *  Date          :  11-25-2018
 *  Description   :  Edited the PriorityQueue.java file from text book to be able to create a heap and display the items as they're deleted.
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */

public class PriorityHeap {
  private int maxSize;
  private Heap queHeap;
  private int nItems;

  public PriorityHeap(int s){
    maxSize = s;
    queHeap = new Heap(maxSize);
    nItems = 0;
  }

  public void insert(int item) {
    queHeap.insert(item);
    nItems++;
  }

  public int remove() { // remove minimum item
    nItems--;
    return queHeap.remove().getKey();
  }

  public boolean isEmpty() { // true if queue is empty
    return (nItems==0);
  }

  public boolean isFull() {  // true if queue is full
    return (nItems == maxSize);
  }

}
