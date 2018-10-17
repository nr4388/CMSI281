public class DequeApp {
    public static void main(String[] args) {
        Deque theDeque = new Deque(4);           // queue holds 4 items

        theDeque.insertLeft(12);
        theDeque.insertLeft(13);
        theDeque.insertLeft(11);
        theDeque.insertLeft(98);                // 98, 11, 13, 12

        System.out.println("Starting " + theDeque.displayDequeContent());     // 98, 11, 13, 12

        System.out.println("\n");

        System.out.println("Inserting right. Expected: Deque is full.");
        theDeque.insertRight(12);               // Deque is full

        System.out.println("\n");

        System.out.println("Removing right. Expected: 98 11 13");
        theDeque.removeRight();
        System.out.println(theDeque.displayDequeContent()+ "\n");       // 98 11 13

        System.out.println("Inserting left. Expected: 98 11 13 76");
        theDeque.insertRight(76);               // 98 11 13 76
        System.out.println(theDeque.displayDequeContent()+ "\n");       // 98 11 13 76

        System.out.println("Inserting left. Expected: Deque is full.");
        theDeque.insertLeft(12);               // Deque is full

        System.out.println("\n");

        System.out.println("Clearing array. Expected: Empty deque");
        theDeque.removeRight();
        theDeque.removeRight();
        theDeque.removeRight();
        theDeque.removeRight();
        System.out.println(theDeque.displayDequeContent()+ "\n");       // Empty deque

        System.out.println("Creating deque by interchanging insertRight and insertLeft. Expected: 99 14 32 42");
        theDeque.insertLeft(14);
        theDeque.insertRight(32);
        theDeque.insertLeft(99);
        theDeque.insertRight(42);
        System.out.println(theDeque.displayDequeContent()+ "\n");       // 99 14 32 42

        System.out.println("Inserting left. Expected: Deque is full.");
        theDeque.insertLeft(87);

        System.out.println("\n");

        System.out.println("Removing left. Expected: 14 32 42");
        theDeque.removeLeft();
        System.out.println(theDeque.displayDequeContent()+ "\n");       // 14 32 42

        System.out.println("Removing right. Expected: 14 32");
        theDeque.removeRight();
        System.out.println(theDeque.displayDequeContent()+ "\n");       // 14 32

        System.out.println("Inserting left. Expected: 52 14 32");
        theDeque.insertRight(52);               // 98 11 13 76
        System.out.println(theDeque.displayDequeContent()+ "\n");       // 52 14 32

        System.out.println("Inserting left. Expected: 79 52 14 32");
        theDeque.insertRight(79);               // 98 11 13 76
        System.out.println(theDeque.displayDequeContent()+ "\n");       // 79 52 14 32

    }
}
