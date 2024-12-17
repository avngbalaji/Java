import java.util.Scanner;

public class reverse_number
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = s.nextInt();
        int reverse=0,rem;
        while(num!=0)
        {
            rem=num%10;
            reverse=(reverse*10)+rem;
            num=num/10;
        }
        System.out.println("Reverse : "+reverse);
    }
}
