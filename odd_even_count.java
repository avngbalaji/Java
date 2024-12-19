import java.util.Scanner;

public class odd_even_count
{
    public static void main(String[] args)
    {
        int o=0,e=0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the limit: ");
        int n=s.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter "+n+" numbers: ");
        for (int i=0; i<arr.length; i++)
        {
            arr[i]=s.nextInt();
        }
        for (int element: arr)
        {
            if(element%2==0)
                e++;
            else
                o++;
        }
        System.out.println("Odd Numbers: "+o);
        System.out.println("Even Numbers: "+e);
    }
}
