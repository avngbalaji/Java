import java.util.Scanner;

class concession
{
    public static void main(String[] args)
    {
        /*
        Nested if Statement
        A company insures its driver in the following cases:
        a. If the driver is married.
        b. If the driver is unmarried, male & above 30 years of age.
        c. If the driver is unmarried, female & above 25 years of age.
        */

        Scanner s = new Scanner(System.in);
        System.out.print("Enter your Marital Status (M/U): ");
        char marital = s.next().charAt(0);

        if(marital=='M' || marital=='m')
            System.out.println("You are eligible");
        else if(marital=='U' || marital=='u')
        {
            char gender;
            int age;
            System.out.print("Enter your Gender (M/F): ");
            gender = s.next().charAt(0);
            System.out.print("Enter your age: ");
            age = s.nextInt();
            if((gender=='M' || gender=='m') && (age>30))
                System.out.println("You are eligible");
            else if((gender=='F' || gender=='f') && (age>25))
                System.out.println("You are eligible");
            else
                System.out.println("You are not eligible");
        }
        else
            System.out.println("Invalid Input");
    }
}