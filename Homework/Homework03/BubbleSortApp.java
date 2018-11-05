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

        arr.insert(5);
        arr.insert(1);
        arr.insert(7);
        arr.insert(9);
        arr.insert(2);
        arr.insert(3);
        arr.insert(6);
        arr.insert(4);
        arr.insert(8);
        // arr.insert(12);
        arr.insert(10);
        arr.insert(11);

        // arr.insert(5);
        // arr.insert(1);
        // arr.insert(7);
        // // arr.insert(9);
        // arr.insert(2);
        // arr.insert(3);
        // arr.insert(6);
        // arr.insert(8);
        // arr.insert(4);

        arr.display();

        arr.oddEvenSort();
        arr.display();
    }
}
