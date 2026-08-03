package Arrayss.Array_Revised.Basic;
import java.util.*;
public class Basic {
    public static void main(String[] args)
    {
        int[] x = {4,1,4,1,171,8,55,4};

        // indexing
        System.out.println(x[4]); // accessing the element
        System.out.println(x[4]);
        // updating elements - mutabilability

        int[] arr = new int[4]; // 4 size ka array
        arr[0] = 10;
        arr[1] = 44;
        arr[2] = 31;
        arr[3] = 9;
        System.out.println(Arrays.toString(arr));
    }
}
