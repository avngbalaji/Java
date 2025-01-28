class irby2
{
	public static void main(String[] args)
	{
		int n=5;
		
		for(int i=1,p=1; i<=n; i++,p+=2)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print(p+" ");
			}
			System.out.println();
		}
	}
}