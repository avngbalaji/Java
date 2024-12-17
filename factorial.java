import java.util.Scanner;
class factorial
{
	public static void main(String args[])
	{
		int num;
		int result=1;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a number: ");
		num = s.nextInt();
		
		for(int i=1;i<=num;i++)
		{
			result=result*i;
		}
		
		System.out.println("Factorial of "+num+" is "+result);
	}
}