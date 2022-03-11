package cg.com.day6;
import java.io.FileInputStream;
public class FileInputStreamDemo2
{

	public static void main(String[] args) 
	{
		try
		{
			FileInputStream in=new FileInputStream("C:\\Users\\AKHIL\\Desktop\\CAPG\\java files\\number.txt");
			System.out.println("Data in the file:");
			
			//Reading first byte
			int i=in.read();
			
			while(i!=-1)
			{
				System.out.println((char)i);
				
				//reading next byte
				i=in.read();
			}
			in.close();
		}
		catch(Exception e)
		{
			e.getStackTrace();
		}
		
	}

}
