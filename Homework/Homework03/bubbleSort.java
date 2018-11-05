/** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *  File name     :  bubbleSort.java
 *  Purpose       :  Created a EvenOddSort method from a bubbleSort.java file.
 *  Author        :  Nicolas Raymundo, Talia Bahar, Maya Pegler
 *  Date          :  11-05-2018
 *  Description   :  Took a bubbleSort method and turned it into a EvenOddSort method.
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */

class ArrayBub {
    private long[] a; // ref to array a private
    int nElems; // number of data items

    public ArrayBub(int max) {
        a = new long[max]; nElems = 0;
    }

    public void insert(long value) {
        a[nElems] = value; nElems++;
    }

    public void display() {
        for(int j=0; j<nElems; j++) {
            System.out.print(a[j] + " ");
        }
        System.out.println("");
    }

    public void swapOdds() {
        int isLengthOdd = 0;
        if (nElems % 2 == 1) {
            isLengthOdd = 1;
        }
        for (int i = 0; i < nElems - isLengthOdd; i++) {
            if (a[i] > a[i+1]) {
                swap(i, i+1);
            }
            i++;
        }
    }

    public void swapEvens() {
        for (int j = 1; j < nElems - 1; j++) {
            if (a[j] > a[j+1]) {
                swap(j, j+1);
            }
            j++;
        }
    }

    public void oddEvenSort() {
        int out, in;

        for(out=nElems-1; out>1; out--) {
            for(in=0; in<out; in++) {
                swapOdds();
                swapEvens();
            }
            if (isSorted()) {
                break;
            }
        }
    }

    public boolean isSorted() {
        boolean isSorted = true;
        for (int k = 0; k < nElems; k++) {
            if (a[k] < a[k+1]) {
                return true;
            } else {
                return false;
            }
        }
        return isSorted;
    }

    // public void oddEvenSort() {
    //     if (nElems % 2 == 0) {
    //         for (int i = 0; i < nElems; i++) {
    //             System.out.println("i: " + i + " a[i]: " + a[i]);
    //             if (a[i] > a[i+1]) {
    //                 swap(i, i+1);
    //             }
    //             i++;
    //         }
    //     } else {
    //         for (int i = 0; i < nElems - 1; i++) {
    //             System.out.println("i: " + i + " a[i]: " + a[i]);
    //             if (a[i] > a[i+1]) {
    //                 swap(i, i+1);
    //             }
    //             i++;
    //         }
    //     }
    //     for (int j = 1; j < nElems - 1; j++) {
    //         System.out.println("j: " + j + " a[j]: " + a[j]);
    //         if (a[j] > a[j+1]) {
    //             swap(j, j+1);
    //         }
    //         j++;
    //     }
    // }

    // public void oddEvenSort() {
    //     int out, in;
    //
    //     for(out=nElems-1; out>1; out--) {
    //         System.out.println("OUT: " + out);
    //         for(in=0; in<out; in++) {
    //             System.out.println("IN: " + in);
    //             if( a[in] > a[in+1] ) {
    //                 swap(in, in+1);
    //             }
    //         }
    //     }
    // }

    // The idea is to repeatedly make two passes through the array.
    // On the first pass you look at all the pairs of items, a[j] and a[j+1], where j is odd (j = 1, 3, 5, …).
    // If their key values are out of order, you swap them.
    // On the second pass you do the same for all the even values (j = 2, 4, 6, …).
    // You do these two passes repeatedly until the array is sorted.
    // Replace the bubbleSort() method in bubbleSort.java (Listing 3.1) with an oddEvenSort() method.

    private void swap(int one, int two) {
        long temp = a[one];
        a[one] = a[two];
        a[two] = temp;
    }

}
