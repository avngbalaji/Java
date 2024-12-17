import java.util.Scanner;

class do_while_loop
{
    public static void main(String[] args)
    {
        System.out.println("Do while loop:");
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the limit: ");
        int n =s.nextInt();
        int i =1;
        do {
            System.out.println(i);
            i++;
        }while (i<=n);
    }
}
