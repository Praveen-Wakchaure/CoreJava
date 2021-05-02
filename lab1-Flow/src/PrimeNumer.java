import java.util.Scanner;

public class PrimeNumer {
	
	static boolean isPrime(int i)
	{
		for(int j=2;j<=i/2;j++)
		{
			if(i%j==0)
				return true;
				break;
		}
		return false;
	}
	
	public static void main(String[] args) {
		System.out.println("Enter a digit");
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=2;i<=n;i++)
		{
			if(isPrime(i));
			else
				System.out.println(i);
		}
	}
}
