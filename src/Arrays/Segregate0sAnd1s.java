package Arrays;

public class Segregate0sAnd1s {
    public static void main(String[] args) {
        int[] arr = {0,1,0,1,0,0,0,1,1,0};
        int n = arr.length;
//        int numberOfZeros = 0;
//        int numberOf1s = 0;
//        for(int i = 0 ; i < arr.length ; i++){
//            if(arr[i] == 1) numberOf1s ++;
//            else numberOfZeros++;
//        }
//
//        for(int i = 0 ; i < numberOfZeros ; i++){
//            arr[i] = 0;
//        }
//        for(int i = numberOfZeros ; i < arr.length ; i++){
//            arr[i] = 1;
//        }

//         two pointer approach
        int i = 0 ;
        int j = arr.length - 1;
        while(i < j){
            if(arr[i] == 0) i++;
            else if(arr[j] == 1) j--;
            else if(i > j) break;
            else if(arr[i] == 1 && arr[j] == 0){
                arr[i] = 0;
                arr[j] = 1;
                i++;
                j--;
            }
        }
        printarr(arr);
    }
    public static void printarr(int[] arr){
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i] + "  ");
        }
    }
}
