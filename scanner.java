import java.util.Scanner;

class scanner
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter two Numbers: ");
        a=s.nextInt();
        b=s.nextInt();
        c=(a*a)+(b*b)+(2*a*b);
        System.out.println("Result :"+c);
    }
}