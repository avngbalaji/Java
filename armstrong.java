import java.util.Scanner;

public class armstrong
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = s.nextInt();

        int num = n;
        int ans=0,rem;
        while(n!=0)
        {
            rem=n%10;
            ans=ans+(rem*rem*rem);
            n=n/10;
        }
        if(num==ans)
            System.out.println("Armstrong Number");
        else
            System.out.println("Not an Armstrong Number");
    }
}
