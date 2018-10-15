class StackApp {
    public static void main(String[] args) {
        Stack theList = new Stack();

        theList.push(11);
        theList.push(33);
        theList.push(55);
        theList.push(99);

        theList.pop();
        theList.pop();
        theList.pop();
        theList.pop();

        theList.push(99);
        theList.push(55);
        theList.push(33);
        theList.push(11);

        theList.pop();

        theList.push(1000);

        theList.displayList();
    }
}
