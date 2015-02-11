/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fileOperations;

import java.io.*;
 
public class CopyFile 
{
    public static void main(String[] args)
    {	
 
    	InputStream inStream = null;
	OutputStream outStream = null;
 
    	try{
 
    	    File afile =new File("Afile.txt");
    	    File bfile =new File("Bfile.txt");
 
    	    inStream = new FileInputStream(afile);
    	    outStream = new FileOutputStream(bfile);
 
    	    byte[] buffer = new byte[1024];
 
    	    int length;
    	    //copy the file content in bytes 
    	    while ((length = inStream.read(buffer)) > 0){
 
    	    	outStream.write(buffer, 0, length);
 
    	    }
 
    	    inStream.close();
    	    outStream.close();
 
    	    System.out.println("File is copied successful!");
 
    	}catch(IOException e){
    		e.printStackTrace();
    	}
    }
    
     public static void CopyFile(File afile, File bfile)
    {	
 
    	InputStream inStream = null;
	OutputStream outStream = null;
 
    	try{
 
    	    inStream = new FileInputStream(afile);
    	    outStream = new FileOutputStream(bfile);
 
    	    byte[] buffer = new byte[1024];
 
    	    int length;
    	    //copy the file content in bytes 
    	    while ((length = inStream.read(buffer)) > 0){
 
    	    	outStream.write(buffer, 0, length);
 
    	    }
 
    	    inStream.close();
    	    outStream.close();
 
    	}catch(IOException e){
    		e.printStackTrace();
    	}
    }
     
}
