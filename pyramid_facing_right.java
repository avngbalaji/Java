/*

*
	*
*     	*
	*    	*
*	  	*    	*
	*     	*
*	  	*
	*
*

-------------------------------
*/
/*
class pyramid_facing_right
{
	public static void main(String[] args)
	{
		int n=5;
		
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=i; j++)
			{
				if((i+j)%2==0){
					System.out.print("* ");
				}
				else{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		for(int i=n-1; i>=1; i--)
		{
			for(int j=1; j<=i; j++)
			{
				if((i+j)%2==0){
					System.out.print("* ");
				}
				else{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
*/

class pyramid_facing_right
{
	public static void main(String[] args)
	{
		int n=5;
		
		for(int i=1; i<n; i++)
		{
			for(int j=1; j<=i; j++)
			{
				if((i+j)%2==0)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		for(int i=1; i<=n; i++)
		{
			for(int j=i; j<=n; j++)
			{
				if((i+j)%2==0)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
}