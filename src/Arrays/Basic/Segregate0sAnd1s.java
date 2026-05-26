package Arrays.Basic;

public class Segregate0sAnd1s {
    public static void main(String[] args) {

    }
    public static void segregate0and1(int[] arr) {
        // code here
        int i = 0 , j = arr.length-1;
        while(i < j) {
            if (arr[i] == 1 && arr[j] == 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
            if (arr[i] == 0) i++;
            if (arr[j] == 1) j--;

        }
}}
