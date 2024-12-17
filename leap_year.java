import java.util.Scanner;

class leap_year
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter Year: ");
		int yr = s.nextInt();
		if(((yr%4==0)&&(yr%100!=0)) || (yr%400==0))
            System.out.println(yr + " is a Leap Year");
		else
            System.out.println(yr + " is not a Leap Year");
	}
}