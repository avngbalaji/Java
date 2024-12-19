class complex
{
    private int real, img;

    public complex()
    {
        this.real=5;
        this.img=3;
    }
    public complex(int r, int i)
    {
        this.real=r;
        this.img=i;
    }
    public complex(complex x)
    {
        this.real=x.real;
        this.img=x.img;
    }

    public String toString()
    {
        return "(" + real + "+" + img + "i)";
    }
}

public class copyConDemo
{
    public static void main(String[] args)
    {
        complex o1=new complex();
        System.out.println("Object 1 : "+o1);

        complex o2 =new complex(10,45);
        System.out.println("Object 2 : "+ o2);

        complex o3 =new complex(o2);
        System.out.println("Object 3 : "+ o3);
    }
}
