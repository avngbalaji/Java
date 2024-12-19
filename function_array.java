import java.util.Arrays;
import java.util.Scanner;

public class function_array
{
    public static int[] sort_array()
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the limit: ");
        int n = s.nextInt();
        int [] a = new int[n];
        for (int i=0; i<n; i++)
        {
            System.out.print("Enter number "+(i+1)+" : ");
            a[i] = s.nextInt();
        }
        Arrays.sort(a);
        return a;
    }
    public static void main(String[] args)
    {
        int [] arr = sort_array();
        for (int a : arr)
            System.out.println(a);
    }
}
