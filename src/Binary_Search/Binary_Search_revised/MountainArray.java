package Binary_Search.Binary_Search_revised;

public class MountainArray {
    public static void main(String[] args) {
        // To find the peak index in the mountain array
        int[] arr = {0, 3, 2, 1};
        System.out.println(peakIndexInArray(arr));
    }
    public static int peakIndexInArray(int[] a)
    {
        int low = 1 , high = a.length-2;
        while(low <= high)
        {
            int mid = (low + high)/2;
            if(a[mid] > a[mid-1] && a[mid] < a[mid+1]) low = mid+1;
            else if(a[mid] < a[mid-1] && a[mid] > a[mid+1]) high = mid-1;
            else return mid;
        }
        return -1;
    }
}
