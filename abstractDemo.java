abstract class ShapeParent
{
    abstract void draw();
    void message()
    {
        System.out.println("Message from shape..");
    }
}

class ShapeChild extends ShapeParent
{
    @Override
    void draw()
    {
        System.out.println("Draw");
    }
}

public class abstractDemo
{
    public static void main(String[] args)
    {
        ShapeChild o = new ShapeChild();
        o.draw();
        o.message();
    }
}
