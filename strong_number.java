import java.util.Scanner;

public class strong_number
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = s.nextInt();
        int temp=num;
        int rem,f;
        int result=0;
        while (num!=0)
        {
            rem=num%10;
            f=1;
            for(int i=1; i<=rem; i++)
            {
                f=f*i;
            }
            result+=f;
            num/=10;
        }
        if(result==temp)
            System.out.println(temp+" is a Strong number");
        else
            System.out.println(temp+" is not a Strong number");
    }
}
