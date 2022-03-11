//returns a list of files from a folder
package cg.com.day6;
import java.io.File;
public class FileDemo3 {

	public static void main(String[] args) {
		// creates a file object
	    File file = new File("C:\\Users\\AKHIL\\Desktop\\CAPG\\java files");

	    // returns an array of all files
	    String[] fileList = file.list();
	    for(String str : fileList) 
	    {
	        System.out.println(str);
	    }


	}

}
