/*

1
3  2
6  5  4
10 9  8  7
15 14 13 12 11
21 20 19 18 17 16
28 27 26 25 24 23 22
*/

class floyd_right_triangle_starting_right
{
	public static void main(String[] args)
	{
		int n=7;
		int num=1;
		for(int i=1; i<=n; i++)
		{
			int startNum = num+i-1;
			for(int j=1; j<=i; j++)
			{
				System.out.print(startNum +"  ");
				startNum--;
			}
			num+=i;
			System.out.println();
		}
	}
}