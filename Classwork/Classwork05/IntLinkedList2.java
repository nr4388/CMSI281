/** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *  File name     :  IntLinkedList.java
 *  Purpose       :  Implementing linked list manipulation to get familiar with linked lists in java.
 *  Author        :  Nicolas Raymundo
 *  Date          :  09-18-2018
 *  Description   :  Implemented various methods to add and remove various nodes from a linked list.
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */

public class IntLinkedList2 {

   private Node head;
   public int  size;

   public void insertAt(int index, int dataValue) {
       if ((index > size - 1) || (index < 0)) {
           throw new IllegalArgumentException("Index is either too large or too small");
       }
       if (index == 0) {
           Iterator nodeTracker = getIteratorAt(index);
           Node newNode = new Node(dataValue);
           head = newNode;
       } else {
           Iterator nodeTracker = getIteratorAt(index - 1);
           Node newNode = new Node(dataValue);
           newNode.next = nodeTracker.currentNode.next;
           nodeTracker.currentNode.next = newNode;
       }
   }

   public int removeAt(int index) {
       if (getSize() == 0) {
           throw new IllegalArgumentException("Queue is empty!");
       } else if ((index > size - 1) || (index < 0)) {
           throw new IllegalArgumentException("Index is either too large or too small.");
       }
       // if (index == 0) {
       //     Iterator nodeTracker = getIteratorAt(index);
       //     head = null;
       //     size--;
       //     return nodeTracker.getCurrentInt();
       //     // return nodeTracker.getCurrentInt();
       // } else {
           Iterator nodeTracker = getIteratorAt(index);
           // System.out.println(nodeTracker.getCurrentInt());
           nodeTracker.currentNode.next = null;
           size--;
           return nodeTracker.getCurrentInt();
       // }
       // if (index == 0) {
       //     Iterator nodeTracker = getIteratorAt(index);
       //     head = head.next;
       //     return nodeTracker.getCurrentInt();
       // } else {
       //     Iterator nodeTracker = getIteratorAt(index - 1);
       //     nodeTracker.currentNode.next = nodeTracker.currentNode.next.next;
       //     return nodeTracker.getCurrentInt();
       // }
   }

   // the constructor
   IntLinkedList2() {
      head = null;
      size = 0;
   }

   public int getSize() {
      return size;
   }

   public void prepend( int dataToAdd ) {
      Node currentHead = head;
      head = new Node( dataToAdd );
      head.next = currentHead;
      size++;
   }

   private class Node {

      int data;            // remember this is an IntLinkedList
      Node next;           // here's the self-referential part

      // constructor
      Node( int d ) {
         data = d;
         next = null;
      }
   }

   public Iterator getIteratorAt( int index ) {
      if( (index > size) || (index < 0) ) {
         throw new IllegalArgumentException();
      }
      Iterator it = new Iterator();
      while( index > 0 ) {
         it.next();
         index--;
      }
      return it;
   }

   public class Iterator {
      private Node currentNode;

      Iterator() {
         currentNode = head;
      }

      public void next() {
         if( currentNode == null ) {
            return;
         } else {
            currentNode = currentNode.next;
         }
      }

      public boolean hasNext() {
         return ((currentNode != null) && (currentNode.next != null));
      }

      public int getCurrentInt() {
         return currentNode.data;
      }

   }
}
