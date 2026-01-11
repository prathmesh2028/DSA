package Binary_Search;

public class FloorInASortedArray {
    public static void main(String[] args) {
        int[] arr = {1,2,8,10,10,12,19};
        int num = 5;
        int idx = -1;
        int n = arr.length;
        int low = 0 , high = n - 1;
        while(low <= high){
            int mid = (low + high) / 2;
            if(arr[mid] > num ) high = mid - 1;
            else{
                idx = mid;
                low = mid + 1;
            }
        }
        System.out.println(idx);
    }
}
