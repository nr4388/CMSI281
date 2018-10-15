public class CircularLinkedList {
    private Node current;
    private int size;

    public CircularLinkedList() {
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
        Iterator pointer = getIteratorAt(getSize() - 2);
        pointer.currentNode.next = pointer.currentNode.next.next;
    }

    public int getSize() {
        return size;
    }

    public int getNodeIndex() {
        int counter = 0;
        for (int i = 0; i < getSize(); i++) {
            Iterator it = new Iterator();
            while (it.hasNext()) {
                counter++;
            }
        }
        return counter;
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

       public void next() {
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
       if( (index > size) || (index < 0) ) {
          throw new IllegalArgumentException();
       }
       Iterator it = new Iterator();
       while( index > 0 ) {
          it.next();
          index--;
       }
       return it;
    }

}
