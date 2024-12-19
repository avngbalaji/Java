class large
{
    int a,b;

    large(int num1, int num2)
    {
        a=num1;
        b=num2;
    }

    int largest()
    {
        int largest_no;
        largest_no = Math.max(a, b);
        return largest_no;
    }

    void display()
    {
        int large = largest();
        System.out.println("The largest number is "+large);
    }
}

public class nested_method
{
    public static void main(String[] args)
    {
        large l = new large(7,34);
        l.display();
    }
}
