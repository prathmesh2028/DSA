package Arrays;
import java.util.Arrays;
public class ShallowDeepCopy {
    public static void main(String[] args) {

        int a = 4; // takes 4 bytes

        //shallow copy
        int[] arr = {10,20,30,40};
//        int[] x = arr;
//        x[0] = 100;


        // deep copy
        int[] deep = Arrays.copyOf(arr , arr.length); // deep copy
        deep[0] = 100;
        System.out.println(deep[0]);
        System.out.println(arr[0]);
    }
}
