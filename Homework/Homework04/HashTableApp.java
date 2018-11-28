/** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *  File name     :  HashTableApp.java
 *  Purpose       :  Used the HashTableApp program from the textbook to be able to test the HashTable class.
 *  Author        :  Maya Pegler Gordon, Nicolas Raymundo, Talia Bahar
 *  Date          :  11-25-2018
 *  Description   :  Edited/Added methods to be able to input strings and convert strings to hashed values.
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */

import java.io.*;
class HashTableApp {
    static int HashTableSize;
    public static void main(String[] args) throws IOException {
        DataItem aDataItem;
        int aKey, size, n, keysPerCell;

        System.out.print("Enter size of hash table: ");
        size = getInt();
        System.out.print("Enter initial number of items: ");
        n = getInt();
        keysPerCell = 10;

        HashTable theHashTable = new HashTable(size);
        HashTableSize = size;

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
                    String userString = getString();
                    aKey = stringToInt(userString);
                    aDataItem = new DataItem(aKey);
                    theHashTable.insert(aDataItem);
                    break;
                case 'd':
                    System.out.print("Enter key value to delete: ");
                    aKey = stringToInt(getString());
                    theHashTable.delete(aKey);
                    break;
                case 'f':
                    System.out.print("Enter key value to find: ");
                    aKey = stringToInt(getString());
                    aDataItem = theHashTable.find(aKey);
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

    public static int stringToInt(String key) {
        int hashVal = 0;
        int pow27 = 1;
        for(int j=0; j<key.length(); j++) {
            int letter = key.charAt(j) - 96;
            hashVal += pow27 * letter;
            pow27 *= 27;
        }
        return hashVal % HashTableSize;
   }
}
