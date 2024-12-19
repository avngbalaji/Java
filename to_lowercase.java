public class to_lowercase
{
    public static void main(String[] args)
    {
        StringBuilder s = new StringBuilder("ABCDEFG");
        System.out.println("String : "+s);

        for (int i=0; i<s.length(); i++)
        {
            if(s.charAt(i)>=65 && s.charAt(i)<=90)
            {
                int c = (int) s.charAt(i) + 32;
                s.setCharAt(i,(char)c);
            }
        }
        System.out.println("Lowercase : "+s);
    }
}
