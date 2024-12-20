class ABC
{
    static ABC obj = null;
    private ABC(){}     //make the constructor private
    public static ABC getInstance()
    {
        if(obj==null)
            obj=new ABC();
        return obj;
    }
    void display()
    {
        System.out.println("Singleton");
    }
}

public class singleton
{
    public static void main(String[] args)
    {
        ABC o =ABC.getInstance();
        o.display();

        //ABC o1 = new ABC();
        /*
        * we can't create multiple objects
        * */
    }
}
