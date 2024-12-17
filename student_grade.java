import java.util.Scanner;

class student_grade
{
    public static void main(String[] args)
    {
        System.out.println("Student Grade Calculator");
        /*
        * Marks  -   Grade
        * 90 -  100  A
        * 80 -  89   B
        * 70 -  79   C
        * below 70   D
        * */
        System.out.print("Enter your Mark: ");
        Scanner s = new Scanner(System.in);
        int m = s.nextInt();

        if(m>=90 && m<=100)
            System.out.println("Grade A");
        else if(m>=80 && m<=89)
            System.out.println("Grade B");
        else if(m>=70 && m<=79)
            System.out.println("Grade C");
        else
            System.out.println("Grade D");
    }
}