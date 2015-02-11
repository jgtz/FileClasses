/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fileOperations;

/**
 *
 * @author JGTZ
 */
import java.io.File;

public class DeleteFile{
    
  static public void deletefile(String file){
  File f1 = new File(file);
  boolean success = f1.delete();
    if (!success){
        System.out.println("Deletion of file "+file+" failed.");
    }
  
  }
  
}
