class Link {
    public long data;
    public Link next;

    public Link(long d) {
        data = d;
    }

    public void displayLink() {
        System.out.print(data + " ");
    }
}

class Stack {
    private Link first;
    private Link current;
    private int size;

    public Stack() {
        first = null;
        current = null;
        size = 0;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void push(long valueToAdd) {
        Link newLink = new Link(valueToAdd);
        if (isEmpty()) {
            first = newLink;
        } else {
            newLink.next = first;
            first = newLink;
        }
        size++;
    }

    public void pop() {
        if (getSize() == 0) {
            throw new IllegalArgumentException("Stack is empty.");
        } else {
            first = first.next;
        }
        size--;
    }

    public void peek() {
        if (getSize() == 0) {
            throw new IllegalArgumentException("Stack is empty.");
        }
        System.out.print("Top of the stack: ");
        Link current = first;
        current.displayLink();
        System.out.println("");
    }

    public int getSize() {
        return size;
    }

    public void displayList() {
        System.out.print("Stack (Front to back): ");
        Link current = first;
        while (current != null) {
            current.displayLink();
            current = current.next;
        }
        System.out.println("");
    }
}
