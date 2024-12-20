final class finalClassDemo
{
    public void display()
    {
        System.out.println("I am Display");
    }
}
/*
class AAA extends finalClassDemo
{
    commented because we can't extend final class
}
*/

public class finalClass
{
    public static void main(String[] args)
    {
        finalClassDemo o = new finalClassDemo();
        o.display();
    }
}
