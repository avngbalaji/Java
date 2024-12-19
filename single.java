class Father
{
    public void house()
    {
        System.out.println("Have own 2BHK House");
    }
}

class Son extends Father
{
    public void car()
    {
        System.out.println("Have own Audi Car");
    }
}

public class single
{
    public static void main(String[] args)
    {
        Son obj = new Son();
        obj.car();
        obj.house();
    }
}

//i have same named java classes in same folder