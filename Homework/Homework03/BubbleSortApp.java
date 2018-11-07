/** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *  File name     :  bubbleSortApp.java
 *  Purpose       :  Tester for bubbleSort.java file.
 *  Author        :  Nicolas Raymundo, Talia Bahar, Maya Pegler
 *  Date          :  11-05-2018
 *  Description   :  Edited tests for bubbleSort to work with EvenOddSort.
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */

class BubbleSortApp {
    public static void main(String[] args) {
        int maxSize = 100;
        ArrayBub arr;
        arr = new ArrayBub(maxSize);

        arr.insert(5);                                          // Insert 5
        arr.insert(1);                                          // Insert 1
        arr.insert(7);                                          // Insert 7
        arr.insert(9);                                          // Insert 9
        arr.insert(2);                                          // Insert 2
        arr.insert(3);                                          // Insert 3
        arr.insert(6);                                          // Insert 6
        arr.insert(4);                                          // Insert 4
        arr.insert(8);                                          // Insert 8
        arr.insert(10);                                         // Insert 10
        arr.insert(11);                                         // Insert 11

        System.out.println("Displaying unsorted array:" );
        arr.display();                                          // Display: 5 1 7 9 2 3 6 4 8 10 11

        System.out.println("\nSorting...\n");
        arr.oddEvenSort();                                      // Sort

        System.out.println("Displaying sorted array:");
        arr.display();                                          // Display: 1 2 3 4 5 6 7 8 9 10 11

        System.out.println("\nAdding new values.\n");

        arr.insert(13);                                         // Insert 13
        arr.insert(19);                                         // Insert 19
        arr.insert(12);                                         // Insert 12
        arr.insert(16);                                         // Insert 16
        arr.insert(14);                                         // Insert 14
        arr.insert(20);                                         // Insert 20
        arr.insert(17);                                         // Insert 17
        arr.insert(15);                                         // Insert 15
        arr.insert(18);                                         // Insert 18

        System.out.println("Displaying unsorted array:" );
        arr.display();                                          // Display: 1 2 3 4 5 6 7 8 9 10 11 13 19 12 16 14 20 17 15 18

        System.out.println("\nSorting...\n");
        arr.oddEvenSort();                                      // Sort

        System.out.println("Displaying sorted array:");
        arr.display();                                          // Display: 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20
    }
}
