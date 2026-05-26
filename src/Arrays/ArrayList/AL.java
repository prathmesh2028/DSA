package Arrays.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class AL {
    public static void main(String[] args) {
        // flexible size in arraylist
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(25); arr.add(21) ; arr.add(3);

        arr.set(2 , 33);
        System.out.println(arr.get(2));
        System.out.println(arr);

        System.out.println(arr);
        arr.add(1,100);
        System.out.println(arr);
        Collections.reverse(arr);
        System.out.println(arr);
    }
}
