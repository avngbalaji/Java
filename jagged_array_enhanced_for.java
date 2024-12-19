public class jagged_array_enhanced_for
{
    public static void main(String[] args)
    {
        int [][] a ={
                {23,34,23,11,22},
                {55,34,23},
                {44,12,87,56},
                {12,10}
        };
        for (int [] element_list : a)
        {
            for (int element : element_list)
            {
                System.out.print(" "+element);
            }
            System.out.println();
        }
    }
}
