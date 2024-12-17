import java.util.Scanner;

public class multiplication_table
{
    public static void main(String[] args)
    {
        System.out.println("Multiplication Table");
        Scanner s = new Scanner(System.in);
        System.out.println("Enter while table to print : ");
        int t = s.nextInt();
        System.out.println("Enter limit : ");
        int n = s.nextInt();
        for(int i=1; i<=n; i++)
            System.out.println(t+" x "+i+" = "+(t*i));
    }
}
