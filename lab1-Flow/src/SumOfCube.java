
public class SumOfCube {
	public static int sumOfcube(int n)
	{
		int sum=0,d;
		while(n!=0)
		{
			d=n%10;
			n=n/10;
			sum+=d*d*d;
		}
		return sum;
	}
	public static void main(String[] args) {
		int n=123;
		System.out.println(sumOfcube(n));
	}
}
