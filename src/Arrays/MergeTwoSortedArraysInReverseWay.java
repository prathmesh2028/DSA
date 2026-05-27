package Arrays;

public class MergeTwoSortedArraysInReverseWay {
    public static void main(String[] args) {
        int[] a = {1,3,5,7,9,29};
        int[] b = {2,4,6,8,10,90};
        int[] c = new int[a.length + b.length];

        int i = a.length-1 , j = b.length-1 , k = c.length-1;
        while(i >= 0 && j >= 0)
        {
            if(a[i] < b[j])
            {
                c[k] = b[j];
                k--;
                j--;
            }
            else if(a[i] > b[j])
            {
                c[k] = a[i];
                i--;
                k--;
            }
            else if(a[i] == b[j])
            {
                c[k] = a[i];
                k--;
                i--;
                c[k] = b[j];
                k--;
                j--;
            }
        }

        while(i >= 0)
        {
            c[k] = a[i];
            k--;
            i--;
        }
        while(j >= 0)
        {
            c[k] = b[j];
            k--;
            j--;
        }

        for(int f:c) System.out.print(f + " ");
    }
}
