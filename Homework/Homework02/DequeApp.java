public class DequeApp {
    public static void main(String[] args) {
        Deque theDeque = new Deque(4);           // queue holds 10 items
        // theDeque.insertRight(99);
        // theDeque.insertRight(16);
        // theDeque.insertLeft(69);
        // theDeque.insertLeft(33);
        //
        // theDeque.removeRight();
        // theDeque.removeRight();
        // theDeque.removeRight();
        // theDeque.removeRight();
        // theDeque.insertLeft(12);
        // theDeque.displayDequeContent();
        // theDeque.insertRight(9696);

        theDeque.insertLeft(12);
        theDeque.insertRight(13);
        theDeque.insertLeft(11);
        theDeque.insertRight(14);
        theDeque.insertRight(15);
        theDeque.insertRight(16);
        theDeque.insertLeft(12);
        theDeque.insertLeft(11);
        theDeque.insertLeft(10);
        theDeque.insertRight(14);
        theDeque.insertRight(15);

        theDeque.removeRight();

        theDeque.insertRight(15);

        theDeque.removeLeft();

        theDeque.insertLeft(12);
        theDeque.insertRight(16);
        theDeque.insertLeft(12);
        theDeque.insertLeft(11);
        theDeque.insertLeft(10);
        theDeque.insertRight(14);
        theDeque.insertLeft(10);

        // theDeque.removeRight();  // Breaks here
        // theDeque.removeRight();
        // theDeque.removeRight();
        // theDeque.removeRight();
        //
        // theDeque.insertLeft(12);
        // theDeque.insertRight(13);


        // theDeque.removeLeft();
        // theDeque.removeRight();
        // System.out.println(theDeque.isFull());
        // theQueue.insert(20);
        // theQueue.insert(30);
        // theQueue.insert(40);                     //insert 10,20,30,40
        // theQueue.insert(50);
        // theQueue.insert(60);
        // theQueue.insert(70);
        // theQueue.insert(80);
        // theQueue.insert(90);
        // theQueue.remove();
        // theQueue.remove();
        // theQueue.remove();                       // remove 3 items (10, 20, 30)
        // theQueue.insert(100);
        // theQueue.insert(110);
        // theQueue.insert(120);
        // theQueue.insert(130);                     // insert 4 more items (wraps arounds)
        // theQueue.displayQueueContent();          // 40 50 60 70 80 90 100 110 120 130
        // System.out.println( " ");
        while( !theDeque.isEmpty() ) {           //remove and display all items
            long n = theDeque.removeLeft();            // (40, 50, 60, 70, 80, 90, 100, 110, 120, 130)
            System.out.print(n);
            System.out.print(" ");
        }
        System.out.println("");
    }
}
