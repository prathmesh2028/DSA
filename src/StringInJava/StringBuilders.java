package StringInJava;

public class StringBuilders {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("prathmesh");
        System.out.println(sb);
        sb.append(" badhe");
        System.out.println(sb.length() + " " + sb.capacity());
        System.out.println(sb);
        sb.setCharAt(0 , 's');
        System.out.println(sb);
        sb.toString();


        StringBuilder s = new StringBuilder("BADHEP");
        System.out.println(s.reverse());

        // manually reversing algorithm
        int i = 0 , j = s.length()-1;
        while(i <= j){
            char temp1 = s.charAt(i);
            char temp2 = s.charAt(j);
            s.setCharAt(i,temp2);
            s.setCharAt(j , temp1);
            i++;
            j--;
        }
        System.out.println(s);
    }
}
