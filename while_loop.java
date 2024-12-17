import java.util.Scanner;

class while_loop
{
    public static void main(String[] args)
    {
        System.out.println("while loop");
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the limit: ");
        int n =s.nextInt();
        int i =1;
        while (i<=n)
        {
            System.out.println(i);
            i++;
        }
    }
}
