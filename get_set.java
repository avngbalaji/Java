class Shape_Rectangle
{
    private int length, breadth;

    // Getter Method
    int getLength()
    {
        return length;
    }

    int getBreadth()
    {
        return breadth;
    }

    //Setter Method
    void setLength(int l)
    {
        length =l;
    }

    void setBreadth(int b)
    {
        breadth =b;
    }

    int area()
    {
        int a = length * breadth;
        return a;
    }
}
public class get_set
{
    public static void main(String[] args)
    {
        Shape_Rectangle obj = new Shape_Rectangle();
        obj.setLength(10);
        obj.setBreadth(2);

        System.out.println("Length : "+obj.getLength());
        System.out.println("Breadth : "+obj.getBreadth());
        System.out.println("Area of Rectangle : "+obj.area());
    }
}
