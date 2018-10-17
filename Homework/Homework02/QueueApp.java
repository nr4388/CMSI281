/** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *  File name     :  QueueApp.java
 *  Purpose       :  Test file to test queue class display method.
 *  Author        :  Nicolas Raymundo
 *  Date          :  10-17-2018
 *  Description   :  Called display method on queue class to test if it works.
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */

public class QueueApp {
    public static void main(String[] args) {
        Queue theQueue = new Queue(5);           // queue holds 5 items

        System.out.println("Inserting 10, 20, 30, 40, 50");

        theQueue.insert(10);
        theQueue.insert(20);
        theQueue.insert(30);
        theQueue.insert(40);
        theQueue.insert(50);                     //insert 10, 20, 30, 40, 50

        theQueue.displayQueueContent();

        System.out.println("\n" + "Removing 10, 20, 30");

        theQueue.remove();
        theQueue.remove();
        theQueue.remove();                       // remove 3 items (10, 20, 30)
        theQueue.displayQueueContent();          // 40, 50

        System.out.println("\n" + "Inserting 60, 70, 80");

        theQueue.insert(60);
        theQueue.insert(70);
        theQueue.insert(80);                     // insert 2 more items
        theQueue.displayQueueContent();          // 40 50 60 70
        System.out.println( " ");
        while( !theQueue.isEmpty() ) {           //remove and display all items
            long n = theQueue.remove();          // (40, 50, 60, 70, 80, 90, 100, 110, 120, 130)
            System.out.print(n);
            System.out.print(" ");
        }
        System.out.println("");
    }
}
