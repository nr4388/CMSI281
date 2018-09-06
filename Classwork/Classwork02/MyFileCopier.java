/**
 *  File name     :  MyFileCopier.java
 *  Purpose       :  Program to gain experience with packages and classes as part of a program's functionality.
 *  Author        :  Nicolas Raymundo
 *  Date          :  2018-09-06
 *  Notes         :  Uses java.io library to take a user's file and duplicate it.
 */

import java.util.Scanner;
import copiersupport.SourceFile;
import copiersupport.TargetFile;

public class MyFileCopier {
    public static void main(String args[]) {
        System.out.println("What file would you like to copy?");
        Scanner fileName = new Scanner( System.in );
        String inputName = fileName.nextLine();
        SourceFile sf = new SourceFile(inputName);
        String s = sf.getContents();
        TargetFile tf = new TargetFile(s, inputName + ".copy");
    }

}
