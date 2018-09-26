/** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *  File name     :  IntLinkedListTester.java
 *  Purpose       :  Tester to see if methods for linked list manipulation worked.
 *  Author        :  Nicolas Raymundo
 *  Date          :  09-18-2018
 *  Description   :  Implemented tests to create a linked list and add/remove nodes after creation.
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */

public class IntLinkedListTester2 {
    public static void main( String[] args ) {
        IntLinkedList2 myList = new IntLinkedList2();
        myList.prepend( 23 );
        myList.prepend( 19 );
        myList.prepend( 17 );
        myList.prepend( 13 );
        myList.prepend( 11 );
        myList.prepend(  7 );
        myList.prepend(  5 );
        myList.prepend(  3 );
        myList.prepend(  2 );
        // myList.insertAt(8, 696969);
        myList.removeAt(2);
        // myList.removeAt(2);
        // myList.insertAt(5, 1414);
        // myList.insertAt(7, 3535);
        // myList.removeAt(4);
        // myList.removeAt(9); // Will return an error because index 9 is not in list.
        IntLinkedList2.Iterator myIt = myList.getIteratorAt( 0 );
        System.out.println( "Current Node is: " + myIt.getCurrentInt() );    // 2
        myIt.next();
        System.out.println( "Current Node is: " + myIt.getCurrentInt() );    // 3
        myIt.next();
        System.out.println( "Current Node is: " + myIt.getCurrentInt() );    // 5
        myIt.next();
        System.out.println( "Current Node is: " + myIt.getCurrentInt() );    // 7
        myIt = myList.getIteratorAt( 3 );
        System.out.println( "Current Node is: " + myIt.getCurrentInt() );    // 7
        myIt.next();
        System.out.println( "Current Node is: " + myIt.getCurrentInt() );    // 11
        myIt.next();
        System.out.println( "Current Node is: " + myIt.getCurrentInt() );    // 13
        myIt.next();
        System.out.println( "Current Node is: " + myIt.getCurrentInt() );    // 17
        myIt.next();
        System.out.println( "Current Node is: " + myIt.getCurrentInt() );
        // myIt.next();
        // System.out.println( "Current Node is: " + myIt.getCurrentInt() );
    }
}
