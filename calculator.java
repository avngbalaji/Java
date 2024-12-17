import java.util.Scanner;

class calculator
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int a,b,c,choice;
        System.out.println("Simple Calculator:-");
        System.out.println("1.Addition");
        System.out.println("2.Subtraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");
        System.out.println("5.Modulus");
        System.out.print("Enter your choice: ");
        choice=s.nextInt();
        System.out.println("Enter 2 numbers:");
        a=s.nextInt();b=s.nextInt();
        switch (choice)
        {
            case 1:
                c=a+b;
                System.out.println("Result :"+c);
                break;
            case 2:
                c=a-b;
                System.out.println("Result :"+c);
                break;
            case 3:
                c=a*b;
                System.out.println("Result :"+c);
                break;
            case 4:
                c=a/b;
                System.out.println("Result :"+c);
                break;
            case 5:
                c=a%b;
                System.out.println("Result :"+c);
                break;
            default:
                System.out.println("Invalid choice!");

        }
    }
}