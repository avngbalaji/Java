import java.util.Scanner;

public class decimal_binary
{
    public static void dec2bin(int n)//12
    {
        int[] binaryNum = new int[1000];
        int i=0;
        while (n>0)
        {
            binaryNum[i] = n%2;
            n=n/2;
            i++;
        }
        for (int j=i-1; j>=0; j--)
            System.out.print(binaryNum[j]);
    }
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the Decimal No : ");
        int n = s.nextInt();
        System.out.println("Decimal No : "+n);
        System.out.print("Binary No : ");
        dec2bin(n);
    }
}
