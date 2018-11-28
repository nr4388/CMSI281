/** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *  File name     :  HashTableAppFolding.java
 *  Purpose       :  Tester file for HashTable.java
 *  Author        :  Maya Pegler Gordon, Nicolas Raymundo, Talia Bahar
 *  Date          :  11-25-2018
 *  Description   :  Used HashTable class to be able to create a hash table and insert values that were digitally-folded.
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */

import java.io.*;
class HashTableAppFolding {
    public static int tableSize;
    public static void main(String[] args) throws IOException {
        DataItem aDataItem;
        int aKey, aFoldedKey, size, n, keysPerCell;
        System.out.print("Enter size of hash table: ");
        size = getInt();
        System.out.print("Enter initial number of items: ");
        n = getInt();
        keysPerCell = 10;
        // make table
        HashTable theHashTable = new HashTable(size);
        tableSize = size;
        for(int j=0; j<n; j++) {
            aKey = (int)(java.lang.Math.random() * keysPerCell * size);
            aDataItem = new DataItem(aKey);
            theHashTable.insert(aDataItem);
        }
        while(true) {
            System.out.print("Enter first letter of ");
            System.out.print("show, insert, delete, or find: ");
            char choice = getChar();
            switch(choice) {
                case 's':
                    theHashTable.displayTable();
                    break;
                case 'i':
                System.out.print("Enter key value to insert: ");
                    aKey = getInt();
                    aFoldedKey = getFolded(aKey);
                    aDataItem = new DataItem(aFoldedKey);
                    theHashTable.insert(aDataItem);
                    break;
                case 'd':
                    System.out.print("Enter key value to delete: ");
                    aKey = getInt();
                    aFoldedKey = getFolded(aKey);
                    theHashTable.delete(aFoldedKey);
                    break;
                case 'f':
                    System.out.print("Enter key value to find: ");
                    aKey = getInt();
                    aFoldedKey = getFolded(aKey);
                    aDataItem = theHashTable.find(aFoldedKey);
                    if(aDataItem != null) {
                        System.out.println("Found " + aKey);
                    } else {
                        System.out.println("Could not find " + aKey);
                    }
                    break;
                    default:
                        System.out.print("Invalid entry\n");
            }
        }
    }

    public static String getString() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        return s;
    }

    public static char getChar() throws IOException {
        String s = getString();
        return s.charAt(0);
    }

    public static int getInt() throws IOException {
        String s = getString();
        return Integer.parseInt(s);
    }

    public static int getFolded(int num) {
        int numLength = String.valueOf(num).length();
        int tableNumSize = String.valueOf(tableSize).length();

        int numOfSections = 1;
        int newNum = 0;

        if (numLength > tableNumSize) {
            for (int i = 1; numLength / i >= tableNumSize; i++) {
                numOfSections++;
            }
        } else {
            numOfSections = 1;
        }
        String numAsString = String.valueOf(num);
        String[] listOfStrings = numAsString.split("(?<=\\G.{" + numLength/numOfSections + "})");
        for (int j = 0; j < listOfStrings.length; j++) {
            newNum += Integer.parseInt(listOfStrings[j]);
        }

        int finalNum = newNum % tableSize;
        return finalNum;
    }
}
