package String;

public class StringShuffling {
    public static void main(String[] args) {
        String s = "codeleet";
        int[] indices = {4,5,6,7,0,2,1,3};
        int n = indices.length;
        char[] r = new char[n];
        for(int i = 0 ; i < indices.length ; i++){
            r[indices[i]] = s.charAt(i);
        }
        System.out.println(r);
    }
}
