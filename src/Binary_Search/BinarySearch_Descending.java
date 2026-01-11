package Binary_Search;

public class BinarySearch_Descending {
    public static void main(String[] args) {
        int[] arr = {4,3,2,1};
        int target = 4;
        int low = 0 , high = arr.length - 1;
        while(low <= high){
            int mid = (low + high) / 2;
            if(arr[mid] > target) low = mid + 1;
            else if(arr[mid] < target) high = mid - 1;
            else if(arr[mid] == target){
                System.out.println("Founded....!" + " " + mid + " " + arr[mid]);
                break;
            }
        }
    }
}
