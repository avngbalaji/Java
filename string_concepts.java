public class string_concepts
{
    public static void main(String[] args)
    {
        String a = "Tutor Joes";
        String b = "Tutor Joes";
        String s = "tutor Joes";
        System.out.println("a : "+a);
        System.out.println("b : "+b);
        System.out.println("s : "+s);

        System.out.println("a.hashCode() : "+a.hashCode());
        System.out.println("b.hashCode() : "+b.hashCode());
        System.out.println("s.hashCode() : "+s.hashCode());

        System.out.println("a.equals(b) : "+a.equals(b));
        System.out.println("b.equals(s) : "+b.equals(s));
        System.out.println("a.equalsIgnoreCase(b) : "+a.equalsIgnoreCase(b));
        System.out.println("b.equalsIgnoreCase(s) : "+b.equalsIgnoreCase(s));

        System.out.println("a.length() : "+a.length());
        System.out.println("a.charAt(0) : "+a.charAt(0));
        System.out.println("a.toUpperCase() : "+a.toUpperCase());
        System.out.println("a.toLowerCase() : "+a.toLowerCase());

        System.out.println("a.replace('Joes','Stanley') : "+a.replace("Joes","Stanley"));
        System.out.println("a : "+a);

        System.out.println("a.contains('Joes') : "+a.contains("Joes"));
        System.out.println("a.isEmpty() : "+a.isEmpty());

        System.out.println("a.endsWith('es') : "+a.endsWith("es"));
        System.out.println("a.startsWith('Tut') : "+a.startsWith("Tut"));

        System.out.println("a.substring(5) : "+a.substring(5));
        System.out.println("a.substring(0,5) : "+a.substring(0,5));

        char[] c_array = a.toCharArray();
        for(char c : c_array)
            System.out.print(c+" ");
        System.out.println();

        String c = " Tutor ";
        System.out.println("c : "+c);
        System.out.println("c.length() : "+c.length());
        System.out.println("c.trim() : "+c.trim());
        System.out.println("c.trim().length() : "+c.trim().length());
    }
}
