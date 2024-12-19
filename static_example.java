class Mathematical
{
    public static int power(int base, int power)
    {
        int result = 1;
        for (int i = 1; i<=power; i++)
        {
            result = result * base;
        }
        return result;
    }
}

public class static_example
{
    public static void main(String[] args)
    {
        /* static, so we use the class name as obj name */
        System.out.println("Power : "+Mathematical.power(4,3));
    }
}
