package Cg.com;
import java.util.Arrays;
public class ArrayConcat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[]= {1,2,3};
		int arr2[]= {4,5,6};
		
		int len1=arr1.length;
		int len2=arr2.length;
		
		int result[]=new int[len1+len2];
		
		System.arraycopy(arr1,0, result,0, len1);
		System.arraycopy(arr2,0, result,len1, len2);
		
		 System.out.println(Arrays.toString(result));


	}

}
