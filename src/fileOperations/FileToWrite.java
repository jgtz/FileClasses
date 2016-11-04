
package fileOperations;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Creates a file to write data in it. Only one line at a time can be written
 * @author Max Aldana, modified by Jorge G.T. Zanudo 
 *
 */
public class FileToWrite {
	FileWriter fw;
	PrintWriter pw;
	String fName;
	/**
	 * Constructs the file-to-write whose name is stored in the string nameFile. The file is open new.
	 * If the file already exists all its content is erased.
	 * @param String - fileName
	 */
	public FileToWrite(String fileName){
		initialize1(fileName);
	}

	/**
	 * Constructs the file to write whose name is stored in the string fileName.
	 * If b = true, the existing file is open to append data at the end.
	 * If b = false a new file is created.
	 * @param fileName - String Name of the file to be open
	 * @param b boolean Flag that indicates whether the file is going to be open anew,
	 * or an existing file will be opened, in which case it will write at the end
         * of the file.
	 */
	public FileToWrite(String fileName,boolean b){
		if(b)
			initialize1(fileName);
		else
			initialize2(fileName);
	}
    private void initialize1(String name){
        fName = name;
        String newName = name;
        try{
            fw = new FileWriter(newName);
            pw = new PrintWriter(fw);
        }catch(IOException ioe){
            System.out.println("The file wasn't found " + ioe.toString());
        }
    }
    private void initialize2(String name){
        fName = name;
        String newName = name;
        try{
            fw = new FileWriter(newName,true);
            pw = new PrintWriter(fw);
        }catch(IOException ioe){
            System.out.println("The file wasn't found " + ioe.toString());
        }
    }
	/**
	 * Writes an empty line.
	 *
	 */
	public void writeLine(){
		pw.println();
	}
	/**
	 * Writes a new line as a string of characters.
	 * @param s - String Line to be written
	 */
	public void writeLine(String s){
		pw.println(s);
	}
	/**
	 * Writes a line as a string of characters.
	 * Does not go to a new line.
	 * @param s - String Line to be written
	 */
	public void writeString(String s){
		pw.print(s);
	}
	/**
	 * Writes a character. Does not go to a new line.
	 * @param c - character to be written.
	 */
	public void writeChar(char c){
		pw.print(c);
	}
	/**
	 * Closes the file. It is important to close the file before exiting the program.
	 * Otherwise some information won't flush from the buffer to the file.
	 */
	public void close(){
		try{
			pw.close();
			fw.close();
		}catch(IOException e){
			System.out.println("The file could not be closed " + e.toString());
		}
	}
}