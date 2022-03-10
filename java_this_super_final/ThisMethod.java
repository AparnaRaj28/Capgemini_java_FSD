package cg.com;

public class ThisMethod {
	int val1,val2;
	//constructor
	ThisMethod()
	{
		val1=20;
	    val2=10;
	}
	
	void print(ThisMethod t) {
		System.out.println("val1="+t.val1);
		System.out.println("val2"+t.val2);
	}
	

//	void print() {
//		System.out.println(val1);
//		System.out.println(val2);
//	}
   
	 void get()
	 {
		 //print(this);
		 print(this);
	 }
	 
	public static void main(String[] args) {
		ThisMethod obj=new ThisMethod();
		//obj.print();
		obj.get();

	}

}
