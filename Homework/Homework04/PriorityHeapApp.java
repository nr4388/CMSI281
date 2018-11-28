/** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *  File name     :  PriorityHeapApp.java
 *  Purpose       :  Used PriorityQueueApp from book and edited it to be able to test PriorityHeap.java
 *  Author        :  Maya Pegler Gordon, Nicolas Raymundo, Talia Bahar
 *  Date          :  11-25-2018
 *  Description   :  Edited methods to be able to add/delete items from the heap.
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */

public class PriorityHeapApp {
 public static void main(String[] args) {
   PriorityHeap thePH = new PriorityHeap(5);
   thePH.insert(30);
   thePH.insert(50);
   thePH.insert(10);
   thePH.insert(40);
   thePH.insert(20);

   System.out.println("Is the heap empty: " + thePH.isEmpty() + "\n");

   System.out.println("Emptying heap:");
   while( !thePH.isEmpty() ) {
     System.out.println();
     int item = thePH.remove();
     System.out.print("Removed value: " + item + " "); // 50, 40, 30, 20, 10} // end while
     System.out.println("");
   }

   System.out.println("\nIs the heap empty: " + thePH.isEmpty());

   System.out.println("\nReinitializing heap...");
   thePH.insert(90);
   thePH.insert(1000);
   thePH.insert(12);
   thePH.insert(143);
   thePH.insert(203);

   System.out.println("\nIs the heap empty: " + thePH.isEmpty());

   System.out.println("\nEmptying heap:");
   while( !thePH.isEmpty() ) {
     System.out.println();
     int item = thePH.remove();
     System.out.print("Removed value: " + item + " "); // 1000, 203, 143, 90, 12} // end while
     System.out.println("");
   }

   System.out.println("\nIs the heap empty: " + thePH.isEmpty());

 }
}
