import java.lang.*;

class ir_right_triangle_inverse
{
	public static void main(String[] args)
	{
		int n=5;
		
		for(int i=1,p=1; i<=n; i++,p++)
		{
			for(int j=i; j<=n; j++)
			{
				System.out.print(p+" ");
			}
			System.out.println();
		}
	}
}