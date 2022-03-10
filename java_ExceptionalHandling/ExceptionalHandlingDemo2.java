package cg.com.day5;

public class ExceptionalHandlingDemo2 {

	public static void main(String[] args) {
		try
		{
			int a[]=new int[5];
			a[5]=4/0;
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e.getMessage());
		}

	}

}
