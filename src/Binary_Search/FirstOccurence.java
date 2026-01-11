package Binary_Search;

public class FirstOccurence {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,2,3,4,5,5,5,6,7,8,11};
        int n = arr.length;
        int target = 5;
        int low = 0 , high = n - 1 , idx = -1;

        while(low <= high){
            int mid = (low + high) / 2;
            if(arr[mid] > target)high = mid - 1;
            else if(arr[mid] < target) low = mid + 1;
            else if(arr[mid] == target) {
                idx = mid;
                high = mid - 1;
            }
        }
        System.out.println(idx);
    }
}
