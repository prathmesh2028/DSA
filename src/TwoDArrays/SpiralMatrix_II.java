package TwoDArrays;

public class SpiralMatrix_II {
    public static void main(String[] args) {
        int i=0 , j=0;
        int n = 3;
        int num = 1;
        int[][] arr = new int[n][n];
        int fc = 0 , fr = 0;
        int lc = n-1 , lr = n-1;
        while(fr <= lr && fc <= lc){

            // left to right
            for(int q = fc ; q <= lc ; q++){
                arr[fr][q] = num;
                num++;
            }
            fr++;

            if(fr > lr) break;

            //up to down
            for(int q = fr ; q <= lr ; q++){
                arr[q][lc] = num;
                num++;
            }
            lc--;
            if(fc > lc) break;
            // right to left
            for(int q = lc ; q >= fc ; q--){
                arr[lr][q] = num;
                num++;
            }
            lr--;

            if(fr > lr) break;
            //down to up
            for(int q = lr ; q >= fr ; q--){
                arr[q][fc] = num;
                num++;
            }
            fc++;
        }


        for(int[] ele:arr){
            for(int e:ele){
                System.out.print(e + " ");
            }
            System.out.println();
        }
    }
}
