public class DequeApp {
    public static void main(String[] args) {
        Deque theDeque = new Deque(4);           // queue holds 4 items

        theDeque.insertLeft(12);
        theDeque.insertRight(13);
        theDeque.insertLeft(11);
        theDeque.insertRight(14);   // 11, 12, 13, 14
        theDeque.insertRight(15);   // 12, 13, 14, 14
        theDeque.insertRight(16);   // 13, 14, 15, 16
        theDeque.insertLeft(12);    // 12, 13, 14, 15
        theDeque.insertLeft(11);    // 11, 12, 13, 14
        theDeque.insertLeft(10);    // 10, 11, 12, 13
        theDeque.insertRight(14);   // 11, 12, 13, 14
        theDeque.insertRight(15);   // 12, 13, 14, 15

        theDeque.removeRight(); // 12, 13, 14

        theDeque.insertRight(15);   // 12, 13, 14, 15

        theDeque.removeLeft();  // 13, 14, 15

        theDeque.insertLeft(12);    // 12, 13, 14, 15
        theDeque.insertRight(16);   // 13, 14, 15 ,16
        theDeque.insertLeft(12);    // 12, 13, 14, 15
        theDeque.insertLeft(11);    // 11, 12, 13, 14
        theDeque.insertLeft(10);    // 10, 11, 12, 13
        theDeque.insertRight(14);   // 11, 12, 13, 14
        theDeque.insertLeft(10);    // 10, 11, 12, 13

        theDeque.removeLeft();  // 11, 12, 13
        theDeque.removeLeft();  // 12, 13

        theDeque.insertLeft(11);    // 11, 12, 13
        theDeque.insertLeft(10);    // 10, 11, 12, 13

        theDeque.removeLeft();  // 11, 12, 13
        theDeque.removeLeft();  // 12, 13
        theDeque.removeLeft();  // 13
        theDeque.removeLeft(); // empty deque

        theDeque.insertLeft(12);
        theDeque.insertRight(13);
        theDeque.insertLeft(11);
        theDeque.insertRight(14);   // 11, 12, 13, 14

        // System.out.println( " ");
        while( !theDeque.isEmpty() ) {           //remove and display all items
            long n = theDeque.removeLeft();
            System.out.print(n);
            System.out.print(" ");
        }
        System.out.println("");
    }
}
