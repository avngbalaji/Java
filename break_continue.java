public class break_continue
{
    public static void main(String[] args)
    {
        for (int i=1; i<=10; i++)
        {
            if (i==3)
                continue;
            System.out.println(i);
            if (i==8)
                break;
        }
    }
}
