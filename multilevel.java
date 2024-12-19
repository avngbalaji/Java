class GrandFather
{
    public void house()
    {
        System.out.println("3BHK House");
    }
}

class Father1 extends GrandFather
{
    public void land()
    {
        System.out.println("5 Acres Land");
    }
}

class Son1 extends Father1
{
    public void car()
    {
        System.out.println("Audi Car");
    }
}

public class multilevel
{
    public static void main(String[] args)
    {
        Son1 obj = new Son1();
        obj.car();
        obj.house();
        obj.land();
    }
}
