import java.util.Scanner;

public class armstrong_all
{
    public static void main(String[] args)
    {
        int num,ans,rem,n;
        for(int i=100; i<=999; i++)
        {
            num=i;
            n=i;
            ans=0;
            while(n!=0)
            {
                rem=n%10;
                ans=ans+(rem*rem*rem);
                n=n/10;
            }
            if(num==ans)
                System.out.println(ans+" is Armstrong Number");
        }
    }
}
