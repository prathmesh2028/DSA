package loops;

public class AllAlphabetsFromASCII {
    public static void main(String[] args) {
        System.out.println("PRINTING ALL ALPHABETS...");
        for(int i = 65 ; i <= 90 ; i++){
            System.out.println((char)i);
        }
        for(int i = 48 ; i <= 57 ; i++){
            System.out.println((char)i);
        }
        for(int i = 97 ; i <= 122 ; i++ ){
            System.out.println((char)i);
        }
    }
}
