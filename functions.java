class methods
{
    /*
    * Types of user defined methods:
    * 1. No return, without arguments
    * 2. No return, with arguments
    * 3. Return, without arguments
    * 4. Return, with arguments
    * */

//    * 1. No return, without arguments
    public void add()
    {
        int a = 123;
        int b = 10;
        System.out.println("Addition : "+(a+b));
    }

//    * 2. No return, with arguments
    public void sub(int x, int y)
    {
        System.out.println("Subtraction : "+(x-y));
    }

//    * 3. Return, without arguments
    public int mul()
    {
        int a = 123;
        int b = 10;
        return a*b;
    }

//    * 4. Return, with arguments
    public float div(float x, float y)
    {
        return x/y;
    }

//    * Recursion - always with return and arguments
    public int factorial(int n)
    {
        if(n==1)
            return 1;
        else
            return (n*factorial(n-1));
    }
}

public class functions
{
    public static void main(String[] args)
    {
        methods obj = new methods();
        obj.add();
        obj.sub(123,10);
        System.out.println("Multiplication : "+obj.mul());
        System.out.println("Division : "+obj.div(123,10));
        System.out.println("Recursion : "+obj.factorial(5));
    }
}
