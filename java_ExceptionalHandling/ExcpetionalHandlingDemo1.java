package cg.com.day5;

public class ExcpetionalHandlingDemo1 
{

	public static void main(String[] args) 
	{
		try
		{
			int num=5/0;
			System.out.println("Rest of the try code block");//this stmt will not get executed
		}
		catch(ArithmeticException e)
		{
			System.out.println("ArithmeticException => " + e.getMessage());
		}

	}

}
