/** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *  File name     :  StackApp.java
 *  Purpose       :  Created a test file for stack class.
 *  Author        :  Nicolas Raymundo
 *  Date          :  10-17-2018
 *  Description   :  Called methods on stack class to test whether or not they work.
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */

 class StackApp {
    public static void main(String[] args) {
        Stack theList = new Stack();

        theList.push(11);   // 11
        theList.push(33);   // 33, 11
        theList.push(55);   // 55, 33, 11
        theList.push(99);   // 99, 55, 33, 11

        theList.displayList();  // Print: 99 55 33 11

        theList.peek(); // Print: "Top of the stack: 99"

        theList.pop();  // 55, 33, 11
        theList.pop();  // 33, 11
        theList.pop();  // 11
        theList.pop();  // Empty list
        // theList.pop();   // IllegalArgumentException: Stack is empty

        // theList.peek(); // IllegalArgumentException: Stack is empty

        theList.push(2);   // 2
        theList.push(21);   // 21, 2
        theList.push(89);   // 89, 21, 2
        theList.push(17);   // 17, 89, 21, 2

        theList.displayList();  // Print: 17 89 21 2

        theList.peek(); // Print: "Top of the stack: 17"

        theList.pop();  // 89, 21, 2

        theList.displayList();  // Print: 89 21 2

        theList.peek(); // Print: "Top of the stack: 89"

        theList.push(902); // 902, 89, 21, 2

        theList.displayList();  // Print: 902 89 21 2

        theList.peek(); // Print: "Top of the stack: 902"
    }
}
