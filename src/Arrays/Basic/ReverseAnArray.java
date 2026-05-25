package Arrays.Basic;

public class ReverseAnArray {
    public static void main(String[] args) {
        // reversing an array
        int[] arr = {6, 8, 1, 2, 4, 9};
        int i = 0 , j = arr.length-1;
        while(i < j)
        {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        for(int m:arr) System.out.print(m + " ");
    }
}
