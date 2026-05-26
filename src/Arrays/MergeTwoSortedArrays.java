package Arrays;

public class MergeTwoSortedArrays {
    public static void main(String[] args) {
        int[] a = {2, 5, 6, 9};
        int[] b = {1, 3, 4, 5, 10, 11};
        int[] c = new int[a.length + b.length];
        int i = 0 , j = 0 , k = 0;
        while(i < a.length && j < b.length)
        {
            if(a[i] > b[j]) {
                c[k] = b[j];
                j++;
            }
            else if(a[i] < b[j]) {
                c[k] = a[i];
                i++;
            }
            else if(a[i] == b[j])
            {
                c[k] = a[i];
                k++;
                c[k] = b[j];
                i++;
                j++;
            }
            k++;
        }
        while(i < a.length) {
            c[k] = a[i];
            k++;
            i++;
        }
        while(j < b.length) {
            c[k] = b[j];
            k++;
            j++;
        }
        for(int t:c) System.out.print(t + " ");
    }
}
