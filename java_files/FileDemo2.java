package cg.com.day6;
import java.io.File;
public class FileDemo2 
{

	public static void main(String[] args) 
	{
	    // creates a file object
	    File file = new File("C:\\Users\\AKHIL\\Desktop\\CAPG\\file.txt");

	 // deletes the file
	    boolean value = file.delete();
	    if(value)
	    {
	      System.out.println("The File is deleted.");//because the file is not created
	    }
	    else
	    {
	      System.out.println("The File is not deleted.");
	    }



	}

}
