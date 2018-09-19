/** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *  File name     :  IntLinkedList.java
 *  Purpose       :  Implementing linked list manipulation to get familiar with linked lists in java.
 *  Author        :  Nicolas Raymundo
 *  Date          :  09-18-2018
 *  Description   :  Implemented various methods to add and remove various nodes from a linked list.
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */

public class IntLinkedList {

   private Node head;
   private int  size;

   public void insertAt(int index, int dataValue) {
       int nodeValue = 0;
       Iterator nodeTracker = new Iterator();
       while (nodeTracker.hasNext()) {
           nodeValue++;
           nodeTracker.next();
           if (nodeValue == index - 1) {
               Node newNode = new Node(dataValue);
               newNode.next = nodeTracker.currentNode.next;
               nodeTracker.currentNode.next = newNode;
               break;
           }
       }
   }

   public void removeAt(int index) {
       int nodeValue = 0;
       Iterator nodeTracker = new Iterator();
       while (nodeTracker.hasNext()) {
           nodeValue++;
           nodeTracker.next();
           if (nodeValue == index - 1) {
               nodeTracker.currentNode.next = nodeTracker.currentNode.next.next;
               break;
           }
       }
   }

   // the constructor
   IntLinkedList() {
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
