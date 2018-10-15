public class JosephusTester {
    public static void main( String[] args ) {
        Josephus myList = new Josephus();
        myList.insert( 1 );
        myList.insert( 2 );
        myList.insert( 3 );
        myList.insert( 4 );
        myList.insert( 5 );
        myList.insert( 6 );
        myList.insert( 7 );

        System.out.println(myList.suicideCircle(7, 4, 1));

        // System.out.println(myList.search(7));
        // System.out.println(myList.search(8));
        // System.out.println(myList.search(9));
        // System.out.println(myList.search(10));
        // System.out.println(myList.search(11));
        // System.out.println(myList.search(12));
        // System.out.println(myList.search(13));
        // System.out.println(myList.search(14));

        // myList.suicideCircle(7, 4, 1);

        Josephus.Iterator myIt = myList.getIteratorAt( 0 );
        System.out.println( "Current Node is: " + myIt.getCurrentInt() );   // 23
        myIt.step();
        System.out.println( "Current Node is: " + myIt.getCurrentInt() );   // 12
        myIt.step();
        System.out.println( "Current Node is: " + myIt.getCurrentInt() );   // 99
    }
}
