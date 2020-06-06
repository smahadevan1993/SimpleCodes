// a simple code with 2 pointer concept to get the sorted list of numbers , when a mix of positive and negative sorted list is given .

package Challenge.Code.Code.Coding;
import java.util.*;

public class PointersTest01 {
	
	public static void calculate(Integer arr[])
	{
		int startflag=0;
		int endflag=arr.length-1;
		Integer p[]=new Integer[5];
		int lcounter=arr.length-1;
		int i=0;
		
		while(startflag<=endflag)
		{
			int startsq=arr[startflag]*arr[startflag];
			int endsq=arr[endflag]*arr[endflag];
			
			if(startsq<endsq)
			{
				p[lcounter--]=endsq;
				endflag--;
			}
			else
			{
				p[lcounter--]=startsq;
				startflag++;
			}
			
		}
		
		System.out.println("The array result is ");
		for(i=0;i<5;i++)
		{
			System.out.println(p[i]);
		}
		
		
	}
	
	public static void main(String args[])
	{
		
		int i=0;
		Integer arr[]=new Integer[5]; // -1,-2,0,1,2
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter the array ");
		for(i=0;i<arr.length;i++)
		{
			arr[i]=scan.nextInt();
		}
		
		PointersTest01.calculate(arr);
		
		
		
	}

}
