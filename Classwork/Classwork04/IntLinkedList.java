public class IntLinkedList {

   private Node head;
   private int  size;

   // make new node, insert data, point new node to next one and prev node to new node.
   // dont get how to figure out the index of the node you're at. would you have to make a new method
   // with a for loop to iterate through the list and return the value of the node at the requested index.

   // public void insertAt( int index, int dataValue ) {
   //     int nodeValue = 0;
   //     int prevNodeValue = 0;
   //     Iterator nodeTracker = new Iterator();
   //     Iterator prevNodeTracker = new Iterator();
   //     while (nodeTracker.hasNext() && prevNodeTracker.hasNext()) {
   //         prevNodeValue++;
   //         head = new Node(nodeTracker.getCurrentInt());
   //         if (prevNodeValue == 2) {
   //             head.next = new Node(nodeTracker.getCurrentInt());
   //         } else if (indexValue == index) {
   //             this.next = new Node(dataValue);
   //         } else {
   //             this.next = new Node(nodeTracker.getCurrentInt());
   //         }
   //     }
   // }

   public void insertAt( int index, int dataValue ) {
       int nodeValue = 0;
       Iterator nodeTracker = new Iterator();
       while (nodeTracker.hasNext()) {
           nodeValue++;
           if (nodeValue == index - 1) {
               Node newNode = new Node(dataValue);
               newNode.next = ;

           }
       }
   }
   // Node newNode = new Node(x);
   //
   //          Node ptr = head;
   //          int len = 0;
   //
   //          // calculate length of the linked list
   //          //, i.e, the number of nodes
   //          while (ptr != null) {
   //              len++;
   //              ptr = ptr.next;
   //          }
   //
   //          // 'count' the number of nodes after which
   //          // the new node is to be inserted
   //          int count = ((len % 2) == 0) ? (len / 2) :
   //                                      (len + 1) / 2;
   //          ptr = head;
   //
   //          // 'ptr' points to the node after which
   //          // the new node is to be inserted
   //          while (count-- > 1)
   //              ptr = ptr.next;
   //
   //          // insert the 'newNode' and adjust
   //          // the required links
   //          newNode.next = ptr.next;
   //          ptr.next = newNode;

   // /* 2. Allocate the Node &
   //     3. Put in the data*/
   //  Node new_node = new Node(new_data);
   //
   //  /* 4. Make next of new Node as next of prev_node */
   //  new_node.next = prev_node.next;
   //
   //  /* 5. make next of prev_node as new_node */
   //  prev_node.next = new_node;

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
