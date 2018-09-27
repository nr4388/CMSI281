/** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *  File name     :  IntQueue.java
 *  Purpose       :  Class for IntQueue to get familiar with how queues work.
 *  Author        :  Nicolas Raymundo
 *  Date          :  09-27-2018
 *  Description   :  Edited enQueue, peek, and deQueue methods to remove nodes from the front and add to the end.
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */

public class IntQueue {

      IntLinkedList2 myQueue;
      Integer index = 0;

      IntQueue() {
         myQueue = new IntLinkedList2();         // constructor
      }

      // Add to end of queue
      public void enQueue(int itemToPush ) {
          myQueue.prepend(itemToPush);
      }

      // Peek at top of the queue
      public int peek() {
          // return myQueue.getIteratorAt(myQueue.getSize() - 1).getCurrentInt();
          if (myQueue.getSize() == 0) {
              throw new IllegalArgumentException("Queue is empty.");
          } else {
              return myQueue.getIteratorAt( myQueue.getSize() - 1 ).getCurrentInt();     // we use the iterator
          }
      }

      // Remove front of the queue
      public int deQueue() {
          return myQueue.removeAt( myQueue.getSize() - 1 );
          // return myQueue.removeAt( 0 );
      }

      // Get size of the queue
      public int getSize() {
          return myQueue.getSize();
      }

      // Testers
      public static void main( String[] args ) {
         IntQueue testStack = new IntQueue();
         testStack.enQueue( 222 );
         testStack.enQueue( 19 );
         testStack.enQueue( 23 );
         testStack.enQueue( 29 );
         testStack.enQueue( 31 );
         testStack.enQueue( 37 );
         testStack.enQueue( 41 );
         testStack.enQueue( 99999 );
         testStack.enQueue( 43 );
         testStack.enQueue( 47 );
         testStack.enQueue( 51 );
         testStack.enQueue( 57 );

         System.out.println("The top of the queue is " + testStack.peek() );    // 222
         System.out.println("The size of the stack is " + testStack.getSize() );    // 12
         System.out.println("Removed value is " + testStack.deQueue() );    // 222
         System.out.println("The new size of the stack is " + testStack.getSize() + "\n" );    // 11

         System.out.println("The top of the queue is " + testStack.peek() );    // 19
         System.out.println("The size of the stack is " + testStack.getSize() );    // 11
         System.out.println("Removed value is " + testStack.deQueue() );    // 19
         System.out.println("The new size of the stack is " + testStack.getSize() + "\n" );    // 10

         System.out.println("The top of the queue is " + testStack.peek() );    // 23
         System.out.println("The size of the stack is " + testStack.getSize() );    // 10
         System.out.println("Removed value is " + testStack.deQueue() );    // 23
         System.out.println("The new size of the stack is " + testStack.getSize() + "\n" );    // 9

         System.out.println("The top of the queue is " + testStack.peek() );    // 29
         System.out.println("The size of the stack is " + testStack.getSize() );    // 9
         System.out.println("Removed value is " + testStack.deQueue() );    // 29
         System.out.println("The new size of the stack is " + testStack.getSize() + "\n" );    // 8

         System.out.println("The top of the queue is " + testStack.peek() );    // 31
         System.out.println("The size of the stack is " + testStack.getSize() );    // 8
         System.out.println("Removed value is " + testStack.deQueue() );    // 31
         System.out.println("The new size of the stack is " + testStack.getSize() + "\n" );    // 7

         System.out.println("The top of the queue is " + testStack.peek() );    // 37
         System.out.println("The size of the stack is " + testStack.getSize() );    // 7
         System.out.println("Removed value is " + testStack.deQueue() );    // 37
         System.out.println("The new size of the stack is " + testStack.getSize() + "\n" );    // 6

         System.out.println("The top of the queue is " + testStack.peek() );    // 41
         System.out.println("The size of the stack is " + testStack.getSize() );     // 6
         System.out.println("Removed value is " + testStack.deQueue() );    // 41
         System.out.println("The new size of the stack is " + testStack.getSize() + "\n" );    // 5

         System.out.println("The top of the queue is " + testStack.peek() );    // 99999
         System.out.println("The size of the stack is " + testStack.getSize() );    // 5
         System.out.println("Removed value is " + testStack.deQueue() );    // 99999
         System.out.println("The new size of the stack is " + testStack.getSize() + "\n" );    // 4

         System.out.println("The top of the queue is " + testStack.peek() );    // 43
         System.out.println("The size of the stack is " + testStack.getSize() );    // 4
         System.out.println("Removed value is " + testStack.deQueue() );    // 43
         System.out.println("The new size of the stack is " + testStack.getSize() + "\n" );    // 3

         System.out.println("The top of the queue is " + testStack.peek() );    // 47
         System.out.println("The size of the stack is " + testStack.getSize() );    // 3
         System.out.println("Removed value is " + testStack.deQueue() );    // 47
         System.out.println("The new size of the stack is " + testStack.getSize() + "\n" );    // 2

         System.out.println("Added " + 123456789 + " to the queue." + "\n");
         testStack.enQueue( 123456789 ); // new bottom of the queue

         System.out.println("The top of the queue is " + testStack.peek() );    // 51
         System.out.println("The size of the stack is " + testStack.getSize() );    // 3
         System.out.println("Removed value is " + testStack.deQueue() );    // 51
         System.out.println("The new size of the stack is " + testStack.getSize() + "\n" );    // 2

         System.out.println("The top of the queue is " + testStack.peek() );    // 57
         System.out.println("The size of the stack is " + testStack.getSize() );    // 2
         System.out.println("Removed value is " + testStack.deQueue() );    // 57
         System.out.println("The new size of the stack is " + testStack.getSize() + "\n" );    // 1

         System.out.println("The top of the queue is " + testStack.peek() );    // 123456789
         System.out.println("The size of the stack is " + testStack.getSize() );    // 1
         System.out.println("Removed value is " + testStack.deQueue() );    // 123456789
         System.out.println("The new size of the stack is " + testStack.getSize() + "\n" );    // 0

         System.out.println("Added " + 111 + " to the queue." + "\n");
         testStack.enQueue( 111 ); // new bottom of the queue

         System.out.println("The top of the queue is " + testStack.peek() );    // 111
         System.out.println("The size of the stack is " + testStack.getSize() );    // 1
         System.out.println("Removed value is " + testStack.deQueue() );    // 111
         System.out.println("The new size of the stack is " + testStack.getSize() + "\n" );    // 0

         System.out.println("The top of queue is " + testStack.peek() );    // Will return "Queue is empty."
      }

   }
