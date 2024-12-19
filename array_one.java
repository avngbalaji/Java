import java.util.Scanner;

public class array_one
{
    public static void main(String[] args)
    {
        //normal variable : why we need array
        int var = 1;
        System.out.println("var : "+var);
        var = 2;
        System.out.println("var : "+var);

        int[] a = {10, 20, 30, 40, 50};
        // accessing elements in array
        System.out.println("a : "+a[0]);
        System.out.println("a : "+a[4]);

        // accessing elements using for loop
        for (int i=0; i<a.length; i++)
            System.out.println("a["+i+"]: "+a[i]);

        // accessing elements using Enhanced for loop
        for (int element : a)
            System.out.println(element);

        int[] b;//array declaration
        b = new int[10];//allocating memory to array
        int[] c = new int[10];//combination of both

        for (int element:b)
            System.out.println(element);// all 0's

        //getting inputs from the user for array c
        Scanner s = new Scanner(System.in);
        for (int i=0; i<c.length; i++)
        {
            System.out.print("Enter number "+(i+1)+": ");
            c[i]=s.nextInt();
        }

        //display the array c
        for (int element:c)
            System.out.println(element);
    }
}
