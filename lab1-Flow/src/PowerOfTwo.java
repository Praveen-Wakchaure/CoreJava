import java.util.Scanner;

public class PowerOfTwo {
	
	static boolean checkNumber(int n)
	{
		int d,flag=0;
		while(n!=1)
		{
			if(n%2!=0)
			{
				flag=1;
				break;
			}
			n=n/2;
		}
		if(flag==0)
			return true;
		else
			return false;
	}
	
	public static void main(String[] args) {
		
		System.out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(checkNumber(n))
			System.out.println("The number is power of 2");
		else
			System.out.println("The number is not power of 2");
		
	}
}