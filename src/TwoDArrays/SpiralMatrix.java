package TwoDArrays;

public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                {10,20,30,40,50,60},
                {70,80,90,10,11,12},
                {13,14,15,16,17,18},
                {19,20,21,22,23,24},
                {25,26,27,28,29,30}
        };
        int fc = 0 , fr = 0;
        int lr = arr.length-1 , lc = arr[0].length -1;
        while(fc <= lc && fr <= lr){

            // moving left to right
            for(int i = fc ; i <= lc ; i++){
                System.out.print(arr[fr][i] + " ");
            }
            fr++;
            if(fc > lc || fr > lr) break;

            // moving up to down
            for(int i = fr ; i <= lr ; i++){
                System.out.print(arr[i][lc] + " ");
            }
            lc--;
            if(fc > lc || fr > lr) break;
            // moving right to left
            for(int i = lc ; i >= fc ; i--){
                System.out.print(arr[lr][i] + " ");
            }
            lr--;
            if(fc > lc || fr > lr) break;

            // moving down to up
            for(int i = lr ; i >= fr ; i--){
                System.out.print(arr[i][fc] + " ");
            }
            fc++;
        }

    }

}
