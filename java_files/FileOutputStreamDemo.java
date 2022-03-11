package cg.com.day6;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class FileOutputStreamDemo {

	public static void main(String[] args) 
	{
		String txt="Line of text inside the file";
		try
		{
			OutputStream out=new FileOutputStream("C:\\Users\\AKHIL\\Desktop\\CAPG\\java files\\newfile.txt");
            // Converts the string into bytes
            byte[] dataBytes = txt.getBytes();
            
            //writing data to the output stream
            out.write(dataBytes);
            System.out.println("Data is written to the file.");
            
            //closing the output stream
            out.close();
		}
		catch(Exception e)
		{
			e.getStackTrace();
		}

	}

}
