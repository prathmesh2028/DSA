package Arrays;

public class MergeThreeSortedArraysInSIngleOne {
    public static void main(String[] args) {
        int[] a = {2, 5, 6, 9};
        int[] b = {1, 3, 4, 5, 10, 11};
        int[] c = {4, 7, 11, 15, 17, 20, 25, 26, 27, 30, 99};
        int[] d = new int[a.length + b.length + c.length];

        int i = 0, j = 0, k = 0, l = 0;
        while (i < a.length && j < b.length && k < c.length) {
            if (a[i] < b[j] && a[i] < c[k]) {
                d[l++] = a[i++];
            } else if (a[i] > b[j] && b[j] < c[k]) {
                d[l++] = b[j++];
            } else if (c[k] < a[i] && b[j] > c[k]) {
                d[l++] = c[k++];
            }
            else if(a[i] == b[j] && a[i] == c[k])
            {
                d[l++] = b[j++];
                d[l++] = c[k++];
                d[l++] = a[i++];
            }
            else if(a[i] == b[j]){
                d[l++] = a[i++];
                d[l++] = b[j++];
            }
            else if(a[i] == c[k]){
                d[l++] = a[i++];
                d[l++] = c[k++];
            }
            else if(b[j] == c[k]){
                d[l++] = b[j++];
                d[l++] = c[k++];
            }

        }
        while( i < a.length && j < b.length)
        {
            if(a[i] < b[j]) {
                d[l++] = a[i++];
            }
            else if(a[i] > b[j])
            {
                d[l++] = b[j++];
            }
            else if(a[i] == b[j])
            {
                d[l++] = a[i++];
                d[l++] = b[j++];
            }
        }
        while( i < a.length && k < c.length)
        {
            if(a[i] < c[k]) {
                d[l++] = a[i++];
            }
            else if(a[i] > c[k])
            {
                d[l++] = c[k++];
            }
            else if(a[i] == c[k])
            {
                d[l++] = a[i++];
                d[l++] = c[k++];
            }
        }
        while( j < b.length && k < c.length)
        {
            if(c[k] < b[j]) {
                d[l++] = c[k++];
            }
            else if(c[k] > b[j])
            {
                d[l++] = b[j++];
            }
            else if(c[k] == b[j])
            {
                d[l++] = c[k++];
                d[l++] = b[j++];
            }
        }
        while (i < a.length) d[l++] = a[i++];
        while (j < b.length) d[l++] = b[j++];
        while (k < c.length) d[l++] = c[k++];
        //


        for(int m : d) System.out.print(m + " ");

    }
}
