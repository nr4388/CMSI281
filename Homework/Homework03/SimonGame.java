import java.util.*;

public class SimonGame {

   StringLinkedList simonList;
   String[] simonArray = {"R", "G", "B", "Y"};
   int level = 1;
   Boolean comparison = true;

   SimonGame() {
      simonList = new StringLinkedList();
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
       System.out.println("Watch the order...");
       for (int i = 0; i < simonList.getSize(); i++) {
           System.out.println(showNodeValue(i));
       }

       try {
           Thread.sleep(1000);
       }
       catch (InterruptedException ex) {
       }

       System.out.print("\033[H\033[2J");

       System.out.println("Enter the letters in the order in which they appeared.");
       Scanner myInput = new Scanner( System.in );
       String inputName = myInput.nextLine().toUpperCase();

       if (compare(inputName)) {
           System.out.println("Correct.");
       } else {
           System.out.println("Loser. You're trash lmao.");
       }

       try {
           Thread.sleep(800);
       }
       catch (InterruptedException ex) {
       }

       System.out.print("\033[H\033[2J");

       if (compare(inputName)) {
           level++;
           playRound();
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
       if (!(guess.equals(listToString()))) {
           comparison = false;
       }
       return comparison;
   }

   public String getNodeValue(int index) {
       return simonList.getIteratorAt(index).getCurrentInt();
   }

   public String showNodeValue(int index) {
       try {
           Thread.sleep(500);
       }
       catch (InterruptedException ex) {

       }
       return simonList.getIteratorAt(index).getCurrentInt();
   }

   public static void main( String[] args ) {
       SimonGame mainList = new SimonGame();
       // mainList.addToList();
       mainList.playRound();
       // if (mainList.comparison) {
       //     mainList.level++;
       //     mainList.playRound();
       // } else {
       //     System.out.println("Loser");
       // }
   }

}
