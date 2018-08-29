import java.util.Scanner;

public class SayHello {
    public static void main (String args[]) {
        System.out.println("Who would you like to say hello to?");
        Scanner myInput = new Scanner( System.in );
        String inputName = myInput.nextLine();
        System.out.println("Hello, " + inputName + "!");
    }
}
