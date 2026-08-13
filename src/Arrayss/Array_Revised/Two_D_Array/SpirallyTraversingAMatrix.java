package Arrayss.Array_Revised.Two_D_Array;

import java.util.ArrayList;

public class SpirallyTraversingAMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 4, 7, 11, 15},
                {2, 5, 8, 12, 19},
                {3, 6, 9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}
        };
        ArrayList<Integer> list = new ArrayList<>();

        int fr = 0 , lr = arr.length-1;
        int fc = 0 , lc = arr[0].length-1;
        while(fr <= lr && fc <= lc)
        {
            for(int i = fc ; i <= lc ; i++)
            {
                list.add(arr[fr][i]);
            }
            fr++;

            if(fr > lr || fc > lc) break;

            for(int i = fr ; i <= lr ; i++)
            {
                list.add(arr[i][lc]);
            }
            lc--;

            if(fr > lr || fc > lc) break;

            for(int i = lc ; i >= fc ; i--)
            {
                list.add(arr[lr][i]);
            }
            lr--;

            if(fr > lr || fc > lc) break;

            for(int i = lr ; i >= fr ; i--)
            {
                list.add(arr[i][fc]);
            }
            fc++;
        }
        System.out.println(list );

    }
}
