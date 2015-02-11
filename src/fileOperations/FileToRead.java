
package fileOperations;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 * Reads a file to extract data from it.
 * @author Max Aldana, modified by Jorge G.T. Zanudo 
 *
 */

public class FileToRead {

    FileReader fr;
    Scanner sr;
    String fName;
    public FileToRead(String fileName){
        initialize(fileName);
    }

    private void initialize(String name){
        fName = name;
        String newName = name;
        try{
            fr = new FileReader(newName);
            sr = new Scanner(fr);
        }catch(IOException ioe){
            String message = "the file **" + newName
                    + "** wasn't found. Introduce the correct name file.";
            newName = JOptionPane.showInputDialog(message);
            initialize(newName);
        }
    }
    public String nextLine(){
        String s = sr.nextLine();
        return s;
    }
    public int nextInt(){
        return sr.nextInt();
    }
    public double nextDouble(){
        return sr.nextDouble();
    }
    public boolean hasNext(){
        return sr.hasNext();
    }
    public boolean hasNextInt(){
        return sr.hasNextInt();
    }
    public boolean hasNextDouble(){
        return sr.hasNextDouble();
    }
    public String getName(){
        return fName;
    }
    public void close(){
        try{
            fr.close();
            sr.close();
        }catch(IOException ioe){}
    }
}