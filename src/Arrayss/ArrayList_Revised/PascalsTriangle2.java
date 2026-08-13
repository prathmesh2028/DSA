package Arrayss.ArrayList_Revised;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle2 {
    public static void main(String[] args) {
//        Input: rowIndex = 3
//        Output: [1,3,3,1]
        System.out.println(getRow(3));
    }
    public static List<Integer> getRow(int rowIndex) {
        List<List<Integer>> list = new ArrayList<>();
        for(int i= 0 ; i <= rowIndex ; i++)
        {
            list.add(new ArrayList<>());
            for(int j = 0 ; j <= i ; j++)
            {
                if(j==0 || j== i) list.get(i).add(1);
                else list.get(i).add(list.get(i-1).get(j) + list.get(i-1).get(j-1));
            }
        }

        return list.get(rowIndex);
    }
}
