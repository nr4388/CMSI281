public class Tower {

   IntStack towerOne;
   IntStack towerTwo;
   IntStack towerThree;

   Tower() {
      towerOne = new IntStack();         // constructor
      towerTwo = new IntStack();
      towerThree = new IntStack();
   }

public void solve() {
    towerOne.push(4);
     towerOne.push(3);
      towerOne.push(2);
      towerOne.push(1);

      towerTwo.push(1);
      towerOne.pop();

      towerThree.push(2);
      towerOne.pop();

      towerThree.push(1);
      towerTwo.pop();

      towerTwo.push(3);
      towerOne.pop();

      towerOne.push(1);
      towerThree.pop();

      towerTwo.push(2);
      towerThree.pop();

      towerTwo.push(1);
      towerOne.pop();

      towerThree.push(4);
      towerOne.pop();

      towerThree.push(1);
      towerTwo.pop();

      towerOne.push(2);
      towerTwo.pop();

      towerOne.push(1);
      towerThree.pop();

      towerThree.push(3);
      towerTwo.pop();

      towerTwo.push(1);
      towerOne.pop();

      towerThree.push(2);
      towerOne.pop();

      towerThree.push(1);
      towerTwo.pop();

      System.out.println("Top of 3: " + towerThree.peek());
      towerThree.pop();
      System.out.println("Top of 3 now: " + towerThree.peek());
      towerThree.pop();
      System.out.println("Top of 3 now: " + towerThree.peek());
      towerThree.pop();
      System.out.println("Top of 3 now: " + towerThree.peek());
   }

   public static void main( String[] args ) {
      Tower testStack = new Tower();
      testStack.solve();
   }

}
