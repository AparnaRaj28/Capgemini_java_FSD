package Cg.com;

public class StringReplace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="C++Programming";
		
		//"C++" is replaced with "java"
		System.out.println(s.replace("C++","java"));
		
	    // all occurences of "aa" is replaced with "zz"
	    System.out.println("aa bb aa zz".replace("aa", "zz")); // zz bb zz zz

	    // substring not in the string
	    System.out.println("Java".replace("C++", "C")); // Java


	}

}
