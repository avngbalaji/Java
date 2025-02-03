class hollow_decreasing_triangle
{
	public static void main(String[] args)
	{
		int n=10;
		
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