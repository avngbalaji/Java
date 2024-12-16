import java.util.Scanner;
class sum_avg
{
	public static void main(String args[])
	{
		int sum=0,avg;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter count: ");
		int c = s.nextInt();
		System.out.println("Enter "+c+" numbers: ");
		for(int i=1; i<=c; i++)
		{
			int num=s.nextInt();
			sum+=num;
		}
		avg=sum/c;
		System.out.println("The Sum is "+sum);
		System.out.println("The Average is "+avg);
	}
}