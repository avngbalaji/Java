class Test
{
    final int MIN=1;
    final int NORMAL;
    final int MAX;

    Test(int normal) {
        NORMAL = normal;
        MAX = 100;
    }

    void display()
    {
        System.out.println("MIN : "+MIN);
        System.out.println("NORMAL : "+NORMAL);
        System.out.println("MAX : "+MAX);
    }
}

public class finalTest
{
    public static void main(String[] args)
    {
        Test obj = new Test(50);
        obj.display();
    }
}
