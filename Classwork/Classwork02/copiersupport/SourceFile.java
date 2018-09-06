/**
 *  File name     :  SourceFile.java
 *  Purpose       :  Takes file from MyFileCopier and reads contents.
 *  Author        :  Nicolas Raymundo
 *  Date          :  2018-09-06
 *  Notes         :  Uses FileReader and BufferedReader classes to take a user's file and read it.
 */

package copiersupport;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class SourceFile {
    private String newFile;

    public SourceFile(String fileName) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
            newFile = bufferedReader.readLine();
        } catch (IOException ioe){
        }
    }

    public String getContents() {
        return newFile;
    }

}
