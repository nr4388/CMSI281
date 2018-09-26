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
          if (myQueue.size == 0) {
              return 0;
          } else {
              return myQueue.getIteratorAt( 0 ).getCurrentInt();     // we use the iterator
          }
      }

      public int removeLastNode() {
          return myQueue.removeAt( myQueue.getSize() - 1 );
      }

      public int getSize() {
          return myQueue.getSize();
      }

      public static void main( String[] args ) {
         IntQueue testStack = new IntQueue();
         testStack.push( 19 );
         // System.out.println(testStack.peek());
         testStack.push( 23 );
         // System.out.println(testStack.peek());
         testStack.push( 29 );
         // System.out.println(testStack.peek());
         testStack.push( 31 );
         // System.out.println(testStack.peek() );
         // System.out.println("Size: " + testStack.getSize());
         // testStack.removeLastNode();
         // System.out.println("SIze: " + testStack.getSize());
         // testStack.removeLastNode();
         // System.out.println("SIze: " + testStack.getSize());
         // testStack.removeLastNode();
         // System.out.println("SIze: " + testStack.getSize());
         // System.out.println(testStack.peek() );
         // testStack.removeLastNode();
         // System.out.println("SIze: " + testStack.getSize());
         // testStack.push( 37 );
         // testStack.push( 41 );
         // testStack.push( 43 );
         // testStack.push( 47 );
         // testStack.push( 51 );
         // testStack.push( 57 );
         System.out.println( "The top of the queue: " + testStack.peek() );      // 57
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
