import java.util.Scanner;

class for_loop
{
    public static void main(String[] args)
    {
        System.out.println("For loop");
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the limit: ");
        int n =s.nextInt();
        for (int i=1; i<=n; i++)
        {
            System.out.println(i);
        }
    }
}
