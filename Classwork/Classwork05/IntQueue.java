public class IntQueue {

      IntLinkedList myQueue;
      Integer index = 0;

      IntQueue() {
         myQueue = new IntLinkedList();         // constructor
      }

      public void push(int itemToPush ) {
          myQueue.prepend(itemToPush);
      }

      public int peek() {
          if (myQueue.getSize() == 0) {
              return 0;
          } else {
              return myQueue.getIteratorAt( 0 ).getCurrentInt();     // we use the iterator
          }
      }

      public int remove() {
          return myQueue.removeAt( myQueue.getSize() - 1 );
      }

      public int getSize() {
          return myQueue.getSize();
      }

      public static void main( String[] args ) {
         IntQueue testStack = new IntQueue();
         testStack.push( 19 );
         testStack.push( 23 );
         testStack.push( 29 );
         testStack.push( 31 );
         testStack.push( 37 );
         testStack.push( 41 );
         testStack.push( 43 );
         testStack.push( 47 );
         testStack.push( 51 );
         testStack.push( 57 );

         System.out.println("Top of queue: " + testStack.peek() );
         System.out.println("Size of the stack is: " + testStack.getSize() );
         System.out.println("Removed value: " + testStack.remove() );
         System.out.println("The new size of the stack is: " + testStack.getSize() );

         System.out.println("The new top of queue is: " + testStack.peek() );
         System.out.println("Size of the stack is: " + testStack.getSize() );
         System.out.println("Removed value: " + testStack.remove() );
         System.out.println("The new size of the stack is: " + testStack.getSize() );

         // System.out.println( "The top of the queue: " + testStack.peek() );      // 57
         // System.out.println( "Removing back thing: " + testStack.removeAt() + " removed.");         // 57 removed
         // System.out.println(testStack.getSize());
         // System.out.println( "The top of the queue: " + testStack.peek() );      // 51
         // System.out.println( "Removing top thing: " + testStack.removeAt() );         // 51 removed
         // System.out.println( "The top of the queue: " + testStack.peek() );      // 47
         // System.out.println( "Removing top thing: " + testStack.pop() );         // 47 removed
         // System.out.println( "The top of the stack: " + testStack.peek() );      // 43
         // // testStack.push( testStack.pop() + testStack.pop() );
         // System.out.println( "The top of the stack: " + testStack.peek() );      // what'll it be?
      }

   }
