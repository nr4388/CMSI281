public class CircularLinkedListTester {
    public static void main( String[] args ) {
        CircularLinkedList myList = new CircularLinkedList();
        myList.insert( 23 );
        myList.insert( 12 );
        myList.insert( 99 );
        myList.insert( 123 );
        CircularLinkedList.Iterator myIt = myList.getIteratorAt( 0 );
        System.out.println( "Current Node is: " + myIt.getCurrentInt() );   // 23
        myIt.next();
        System.out.println( "Current Node is: " + myIt.getCurrentInt() );   // 12
        myIt.next();
        System.out.println( "Current Node is: " + myIt.getCurrentInt() );   // 99
        myIt.next();
        System.out.println( "Current Node is: " + myIt.getCurrentInt() );   // 123
    }
}
