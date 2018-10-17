/** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *  File name     :  Josephus.java
 *  Purpose       :  Circuar linked list file turned into file to do the Josephus problem.
 *  Author        :  Nicolas Raymundo
 *  Date          :  10-17-2018
 *  Description   :  Added elimination method to do the Josephus problem.
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */

public class Josephus {
    private Node current;
    private int size;

    public Josephus() {
        current = null;
        size = 0;
    }

    public void insert(int dataValue) {
        Node newNode = new Node(dataValue);
        if (getSize() == 0) {
            current = newNode;
            newNode.next = newNode;
        } else {
            Iterator pointer = getIteratorAt(getSize() - 1);
            pointer.currentNode.next = newNode;
            newNode.next = current;
        }
        size++;
    }

    public void deleteAt(int index) {
        Iterator pointer = getIteratorAt(index - 1);
        pointer.currentNode.next = pointer.currentNode.next.next;
    }

    public String elimination(int numberOfPeople, int interval) {
        String eliminated = "The list, in order of elimination: ";
        String result = "Playing the Josephus Problem with " + numberOfPeople + " people, eliminating at an interval of " + interval + ", the last man standing is: " ;
        Josephus myCircle = new Josephus();
        for (int i = 1; i <= numberOfPeople; i++) {
            myCircle.insert(i);
            myCircle.size++;
        }
        Iterator pointer = myCircle.getIteratorAt(0);
        while (myCircle.getSize() > 2) {
                for (int j = 0; j < interval; j++) {
                    for (int k = 0; k < numberOfPeople; k++) {
                        if (pointer.getCurrentInt() == 0) {
                        pointer.step();
                        }
                    }
                    if (j == (interval - 1)) {
                        eliminated += (pointer.getCurrentInt() + " ");
                        pointer.currentNode.data = 0;
                        myCircle.size--;
                        // myCircle.size--;
                        pointer.step();
                    } else {
                        pointer.step();
                    }
                }
                myCircle.size--;
        }
        if (myCircle.getSize() == 2) {
            for (int i = 0; i < numberOfPeople; i++) {
                if (myCircle.search(i) != 0) {
                    System.out.println((result += myCircle.search(i)));
                }
            }
        }
        return eliminated;
    }

    public int search(int index) {
        if (getSize() == 0) {
            throw new IllegalArgumentException("Linked list is empty.");
        }
        Iterator pointer = getIteratorAt(index);
        return pointer.getCurrentInt();
    }

    public int getSize() {
        return size;
    }

    private class Node {
       int data;            // remember this is an IntLinkedList
       Node next;           // here's the self-referential part

       // constructor
       Node( int d ) {
          data = d;
          next = null;
       }
    }

    public class Iterator {
       private Node currentNode;

       Iterator() {
          currentNode = current;
       }

       public void step() {
          if( currentNode == null ) {
             return;
          } else {
             currentNode = currentNode.next;
          }
       }

       public boolean hasNext() {
          return ((currentNode != null) && (currentNode.next != null));
       }

       public int getCurrentInt() {
          return currentNode.data;
       }

    }

    public Iterator getIteratorAt( int index ) {
       // if( (index > getSize() - 1) || (index < 0) ) {
       //    throw new IllegalArgumentException();
       // }
       Iterator it = new Iterator();
       while( index > 0 ) {
          it.step();
          index--;
       }
       return it;
    }

}
