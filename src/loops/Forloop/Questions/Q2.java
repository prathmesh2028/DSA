package loops.Forloop.Questions;

public class Q2 {
    public static void main(String[] args) {
        System.out.println("Values from A to Z");

        for(int i = 65 ; i < 91 ; i++)
        {
            System.out.print((char)i + " ");
        }

        System.out.println();


        System.out.println("Values from a to z");
        for(int i = 97 ; i < 123 ; i++)
        {
            System.out.print((char)i + " ");
        }

        System.out.println();

        System.out.println("Values from 0 to 9");
        for(int i = 48 ; i < 58 ; i++)
        {
            System.out.print((char)i + " ");
        }
    }
}
