public class JosephusTester {
    public static void main( String[] args ) {
        Josephus myList = new Josephus();
        myList.insert( 1 );
        myList.insert( 2 );
        myList.insert( 3 );
        myList.insert( 4 );

        System.out.println(myList.suicideCircle(4, 3, 2));

        // myList.deleteAt(1);
        // myList.deleteAt(1);

        // System.out.println(myList.search(0));
        // System.out.println(myList.search(1));
        // System.out.println(myList.search(2));
        // System.out.println(myList.search(3));

        // System.out.println(myList.search(7));
        // System.out.println(myList.search(8));
        // System.out.println(myList.search(9));
        // System.out.println(myList.search(10));
        // System.out.println(myList.search(11));
        // System.out.println(myList.search(12));
        // System.out.println(myList.search(13));
        // System.out.println(myList.search(14));

        // myList.suicideCircle(7, 4, 1);

        // Josephus.Iterator myIt = myList.getIteratorAt( 0 );
        // System.out.println( "Current Node is: " + myIt.getCurrentInt() );   // 23
        // myIt.step();
        // System.out.println( "Current Node is: " + myIt.getCurrentInt() );   // 12
        // myIt.step();
        // System.out.println( "Current Node is: " + myIt.getCurrentInt() );   // 99
        // myIt.step();
        // System.out.println( "Current Node is: " + myIt.getCurrentInt() );   // 99
        // myIt.step();
        // System.out.println( "Current Node is: " + myIt.getCurrentInt() );   // 99
        // myIt.step();
        // System.out.println( "Current Node is: " + myIt.getCurrentInt() );   // 99
    }
}
