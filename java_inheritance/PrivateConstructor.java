package cg.com.day5;
class Student {
    //private constructor of the class
    private Student()
    {                               

    }
    public void show()
    {
     System.out.println("Hello xyz.com");
    }

 }
public class PrivateConstructor {

	public static void main(String[] args)
	{
        //compile time error in creating Student class object
        //because of private constructor.
        Student obj = new Student();//error

	}

}
