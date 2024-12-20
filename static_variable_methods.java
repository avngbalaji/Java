class staticTest
{
    static int a = 10;//static variable
    int b = 20;//instance variable

    void show()
    {
        System.out.println("A : "+a+" B : "+b);
    }
    static void display()
    {
        /*Inside static method, we can only
        * access the static variables. That's
        * why we didn't use the b variable.*/
        System.out.println("A : "+a);
    }
}

public class static_variable_methods
{
    public static void main(String[] args)
    {
        staticTest o1 = new staticTest();
        o1.show();
        staticTest o2 = new staticTest();
        o2.b=100;
        staticTest.a=200;
        o2.show();
        o1.show();
        /*static variable doesn't change
        * It's common for all object
        * whereas instance variable affect only
        * their values and change accordingly*/
    }
}
