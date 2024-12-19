public class to_uppercase
{
    public static void main(String[] args)
    {
        StringBuilder s = new StringBuilder("abcdefg");
        System.out.println("String : "+s);

        for (int i=0; i<s.length(); i++)
        {
            if(s.charAt(i)>=97 && s.charAt(i)<=122)
            {
                int c = (int)s.charAt(i) - 32;
                s.setCharAt(i,(char)c);
            }
        }
        System.out.println("Uppercase : "+s);
    }
}
