/** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *  File name     :  CircularLinkedListTester.java
 *  Purpose       :  Created a tester for circular linked list class.
 *  Author        :  Nicolas Raymundo
 *  Date          :  10-17-2018
 *  Description   :  Called methods on linked list to test the class.
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */

public class CircularLinkedListTester {
    public static void main( String[] args ) {
        CircularLinkedList myList = new CircularLinkedList();
        myList.insert( 23 );
        myList.insert( 12 );
        myList.insert( 99 );
        myList.insert( 123 );
        myList.insert( 74 );
        myList.insert( 63 );
        myList.insert( 22 );

        System.out.println("Current Circular Linked List: " + myList.display());   // 23, 12, 99, 123, 74, 63, 22

        System.out.println("\n" + "Deleting last 2 items." + "\n");
        myList.delete();
        myList.delete();

        System.out.println("Current Circular Linked List: " + myList.display() + "\n");   // 23, 12, 99, 123, 74

        System.out.println("Zero index is: " + myList.search(0));   // 23
        System.out.println("One index is: " + myList.search(1));   // 12
        System.out.println("Two index is: " + myList.search(2));   // 99
        System.out.println("Three index is: " + myList.search(3));   // 123
        System.out.println("Four index is: " + myList.search(4));   // 74
        System.out.println("Five index is: " + myList.search(5));   // 23
        System.out.println("Six index is: " + myList.search(6) + "\n");   // 12

        CircularLinkedList.Iterator myIt = myList.getIteratorAt( 0 );
        System.out.println( "Current Node is: " + myIt.getCurrentInt() );   // 23
        myIt.step();
        System.out.println( "Current Node is: " + myIt.getCurrentInt() );   // 12
        myIt.step();
        System.out.println( "Current Node is: " + myIt.getCurrentInt() );   // 99
        myIt.step();
        System.out.println( "Current Node is: " + myIt.getCurrentInt() );   // 123
        myIt.step();
        System.out.println( "Current Node is: " + myIt.getCurrentInt() );   // 74
        myIt.step();
        System.out.println( "Current Node is: " + myIt.getCurrentInt() );   // 23
        myIt.step();
        System.out.println( "Current Node is: " + myIt.getCurrentInt() );   // 12
        myIt.step();
        System.out.println( "Current Node is: " + myIt.getCurrentInt() );   // 99
        myIt.step();
        System.out.println( "Current Node is: " + myIt.getCurrentInt() );   // 123
    }
}
