class dr_left_triangle_inverse
{
	public static void main(String[] args)
	{
		int n=5;
		
		for(int i=1, p=5; i<=n; i++, p--)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print("  ");
			}
			for(int j=i; j<=n; j++)
			{
				System.out.print(p+" ");
			}
			System.out.println();
		}
	}
}