import java.util.Scanner;

public class Difference {
	
	static int calculateDifference(int n)
	{
		int int_sum=0,sumSquare=0,squareSum=0;
		if(n>0)
		{
			for(int i=1;i<=n;i++)
			{
				sumSquare+=i;
				squareSum+=i*i;
			}
			sumSquare*=sumSquare;
			int_sum=squareSum-sumSquare;
		}
		return int_sum;		
	}
	
	public static void main(String[] args) {
		
		System.out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(calculateDifference(n));
	}
}