/** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *  File name     :  SimonGame.java
 *  Purpose       :  Utilized a linkedlist class to make a form of the Simon game.
 *  Author        :  Nicolas Raymundo, Talia Bahar, Maya Pegler
 *  Date          :  11-05-2018
 *  Description   :  Added methods and a constructor to be able to play the game from console.
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */

import java.util.*;

public class SimonGame {

   StringLinkedList simonList;
   String[] simonArray = {"R", "G", "B", "Y"};
   int level = 1;
   Boolean comparison = true;

   SimonGame() {
      simonList = new StringLinkedList();
   }

   public void clearList() {
       simonList.clearLinkedList();
       simonList.size = 0;
   }

   public String getNewColor() {
       Random ran = new Random();
       int index = ran.nextInt(simonArray.length);
       return simonArray[index];
   }

   public void addToList() {
       simonList.prepend(getNewColor());
   }

   public void playRound() {
       addToList();
       System.out.println("Level: " + level);
       delayPrint(800, false);
       System.out.println("Pay close attention to the order in which the colors are printed.");

       delayPrint(1000, false);

       showNodeValue();

       delayPrint(500, false);

       System.out.println("Enter the letters in the order in which they appeared.");
       Scanner userGuesses = new Scanner( System.in );
       String guessesString = userGuesses.nextLine().toUpperCase().replaceAll("\\s+","");

       if (compare(guessesString)) {
           delayPrint(300, false);
           System.out.println("\nCorrect!");
           delayPrint(800, true);
       } else {
           delayPrint(300, false);
           System.out.println("\nSorry, you'll get it next time! Would you like to play again?");
           System.out.println("Enter YES to play again or any other key to end the game.");
           Scanner playAgain = new Scanner( System.in );
           String playAgainString = userGuesses.nextLine().toUpperCase().replaceAll("\\s+","");
           if (playAgainString.equals("YES")) {
               delayPrint(500, true);
               level = 1;
               clearList();
               playRound();
           }
           delayPrint(500, true);
       }

       if (compare(guessesString)) {
           level++;
           playRound();
       }
   }

   public void delayPrint(int delay, boolean clearConsole) {
       try {
           Thread.sleep(delay);
       }
       catch (InterruptedException ex) {
       }
       if (clearConsole) {
           System.out.print("\033[H\033[2J");
       }
   }

   public String listToString() {
       String listString = "";
       for (int i = 0; i < simonList.getSize(); i++) {
           listString += getNodeValue(i);
       }
       return listString;
   }

   public boolean compare(String guess) {
       comparison = true;
       if (!(guess.equals(listToString()))) {
           comparison = false;
       }
       return comparison;
   }

   public String getNodeValue(int index) {
       return simonList.getIteratorAt(index).getCurrentInt();
   }

   public void showNodeValue() {
       String displayList = "";
       String deleteLine = "";
       for (int i = 0; i < simonList.getSize(); i++) {
           if (i == 0) {
               displayList += simonList.getIteratorAt(i).getCurrentInt();
           } else {
               displayList += (" " + simonList.getIteratorAt(i).getCurrentInt());
           }
       }
       for (int index = 0; index < displayList.length(); index++) {
           System.out.print(displayList.charAt(index));
           try {
               Thread.sleep(500);
           }
           catch (InterruptedException ex) {

           }
       }
       for (int length = 0; length < displayList.length(); length++) {
           deleteLine += "\b";
       }
       for (int length = 0; length < displayList.length(); length++) {
           deleteLine += " ";
       }
       System.out.print(deleteLine);
       System.out.print("\n");
   }

   public static void main( String[] args ) {
       SimonGame mainList = new SimonGame();
       mainList.playRound();
   }

}
