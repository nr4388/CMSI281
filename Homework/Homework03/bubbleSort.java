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

    private void swap(int one, int two) {
        long temp = a[one];
        a[one] = a[two];
        a[two] = temp;
    }

}
