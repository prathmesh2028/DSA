package TwoDArrays;
import java.util.Scanner;
public class InputOutputOf2DArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        // taking output of 2D array
//        int[][] arr = new int[3][4];
//        for(int i = 0 ; i < 3 ; i++){
//            for(int j = 0 ; j < 4 ; j++){
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }
//        System.out.println(arr.length); // 3 for above



//        int[][] arr = {{5,3,1,4},{7,8,5,-9},{6,-4,-3,3},{0,0,6,5}};
//        for(int i = 0 ; i < 3 ; i++){
//            for(int j = 0 ; j < 4 ; j++){
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }
//        System.out.println(arr.length); // 4 for above





        // taking input from the user for the 2D array
        int[][] arr = new int[3][4];
        for(int i = 0 ; i < 3 ; i++){
            for(int j = 0 ; j < 4 ; j++){
                System.out.print("Enter the element at position " + i + " " + j + " :");
                arr[i][j] = sc.nextInt();
            }
            System.out.println();
        }

        // printing the ame array
        for(int i = 0 ; i < 3 ; i++){
            for(int j = 0 ; j < 4 ; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
