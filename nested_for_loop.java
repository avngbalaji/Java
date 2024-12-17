public class nested_for_loop
{
    public static void main(String[] args)
    {
        System.out.println("Nested for loop");
        for(int i=1; i<=5; i++)
        {
            for(int j=1;j<=i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
