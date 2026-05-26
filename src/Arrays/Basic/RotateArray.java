package Arrays.Basic;

public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {6, 8, 1, 2, 4, 9, 0};
        int d = 3;
        int n = arr.length;
        d = d % n;
        revarr(arr, 0, d - 1);
        revarr(arr, d, n - 1);
        revarr(arr, 0, n - 1);
        for (int i : arr) System.out.print(i + " ");

    }
    public static void revarr(int[] arr , int i , int j)
    {
        while(i < j)
        {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}

