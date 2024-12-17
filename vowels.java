import java.util.Scanner;

class vowels
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a Letter: ");
        char letter = s.next().charAt(0);

        switch (letter)
        {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println(letter+" is vowel");
                break;
            default:
                System.out.println(letter+" is not a vowel");
        }
    }
}