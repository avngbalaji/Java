class casting
{
    public static void main(String[] args)
    {
        //widening casting
        int a= 10;
        double b;
        b=a;
        //narrowing casting
        double c=86.5748;
        int d;
        d=(int)c;
        System.out.println("Int a : "+a);
        System.out.println("Double b : "+b);

        System.out.println("Double c : "+c);
        System.out.println("Int d : "+d);
    }
}