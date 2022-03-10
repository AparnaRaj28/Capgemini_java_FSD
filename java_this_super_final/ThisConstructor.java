package cg.com;

public class ThisConstructor {
	int val1,val2;
	ThisConstructor()
	{
		this(10,20);
	}
	
	ThisConstructor(int val1,int val2)
	{
		this.val1=val1;
		this.val2=val2;
	
	}
	
	public static void main(String[] args) {
		ThisConstructor obj= new ThisConstructor();
 
	}

}
