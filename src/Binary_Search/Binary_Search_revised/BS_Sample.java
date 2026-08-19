package Binary_Search.Binary_Search_revised;

public class BS_Sample {
    public static void main(String[] args) {
        int[] arr = {-76,-4,9,28,47,49,510,615,9911,9999};
        int lo = 0 , hi = arr.length - 1;
        int target = -4;
        while(lo <= hi)
        {
            int mid = (lo + hi)/2;
            if(arr[mid] > target) hi = mid-1;
            else if(arr[mid] < target) lo = mid+1;
            else
            {
                System.out.println("Element founded ...!");
                break;
            }
        }
    }
}
