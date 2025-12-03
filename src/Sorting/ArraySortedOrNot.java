package Sorting;

public class ArraySortedOrNot {
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4,5,6};
        int[] a = {8,5,2,8,3,9,3};
        boolean flag = false;
        for(int i = 0; i < a.length-1 ; i++){
            if(a[i] > a[i+1]){
                flag = true;
                break;
            }

        }
        if(flag) System.out.println("array is not sorted");
        else System.out.println("array is sorted");
    }
}
