public class count_char
{
    public static void main(String[] args)
    {
        String a = "Ram-age is 12@";
        System.out.println(a);
        int upper=0,lower=0,space=0,number=0,vowels=0,symbols=0;
        for (int i=0; i<a.length(); i++)
        {
            if(a.charAt(i)>=97 && a.charAt(i)<=122)
                lower++;
            if(a.charAt(i)>=65 && a.charAt(i)<=90)
                upper++;
            if(a.charAt(i)==32)
                space++;
            if(a.charAt(i)>=48 && a.charAt(i)<=57)
                number++;
            if(a.charAt(i)=='A' || a.charAt(i)=='E' || a.charAt(i)=='I' || a.charAt(i)=='O' || a.charAt(i)=='U' || a.charAt(i)=='a' || a.charAt(i)=='e' || a.charAt(i)=='i' || a.charAt(i)=='o' || a.charAt(i)=='u')
                vowels++;
        }
        symbols=a.length()-(lower+upper+space+number);

        System.out.println("Lower : "+lower);
        System.out.println("Upper : "+upper);
        System.out.println("Space : "+space);
        System.out.println("Number : "+number);
        System.out.println("Vowels : "+vowels);
        System.out.println("Symbols : "+symbols);

    }
}
