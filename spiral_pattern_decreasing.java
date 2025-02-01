import java.util.Scanner;

class spiral_pattern_decreasing
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = s.nextInt();
		System.out.println();
		
		int k=n;
		for(int i=1,m=n; i<n; i++,m--)
		{
			for(int j=1,p=n; j<i; j++,p--)
			{
				System.out.print(p+" ");
			}
			for(int j=i; j<n; j++)
			{
				System.out.print(k+" ");
			}
			for(int j=i; j<n; j++)
			{
				System.out.print(k+" ");
			}
			for(int j=1,q=m; j<=i; j++,q++)
			{
				System.out.print(q+" ");
			}
			System.out.println();
			k-=1;
		}
		for(int i=1,m=n,ii=i; i<=n; i++,m--,ii++)
		{
			for(int j=i,p=n; j<n; j++,p--)
			{
				System.out.print(p+" ");
			}
			for(int j=1; j<i; j++)
			{
				System.out.print(ii+" ");
			}
			for(int j=1; j<i; j++)
			{
				System.out.print(ii+" ");
			}
			for(int j=i,a=ii; j<=n; j++)
			{
				System.out.print(a++ +" ");
			}
			System.out.println();
		}
	}
}