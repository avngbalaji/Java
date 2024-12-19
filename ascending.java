import java.util.Arrays;
import java.util.Scanner;

public class ascending
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int[] a=new int[]{1,3,2,4,8,6,5,9,7};
        int temp;
        System.out.println("Before Sorting :"+ Arrays.toString(a));

        for (int i=0;i<a.length;i++)
        {
            for (int j=i+1;j<a.length;j++)
            {
                if(a[i]>a[j])
                {
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }

        System.out.println("After Sorting  :"+ Arrays.toString(a));
    }
}
