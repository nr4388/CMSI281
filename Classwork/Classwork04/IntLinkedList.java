public class IntLinkedList {

   private Node head;
   private int  size;

   // make new node, insert data, point new node to next one and prev node to new node.
   // removeAt() takes an integer index location ONLY,
   // and removes the node at that index.

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
