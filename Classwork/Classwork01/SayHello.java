/**
 *  File name     :  SayHello.java
 *  Purpose       :  Program to ensure a working environment for the semester.
 *  Author        :  Nicolas Raymundo
 *  Date          :  2018-09-05
 *  Description   :  Program
 *  Notes         :  Uses Scanner class to print hello world with user-given name.
 *  Warnings      :  None
 *  Exceptions    :  None
 */

import java.util.Scanner;

public class SayHello {
    public static void main (String args[]) {
        System.out.println("Who would you like to say hello to?");
        Scanner myInput = new Scanner( System.in );
        String inputName = myInput.nextLine();
        System.out.println("Hello, " + inputName + "!");
    }
}
