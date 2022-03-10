package Cg.com;

public class ArraySumAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] number= {2, -9, 0, 5, 12, -25, 22, 9, 8, 12};
		int sum=0;
		double avg;
		
		for(int i:number) {
			sum=sum+i;
		}
		
		
		   // calculate the average
		   // convert the average from int to double

		int length=number.length;
		avg=((double)sum/(double)length);
		
		System.out.println("The sum is: "+sum);
		System.out.println("The average is:"+avg);

	}

}
