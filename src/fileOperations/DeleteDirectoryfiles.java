/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fileOperations;
import java.io.File;
/**
 *
 * @author Oudeis
 */
public class DeleteDirectoryfiles {

     static public void main(File path) {
    if( path.exists() ) {
      File[] files = path.listFiles();
      for(int i=0; i<files.length; i++) {
           files[i].delete();
      }
    }
  }
    static public void Deldir(File path) {
    if( path.exists() ) {
      File[] files = path.listFiles();
      for(int i=0; i<files.length; i++) {
           files[i].delete();
      }
    }
  } 

}
