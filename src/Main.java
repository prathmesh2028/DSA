public class Main{
    public static void main(String[] args) {
        int[] arr = {1 , 0 , 0 , 1 , 1 , 1 , 0 , 0 , 1 , 1 , 0};
        int n = arr.length;

//        int os = 0;
//        int ones = 0;
//        for(int i = 0 ; i < n ; i++){
//            if(arr[i] == 0) os ++;
//            else ones ++;
//        }
//        for(int i = 0 ; i < os ; i++){
//            arr[i] = 0;
//        }
//        for(int i = os ; i < n ; i++){
//            arr[i] = 1;
//        }
//        printarr(arr);

        // two pointer approach
        int s = 0;
        int e = n - 1;
        while(s <= e){
            if(arr[s] == 1 && arr[e] == 0){
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
            }
            s++;
            e--;
        }
        printarr(arr);







    }
    public static void printarr(int[] arr){
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i] + "  ");
        }
    }
    public static void revarr(int[] arr , int a , int b){
        int i = a;
        int j = b;
        while(i <= j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}