/**
 *  File name     :  TargetFile.java
 *  Purpose       :  Takes string from MyFileCopier and writes contents to a new file.
 *  Author        :  Nicolas Raymundo
 *  Date          :  2018-09-06
 *  Notes         :  Uses FileWriter and BufferedWriter classes to take the string and copy it to a new file.
 */

package copiersupport;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TargetFile {

    public TargetFile(String fileContents, String newFile) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(newFile));
            writer.write(fileContents);
        } catch (IOException ioe) {
        }
    }
}
