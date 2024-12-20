interface interDemo
{
    final static int A=25;   //by default static final
    public abstract void fun1();    //by default its public abstract
    void fun2();    //private abstract gives error
    public static void fun3()   //without static its error
    {
        System.out.println("Fun-3");
    }
    default void fun5()      //without default its error
    {
        System.out.println("Fun-5");
        fun6();
    }
    //void fun6();
    /*
    * Later if we add the void fun6();
    * it requires the definition in implemented class
    * it's difficult to find in large programs
    * that's why static and default methods
    *   accepted after java 8*/

    private void fun6()     //without body its error
    {
        System.out.println("Fun-6");
    }
    //access this using default methods only accepted ^
}

interface interDemo2 extends interDemo
{
    void fun4();
}

class TestInter implements interDemo2{

    @Override
    public void fun4() {
        System.out.println("Fun-4");
    }

    @Override
    public void fun1() {
        System.out.println("Fun-1");
    }

    @Override
    public void fun2() {
        System.out.println("Fun-2");
    }
}

public class interfaceModeDemo
{
    public static void main(String[] args)
    {
        System.out.println("A : "+interDemo.A);
        interDemo.fun3();

        TestInter obj = new TestInter();
        obj.fun1();
        obj.fun2();
        obj.fun4();
        obj.fun5();
    }
}
