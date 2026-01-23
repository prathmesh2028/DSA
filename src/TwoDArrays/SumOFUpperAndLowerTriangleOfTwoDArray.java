package TwoDArrays;

import java.util.ArrayList;

public class SumOFUpperAndLowerTriangleOfTwoDArray {
    public static void main(String[] args) {
        int[][] mat =   {{6, 5, 4},
                        {1, 2, 5},
                        {7, 9, 7}};
        int count1 = 0;
        int count2 = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0 ; i < mat.length ; i++){
           for(int j = 0 ; j <= i ; j++){
               count1 += mat[i][j];
           }
        }
        list.add(count1);

        for(int i = 0 ; i < mat.length ; i++){
            for(int j = i ; j < mat[0].length ; j++){
                count2 += mat[i][j];
            }
        }
        list.add(count2);
        System.out.println(list.toString());
    }
}
