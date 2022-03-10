package cg.com;

public class ThisReturn {
     
	 int x,y;
	 ThisReturn()
	 {
		 x=10;
		 y=20;
	 }
	 ThisReturn get()
	 {
		 return this;
	 }
	 
	 void display()
	 {
		 System.out.println("val x="+x);
		 System.out.println("val y="+y);
	 }
	public static void main(String[] args) {
		ThisReturn obj=new ThisReturn();
		obj.get().display();
      
	}

}
