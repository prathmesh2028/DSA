package Binary_Search;

public class NegsAndPosInASortedArray {
    public static void main(String[] args) {
        int[] arr = {-5,-3,-2,-1,0,0,0,1,2,3,4,5,6};
        MaxOfNegsAndPos(arr);

    }
    public static void MaxOfNegsAndPos(int[] arr){
        int n = arr.length;
        int pos = 0 , negs = 0;
        //starting binary search for all the negative ones
        int low = 0, high = n-1;
        while(low <= high){
            int mid = (low + high)/2;
            if(arr[mid] >= 0) high = mid - 1;
            else low = mid + 1;
        }
        negs = low;

        // finding all the positive ones
        low = 0;
        high = n-1;
        while(low <= high){
            int mid = (low + high)/2;
            if(arr[mid] <= 0) low = mid + 1;
            else high = mid - 1;
        }
        pos = n-high;

        System.out.println(negs + " " + pos);
    }
}
