/**
 *  File name     :  MyFileCopier.java
 *  Purpose       :
 *  Author        :  Nicolas Raymundo
 *  Date          :  2018-09-05
 *  Description   :  Program
 *  Notes         :
 *  Warnings      :  None
 *  Exceptions    :  None
 */

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
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
