package Arrays;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayListinJava {
    public static void main(String[] args) {
//        int[] arr = new int[100];
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(25);
        arr.add(21);
        arr.add(18);
        arr.add(5);
        arr.add(20);
//        System.out.println(arr.get(4));
//        arr.set(4 , 200);
//        System.out.println(arr.get(4));
//        System.out.println(arr);


//        int n = arr.size();
//        for(int i = 0 ; i < n ; i++){
//            System.out.println(arr.get(i) + " ");
//        }
//        arr.add(1 , 1000);
//        arr.remove(arr.size() - 1);
//        arr.clear();
//        Collections.reverse(arr);

        // code for reversing it
        int i = 0 ;
        int j = arr.size() - 1;
        System.out.println(arr);
        while(i < j){
            int temp = arr.get(i);
            arr.set(i , arr.get(j));
            arr.set(j , temp);
            i++;
            j--;
        }
        System.out.println(arr);

    }
}
