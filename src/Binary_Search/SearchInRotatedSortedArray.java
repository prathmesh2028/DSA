package Binary_Search;

public class SearchInRotatedSortedArray {
    public static void main(String[] args) {
        int [] arr = {4,5,7,6,0,1,2};
        int n = arr.length;
        int target = 0;
        int pivot = -1;
        //finding the pivot element
        int low = 0 , high = n - 1;
        while(low < high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] > arr[high]) low = mid + 1;
            else high = mid;
        }
        pivot = low;

        low = 0;
        high = pivot;
        while(low <= high ){
            int mid = low + (high-low)/2;
            if(arr[mid] == target){
                System.out.println(mid);
                break;
            }
            else if(arr[mid] > target) high = mid -1 ;
            else if(arr[mid] < target) low = mid +1 ;
        }
        low = pivot;
        high = n-1;
        while(low <= high ){
            int mid = low + (high-low)/2;
            if(arr[mid] == target){
                System.out.println(mid);
                break;
            }
            else if(arr[mid] > target) high = mid - 1;
            else if(arr[mid] < target) low = mid + 1;
        }
    }
}
