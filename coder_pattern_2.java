import java.lang.*;

class coder_pattern_2
{
	public static void main(String[] args)
	{
		String s = "CODER";
		int n = s.length();
		
		for(int i=1; i<=n; i++)
		{
			for(int j=1, p=0; j<=i; j++, p++)
			{
				System.out.print(s.charAt(p)+" ");
			}
			System.out.println();
		}
	}
}