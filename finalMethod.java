class Super
{
    public void display()
    {
        System.out.println("I am Super Display");
    }
    final void finalDisplay()
    {
        System.out.println("I am Super Final Display");
    }
}
class Sub extends Super
{
    public void display()
    {
        System.out.println("I am Sub Display");
    }
    /*
    final void finalDisplay()
    {
        System.out.println("I am Super Final Display");
    }
    commented because we can't override final method
    */
}

public class finalMethod
{
    public static void main(String[] args)
    {
        Sub o = new Sub();
        o.display();
        o.finalDisplay();
    }
}
