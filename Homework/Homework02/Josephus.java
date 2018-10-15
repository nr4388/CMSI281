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

    public void delete() {
        if (getSize() == 1) {
            current = null;
            size--;
        } else {
            Iterator pointer = getIteratorAt(getSize() - 2);
            pointer.currentNode.next = pointer.currentNode.next.next;
            size--;
        }
    }

    public String suicideCircle(int numberOfPeople, int interval, int startingPerson) {
        // Josephus myCircle = new Josephus();
        // for (int i = 0; i < numberOfPeople; i++) {
        //     myCircle.insert(9);
        // }
        int number = interval - 1;
        String eliminatedPeople = "";
        if (getSize() == 0) {
            throw new IllegalArgumentException("Linked list is empty.");
        } else {
            while (getSize() > 1) {
                eliminatedPeople += (search(number) + " ");
                number += 2;
                size--;
            }
        }
        return eliminatedPeople;
    }

    // ASK WHAT TO DO IF WE ARE SEARCHING FOR AN INDEX > SIZE
    public int search(int index) {
        if (getSize() == 0) {
            throw new IllegalArgumentException("Linked list is empty.");
        }
        Iterator pointer = getIteratorAt(index);
        return pointer.getCurrentInt();
    }

    public String display() {
        if (getSize() == 0) {
            return null;
        }
        String list = "";
        Iterator pointer = getIteratorAt(0);
        for (int i = 0; i < getSize(); i++) {
            if (i < (getSize() - 1)) {
                list += (pointer.getCurrentInt() + ", ");
            } else {
                list += (pointer.getCurrentInt());
            }
            pointer.step();
        }
        return list;
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
