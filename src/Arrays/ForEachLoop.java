package Arrays;

public class ForEachLoop {
    public static void main(String[] args) {

        // used to traverse the data structures

        int[] arr = {5,8,2,6,9};
        for(int v : arr) System.out.println(v);


        for(int va : arr) va *= 2;
        // not possible
    }
}
