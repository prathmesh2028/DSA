package Binary_Search;

public class Square_Root {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(floorsqrt(n));
        /*
        1. SQRT
        2. negs and pos in a sorted array
        3. arranging coins wala problem
         */
    }
    public static int floorsqrt(int n){
        int low = 0, high = n;
        int ans = -1;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(mid == n/mid){
                ans = mid;
                return ans;
//                low = mid + 1;/
            }
            else if(mid> n/mid) high = mid -1;
            else if(mid < n/mid) low = mid + 1;
        }
        return ans;
    }
}
