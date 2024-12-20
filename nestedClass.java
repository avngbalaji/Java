class outer
{
    int a = 50;

    class inner
    {
        int b = 100;

        void innerDisplay()
        {
            System.out.println("A : "+a);
            System.out.println("B : "+b);
        }
    }

    void outerDisplay()
    {
        System.out.println("A outer display : "+a);

        inner i = new inner();
        i.innerDisplay();
        System.out.println("B from Inner Class by Outer Display: "+i.b);
    }
}

public class nestedClass
{
    public static void main(String[] args)
    {
        outer o = new outer();
        o.outerDisplay();

        outer.inner i = new outer().new inner();
        i.innerDisplay();
    }
}
