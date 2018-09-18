/** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *  File name     :  HighArray.java
 *  Purpose       :  Create methods to manipulate arrays.
 *  Author        :  Nicolas Raymundo
 *  Date          :  09-17-2018
 *  Description   :  Implemented various methods to find values in the array, find and delete duplicates, insert new values, etc.
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */

class HighArray {
    private long[] a; // ref to array a
    private int nElems;
    public HighArray(int max) {
        a = new long[max];
        nElems = 0;
    }

    public long getMax() {
        long maxValue = -1;
        for (int i = 0; i < nElems; i++) {
            if (a[i] > maxValue) {
                maxValue = a[i];
            }
        }
        return maxValue;
    }

    public void noDups() {
        boolean duplicates;
        for (int i = nElems - 1; i >= 1; i--) {
            for (int j = i - 1; j >= 0; j--) {
                if (a[i] == a[j]) {
                    delete(a[j]);
                }
            }
        }
    }

    public boolean find(long searchKey) {
        int j;
        for(j=0; j<nElems; j++) {
            if(a[j] == searchKey) {
                break;
            }
        }
        if(j == nElems) {
            return false;
        } else {
            return true;
        }
    }

    public void insert(long value) {
        a[nElems] = value;
        nElems++;
    }

    public boolean delete(long value) {
        int j;
        boolean variable = true;
        for(j=0; j<nElems; j++) {
            if (value == a[j]) {
                break;
            }
        }
        if (j==nElems) {
            return !variable;
        } else {
            for(int k=j; k<nElems; k++) {
                a[k] = a[k+1];
            }
            nElems--;
            return variable;
        }
    }

    public void display() {
        for(int j=0; j<nElems; j++) {
            System.out.print(a[j] + " ");
        }
        System.out.println("");
    }
}
