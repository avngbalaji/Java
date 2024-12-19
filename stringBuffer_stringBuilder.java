public class stringBuffer_stringBuilder
{
    public static void main(String[] args)
    {
        StringBuffer buffer = new StringBuffer("Tutor");/* works with StringBuilder also*/
        System.out.println(buffer);
        buffer.append(" Joes");
        System.out.println(buffer);
        buffer.insert(10," Computer");
        System.out.println(buffer);
        buffer.replace(9,11,"@@@");
        System.out.println(buffer);
        buffer.delete(9,11);
        System.out.println(buffer);
        buffer.reverse();
        System.out.println(buffer);
        System.out.println("buffer.charAt(0) : "+buffer.charAt(0));
        System.out.println("buffer.length() : "+buffer.length());
        System.out.println("buffer.substring(2) : "+buffer.substring(2));
        System.out.println("buffer.substring(0,5) : "+buffer.substring(0,5));
        buffer.setCharAt(0,'@');
        System.out.println(buffer);

        StringBuffer sb = new StringBuffer();
        System.out.println("sb.capacity() : "+sb.capacity());//default -> 16
        sb.append("Hello");
        System.out.println("sb.capacity() : "+sb.capacity());//now -> 16
        sb.append("Java is my favorite language");
        System.out.println("sb.capacity() : "+sb.capacity());// above default_capacity -> (old_capacity*2)+2 => 34
    }
}
