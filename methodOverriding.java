class user
{
    String name;
    int age;

    user(String n, int a)
    {
        this.name = n;
        this.age = a;
    }

    public void display()
    {
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
    }
}

class MainProgrammer extends user
{
    String company_name;

    MainProgrammer(String n, int a, String c)
    {
        super(n,a);
        this.company_name=c;
    }

    public void display()
    {
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
        System.out.println("Company Name : "+company_name);
    }
}

public class methodOverriding
{
    public static void main(String[] args)
    {
        MainProgrammer obj = new MainProgrammer("Bala",23,"ABC");
        obj.display();
    }
}
