package Binary_Search.Binary_Search_revised;

public class Binary_Search_In_Reversed_Sorted_Array {
    public static void main(String[] args) {
        int[] arr = {5, 2, 0, -3, -10};
        int target = -3;
        int low = 0 , high = arr.length-1;
        while(low <= high)
        {
            int mid = (low + high)/2;
            if(arr[mid] == target)
            {
                System.out.println("Element founded at " + mid);
                break;
            }
            else if(arr[mid] > target) low = mid+1;
            else high = mid - 1;
        }
    }
}
