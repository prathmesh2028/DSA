package Binary_Search;

public class Simple_Binary_Search {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int target = 4;
        int low = 0;
        int high = arr.length - 1;
        while(low <= high){
            int mid = (low + high) / 2;
            if(arr[mid] > target){
                high = mid - 1;
            }
            else if(arr[mid] < target){
                low = mid + 1;
            }
            else if(arr[mid] == target){
                System.out.println("Element " + arr[mid] +" found at " + mid);
                break;
            }
        }
    }
}
/*
    1. Search in a descending array using binary search
    2. First and last occurences
    3. Sorted array search GFG practise || Leetcode
    4. Search in a mountain array
    5. Floor in a sorted array
    6. Leetcode 2529 Maximum count of positive integer and negative integer
    7. Square Root Brute force and optimized approach using the binary search algorithm
 */