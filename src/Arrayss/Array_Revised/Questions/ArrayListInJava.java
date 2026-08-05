package Arrayss.Array_Revised.Questions;

import java.util.ArrayList;

public class ArrayListInJava {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(25);
        arr.add(21);
        arr.add(43);
        System.out.println(arr.get(2));
        arr.set(2,200);
        System.out.println(arr);

        int n = arr.size();
        for(int i = 0 ; i < n ; i++)
        {
            System.out.print(arr.get(i) + " ");
        }

        for(int ele:arr)
        {
            System.out.print(ele + " ");
        }
    }
}
