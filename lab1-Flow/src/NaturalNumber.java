import java.util.Scanner;

public class NaturalNumber {
	
	static int calculateSum(int n)
	{
		int int_sum=0;
		if(n>0)
		{	
			for(int i=3;i<=n;i++)
			{
				if(i%3==0 || i%5==0)
					int_sum+=i;
			}
		}
		return int_sum;
	}
	
	public static void main(String[] args) {
		
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(calculateSum(n));
	}
}
