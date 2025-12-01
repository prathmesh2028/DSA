package Arrays;

public class MergingTwoSortedArrays {
    public static void main(String[] args) {
        int[] arr1 = {2,5,6,9,20};
        int[] arr2 = {1,3,4,5,7,8};

        int[] finalarr = new int[arr1.length + arr2.length];

        merge(finalarr , arr1 , arr2);

        for(int i: finalarr) System.out.print(i + " ");
    }

    public static void merge(int[] finalarr, int[] arr1, int[] arr2) {
        int i = 0 , j = 0 , k = 0;

        while(i < arr1.length && j < arr2.length){
            if(arr1[i] < arr2[j]){
                finalarr[k++] = arr1[i++];
            } else {
                finalarr[k++] = arr2[j++];
            }
        }

        // leftover elements of arr1
        while(i < arr1.length){
            finalarr[k++] = arr1[i++];
        }

        // leftover elements of arr2
        while(j < arr2.length){
            finalarr[k++] = arr2[j++];
        }
    }
}
