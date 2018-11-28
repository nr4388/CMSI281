/** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *  File name     :  Heap.java
 *  Purpose       :  Used the heap class from the text book to be able to create a heap for use in PriorityHeap.java
 *  Author        :  Maya Pegler Gordon, Nicolas Raymundo, Talia Bahar
 *  Date          :  11-25-2018
 *  Description   :  Able to display/insert/remove items from a heap.
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */

import java.io.*;

class Node {
  private int iData;

  public Node(int key) {
    iData = key;
  }

  public int getKey() {
    return iData;
  }

  public void setKey(int id) {
    iData = id;
  }
}

class Heap {
  private Node[] heapArray;
  private int maxSize; // size of array
  private int currentSize; // number of nodes in array

  public Heap(int mx) {
    maxSize = mx;
    currentSize = 0;
    heapArray = new Node[maxSize]; // create array
  }

  public boolean isEmpty() {
    return currentSize==0;
  }

  public boolean insert(int key) {
    if(currentSize==maxSize) {
      return false;
    }
    Node newNode = new Node(key);
    heapArray[currentSize] = newNode;
    trickleUp(currentSize++);
    return true;
  }

  public void trickleUp(int index) {
    int parent = (index-1) / 2;
    Node bottom = heapArray[index];
    while( index > 0 && heapArray[parent].getKey() < bottom.getKey() ) {
      heapArray[index] = heapArray[parent]; // move it down
      index = parent;
      parent = (parent-1) / 2;
    }
    heapArray[index] = bottom;
  }

  public Node remove() {        // delete item with max key
    Node root = heapArray[0];     // (assumes non-empty list)
    heapArray[0] = heapArray[--currentSize];
    trickleDown(0);
    return root;
  }

  //if bottom value is greater it travels up/if top value is smaller it trickles down
  public void trickleDown(int index) {
    int largerChild;
    Node top = heapArray[index];
    while(index < currentSize/2) {
      int leftChild = 2*index+1;
      int rightChild = leftChild+1;
      if(rightChild < currentSize && heapArray[leftChild].getKey() < heapArray[rightChild].getKey()) {
        largerChild = rightChild;
      } else {
        largerChild = leftChild;
      }
      if( top.getKey() >= heapArray[largerChild].getKey() ) {
        break;
      }
      heapArray[index] = heapArray[largerChild];
      index = largerChild;
    }
    heapArray[index] = top;
  }

  public boolean change(int index, int newValue) {
    if(index<0 || index>=currentSize) {
      return false;
    }
    int oldValue = heapArray[index].getKey(); // remember old
    heapArray[index].setKey(newValue);
    if(oldValue < newValue){
      trickleUp(index);
    } else {
      trickleDown(index);
    }
    return true;
  }

  public void displayHeap() {
    System.out.print("heapArray: "); // array format
    for(int m=0; m<currentSize; m++) {
      if(heapArray[m] != null) {
        System.out.print( heapArray[m].getKey() + " ");
      } else {
        System.out.print("--");
      }
      System.out.println("");
      int nBlanks = 32;
      int itemsPerRow = 1;
      int column = 0;
      int j = 0;
      String dots = "...............................";
      System.out.println(dots+dots);
      while(currentSize > 0) {
        if(column == 0) {
          for(int k=0; k<nBlanks; k++) {
            System.out.print(" ");
          }
          System.out.print(heapArray[j].getKey());
        }
        if(++j == currentSize) {
          break;
        }
        if(++column==itemsPerRow) {
          nBlanks /= 2;
          itemsPerRow *= 2;
          column = 0;
          System.out.println();
        } else {
          for(int k=0; k<nBlanks*2-2; k++) {
            System.out.print(" ");
          }
        }
      }
      System.out.println("\n" + dots + dots); // UNSURE ABOUT THIS LOCATION
    }
  }
}
