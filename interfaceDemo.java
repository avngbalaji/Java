interface Animal
{
    void sound();
    void sleep();
}

class Dog implements Animal
{

    @Override
    public void sound() {
        System.out.println("The Dog sounds like : woof");
    }

    @Override
    public void sleep() {
        System.out.println("The Dog sleeping");
    }
}
public class interfaceDemo
{
    public static void main(String[] args)
    {
        Dog d = new Dog();
        d.sound();
        d.sleep();
    }
}
