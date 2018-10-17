/** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *  File name     :  JosephusTester.java
 *  Purpose       :  Tester file for Josephus file.
 *  Author        :  Nicolas Raymundo
 *  Date          :  10-17-2018
 *  Description   :  Calling elimination method to test whether the method properly does the Josephus Problem.
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */

public class JosephusTester {
    public static void main( String[] args ) {
        Josephus myList = new Josephus();

        /** ------------------------------------------------------------
         My Josephus method works like this:
         Given a circle up to 4, eliminating every 2 and starting at 1:
         1 2 3 4
         1 0 3 4
         1 0 3 0
         1 0 0 0
         Eliminated in order: 2 4 3.
         Survivor is 1.
        ------------------------------------------------------------- */

        System.out.println(myList.elimination(9, 4) + "\n");            // 4 8 3 9 6 5 7 2   Survivor: 1

        System.out.println(myList.elimination(4, 2) + "\n");            // 2 4 3 Survivor: 1

        System.out.println(myList.elimination(9, 7) + "\n");            // 7 5 4 6 9 3 8 1 Survivor: 2

        System.out.println(myList.elimination(15, 3) + "\n");            // 3 6 9 12 15 4 8 13 2 10 1 11 7 14 Survivor: 5

        System.out.println(myList.elimination(24, 9) + "\n");            // 9 18 3 13 23 10 21 8 22 12 2 17 11 5 1 24 4 7 16 14 15 6 19 Survivor: 20
    }
}
