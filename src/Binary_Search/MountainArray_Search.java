package Binary_Search;

public class MountainArray_Search {
    public static void main(String[] args) {
        int[] arr = {-1,0,1,2,5,6,8,6,3};
        System.out.println(MountainArraySearch(arr));

    }
    public static int MountainArraySearch(int[] arr){
        int low = 0, high = arr.length - 1;
        while(low <= high){
            int mid = (low + high) / 2;
            if(arr[mid] > arr[mid + 1] && arr[mid] > arr[mid-1]) return arr[mid];
            else if(arr[mid] < arr[mid + 1] && arr[mid] > arr[mid-1]) low = mid + 1;
//            else if(arr[mid] > arr[mid + 1] && arr[mid] < arr[mid-1]) high = mid - 1;
            else high = mid - 1;
        }
        return 1;
    }
}
