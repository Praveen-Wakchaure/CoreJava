import java.util.Scanner;

public class IncreasingNumber {
	
	static boolean checkNumber(int n)
	{
		int d,flag=0;
		while(n!=0)
		{
			d=n%10;
			n=n/10;
			if(n%10>d)
			{
				flag=1;
				break;
			}
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
			System.out.println("Increasing Number");
		else
			System.out.println("Not an Increasing number");
		
	}

}