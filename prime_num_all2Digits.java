public class prime_num_all2Digits
{
    public static void main(String [] args)
    {
        int num,count;
        for(int n=1; n<=100; n++)
        {
            num =n;
            count=0;
            for(int i=1; i<=num; i++)
                if (num%i==0)
                    count++;
            if(count==2)
                System.out.println(num+" is prime number");
        }
    }
}
