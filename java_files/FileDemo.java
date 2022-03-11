package cg.com.day6;
//importing file class
import java.io.File;
public class FileDemo
{

	public static void main(String[] args)
	{
		File f=new File("C:\\Users\\AKHIL\\Desktop\\CAPG\\newFile.txt");
		try {

		      // trying to create a file based on the object
		      boolean value = f.createNewFile();
		      if (value)
		      {
		        System.out.println("The new file is created.");
		      }
		      else 
		      {
		        System.out.println("The file already exists.");
		      }
		    }
		    catch(Exception e) 
		    {
		      e.getStackTrace();  //prints exception if any  
		    }
		  }


}
