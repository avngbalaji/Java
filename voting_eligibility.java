import java.util.Scanner;

class voting_eligibility
{
    public static void main(String[] args)
    {
        int age;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter your age: ");
        age=s.nextInt();

        if(age>=18)
            System.out.println("You are eligible for vote..");
    }
}