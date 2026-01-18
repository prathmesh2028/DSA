import java.util.ArrayList;
import java.util.Collections;

public class Main{
    public static void main(String[] args) {
        int[][] matrix = {{1,10,4,2},
                         {9,3,8,7},
                          {15,16,17,12}};
        ArrayList<Integer> result = new ArrayList<>();
        ArrayList<Integer> lowestinrow = new ArrayList<>();
        ArrayList<Integer> maxincolumn = new ArrayList<>();
        for(int i = 0 ; i < matrix.length ; i++){
            int num = Integer.MAX_VALUE;
            for(int j = 0; j < matrix[0].length ; j++){
                if(num > matrix[i][j]) num = matrix[i][j];
            }
            lowestinrow.add(num);
        }
        for(int i = 0 ; i < matrix[0].length ; i++){
            int num = Integer.MIN_VALUE;
            for(int j = 0; j < matrix.length ; j++){
                if(num < matrix[j][i]) num = matrix[j][i];
            }
            maxincolumn.add(num);
        }
        int minA = Collections.min(maxincolumn);
        int maxB = Collections.max(lowestinrow);

        if(minA == maxB){
            System.out.println("Number satisfies condition: " + minA);
        } else {
            System.out.println("No common number fits the rule.");
        }

    }
}