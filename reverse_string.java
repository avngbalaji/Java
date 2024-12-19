public class reverse_string
{
    public static void main(String[] args)
    {
        StringBuffer str = new StringBuffer("Computer Science");
        System.out.println("String : "+str);
        StringBuffer s = new StringBuffer();

        for (int i=str.length()-1; i>=0; i--)
        {
            s.append(str.charAt(i));
        }
        System.out.println("Reversed String : "+s);
    }
}
