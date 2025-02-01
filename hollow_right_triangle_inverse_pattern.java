import java.lang.*;

class hollow_right_triangle_inverse_pattern
{
	public static void main(String[] args)
	{
		int n=7;
		
		for(int i=1; i<=n; i++)
		{
			for(int j=i; j<=n; j++)
			{
				if(i==1 || j==n || j==i)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
}