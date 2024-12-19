class MathOperation
{
    //Method Overloading
    public static int multiply(int x, int y)
    {
        return x*y;
    }
    public static double multiply(double a, double b)
    {
        return a*b;
    }
    public static double multiply(double i, int j)
    {
        return i * j;
    }
    public static int multiply(int r)
    {
        return r*r;
    }
}

public class methodOverloading
{
    public static void main(String[] args)
    {
        System.out.println("Multiply 2 Integer value : "+MathOperation.multiply(3,5));
        System.out.println("Multiply 2 Double value : "+MathOperation.multiply(5.4,2.3));
        System.out.println("Multiply Double & Integer value : "+MathOperation.multiply(9.9,5));
        System.out.println("Multiply Integer value : "+MathOperation.multiply(5));
    }
}
