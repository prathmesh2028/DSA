package TwoDArrays;

public class ShallowAndDeepCopy {
    public static void main(String[] args) {
//        int[][] arr = {{6,0,2,7,6}, {1,3,7,2,2}, {9,9,4,5,2}};
//        int[][] brr = {{6,0,2,7,6}, {1,3,7,2,2}, {9,9,4,5,2}};
//        brr[1][3] = 20;
//        System.out.println(brr[1][3]); // 20


        int[][] arr = {{6,0,2,7,6}, {1,3,7,2,2}, {9,9,4,5,2}};
        int[][] brr = arr;
        brr[1][3] = 20;
        System.out.println(brr[1][3]); // 20
        System.out.println(arr[1][3]); // 20
        // it makes the changes in the main array // shallow copy this is


    }
}
