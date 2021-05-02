
import java.security.DomainCombiner;
import java.util.Scanner;

public class FibonaciSeries {
	
	static int fibonaciIterative(int n)
	{
		int first = 1,second = 1;
		int nth = 0;
		if(n==1||n==2)
			return 1;
		else {
			for(int i=2;i<n;i++)
			{
				nth = first+second;
				first=second;
				second=nth;
			}
			return nth;
		}
	}
	
	static int fibonaciRecursive(int n)
	{
		if(n==1||n==2)
			return 1;
		else
			return fibonaciRecursive(n-1)+fibonaciRecursive(n-2);
	}
	public static void main(String[] args) {
		
		System.out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
		
		System.out.println("Nth Value OF Fibonaci Series Using Iteration is"+fibonaciIterative(n));
		System.out.println("Nth Value OF Fibonaci Series Using Recursion is"+fibonaciRecursive(n));
	}
	
}