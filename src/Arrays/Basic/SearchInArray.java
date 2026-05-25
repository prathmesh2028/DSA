package Arrays.Basic;

public class SearchInArray {
    public static void main(String[] args) {
        int n  = 4;
        int[] arr = {1,2,3,5,4,6,7,9,8,10};

        boolean found = false;
        for(int i = 0 ; i < arr.length ; i++)
        {
            if(arr[i] == n) {
                found = true;
                break;
            }
        }
        if(found) System.out.println("Element founded");
        else System.out.println("Not founded");
    }
}
