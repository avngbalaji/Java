import java.util.Arrays;

public class insert_element_array
{
    public static void main(String[] args)
    {
        int[] a = new int[]{1,2,4,5,6,7,8,9,10,11};
        System.out.println("Before Insert: "+ Arrays.toString(a));

        int index=2, value=3;
        for (int i=a.length-1;i>index;i--)
            a[i]=a[i-1];
        a[index]=value;

        System.out.println("After Insert: "+ Arrays.toString(a));
    }
}
