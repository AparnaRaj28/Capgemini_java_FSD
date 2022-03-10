package cg.com;

public class FinalStatic {
	  final static int DAYS_IN_WEEK;
	  static
	  {
	    DAYS_IN_WEEK = 7;
	  }
	 

	public static void main(String[] args) {
		FinalStatic f=new FinalStatic();
		System.out.println(f.DAYS_IN_WEEK);

	}

}
