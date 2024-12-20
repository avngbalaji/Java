class outerCls
{
    void display()
    {
        class inner
        {
            void innerDisplay()
            {
                System.out.println("Inner Display");
            }
        }

        inner i = new inner();
        i.innerDisplay();
    }
}

public class localInnerClass
{
    public static void main(String[] args)
    {
        outerCls o = new outerCls();
        o.display();
    }
}
