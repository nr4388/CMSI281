public class QueueApp {
    public static void main(String[] args) {
        Queue theQueue = new Queue(10);           // queue holds 10 items
        theQueue.insert(10);
        theQueue.insert(20);
        theQueue.insert(30);
        theQueue.insert(40);
        theQueue.insert(50);
        theQueue.insert(60);
        theQueue.insert(70);
        theQueue.insert(80);
        theQueue.insert(90);                     //insert 10, 20, 30, 40, 50, 60, 70, 80, 90

        theQueue.remove();
        theQueue.remove();
        theQueue.remove();                       // remove 3 items (10, 20, 30)

        theQueue.insert(100);
        theQueue.insert(110);
        theQueue.insert(120);
        theQueue.insert(130);                     // insert 4 more items (wraps arounds)
        theQueue.displayQueueContent();          // 40 50 60 70 80 90 100 110 120 130
        System.out.println( " ");
        while( !theQueue.isEmpty() ) {           //remove and display all items
            long n = theQueue.remove();            // (40, 50, 60, 70, 80, 90, 100, 110, 120, 130)
            System.out.print(n);
            System.out.print(" ");
        }
        System.out.println("");
    }
}
