/** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *  File name     :  Hash.java
 *  Purpose       :  HashTable class to be able to create a table of hashed values.
 *  Author        :  Maya Pegler Gordon, Nicolas Raymundo, Talia Bahar
 *  Date          :  11-25-2018
 *  Description   :  Used the class from the book to be able to create a hash table and insert/delete/show values.
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */

import java.io.*;
class DataItem {
    private int iData;
    public DataItem(int ii) {
        iData = ii;
    }

     public int getKey() {
         return iData;
     }
}

class HashTable {
    private DataItem[] hashArray;
    private DataItem nonItem;
    private int arraySize;
    public HashTable(int size) {
        arraySize = size;
        hashArray = new DataItem[arraySize];
        nonItem = new DataItem(-1);
    }

    public void displayTable() {
        System.out.print("Table: ");
        for(int j=0; j<arraySize; j++) {
            if(hashArray[j] != null) {
                System.out.print(hashArray[j].getKey() + " ");
            } else {
                System.out.print("** ");
            }
        System.out.println("");
        }
    }

    public int hashFunc(int key) {
        return (key % arraySize);
    }

    public void insert(DataItem item) {
        int key = item.getKey(); // extract key
        int hashVal = hashFunc(key);
        while(hashArray[hashVal] != null && hashArray[hashVal].getKey() != -1) {
            ++hashVal;
            hashVal %= arraySize;
        }
        hashArray[hashVal] = item;
    }

    public DataItem delete(int key) {
        int hashVal = hashFunc(key);
        while(hashArray[hashVal] != null) {
            if(hashArray[hashVal].getKey() == key) {
                DataItem temp = hashArray[hashVal];
                hashArray[hashVal] = nonItem;
                return temp;
            }
            ++hashVal;
            hashVal %= arraySize;
        }
        return null;
    }

    public DataItem find(int key) {
        int hashVal = hashFunc(key);
        while(hashArray[hashVal] != null) {
            if(hashArray[hashVal].getKey() == key) {
                return hashArray[hashVal];
            }
        ++hashVal;
        hashVal %= arraySize;
        }
        return null;
    }

}
