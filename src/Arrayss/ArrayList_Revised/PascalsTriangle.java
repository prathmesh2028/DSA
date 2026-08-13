package Arrayss.ArrayList_Revised;

import java.util.ArrayList;

public class PascalsTriangle {
    public static void main(String[] args) {
        int n = 5;
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for(int i = 0 ; i < n ; i++)
        {
            list.add(new ArrayList<>());
            for(int j = 0 ; j <= i ; j++)
            {
                if(j==0 || j == i) list.get(i).add(1);
                else {
                    int element = list.get(i-1).get(j) + list.get(i-1).get(j-1);
                    list.get(i).add(element);
                }
            }
        }
        System.out.println(list);
    }
}
