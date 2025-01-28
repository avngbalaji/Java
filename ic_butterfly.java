class ic_butterfly
{
	public static void main(String[] args)
	{
		int n=5;
		
		for(int i=1; i<n; i++)
		{
			int p=1,q=1;
			for(int j=1; j<=i; j++)
			{
				System.out.print(p++ +" ");
			}
			for(int j=i; j<n; j++)
			{
				System.out.print("  ");
			}
			for(int j=i; j<n; j++)
			{
				System.out.print("  ");
			}
			for(int j=1; j<=i; j++)
			{
				System.out.print(q++ +" ");
			}
			System.out.println();
		}
		for(int i=1; i<=n; i++)
		{
			int p=1,q=1;
			for(int j=i; j<=n; j++)
			{
				System.out.print(p++ +" ");
			}
			for(int j=1; j<i; j++)
			{
				System.out.print("  ");
			}
			for(int j=1; j<i; j++)
			{
				System.out.print("  ");
			}
			for(int j=i; j<=n; j++)
			{
				System.out.print(q++ +" ");
			}
			System.out.println();
		}
	}
}