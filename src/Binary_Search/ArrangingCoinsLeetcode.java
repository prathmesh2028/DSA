package Binary_Search;
/*


for example for n = 10;
 *
 * *
 * * *
 * * * *

 so ans = 3
 as three blocks are filled with the coins

 */
public class ArrangingCoinsLeetcode {
    public static void main(String[] args) {
        int n = 13;
        System.out.println((sqrt(8*n+1)-1)/2);
    }
    public static int sqrt(int x){
        int low = 1 , high = x;
        int ans = -1;
        while(low <= high){
            int mid = low + (high-low)/2;
            if(mid == x/mid) {
                return mid;
            }
            else if(mid > x/mid) high = mid - 1;
            else if(mid < x/mid) {
                ans = mid;
                low = mid + 1;
            }
        }
        return ans;
    }
}
