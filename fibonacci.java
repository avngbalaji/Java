import java.util.Scanner;
class fibonacci
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n=s.nextInt();
		int a=-1,b=1,c;
		for(int i=1; i<=n; i++)
		{
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}
	}
}