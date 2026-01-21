package TwoDArrays;

public class ReverseAllRows {
    public static void main(String[] args) {
        int[][] arr = {{2,8,3,4,7} , {7,2,1,6,3} , {5,5,4,1,4} , {3,1,8,2,6}};
        for(int i = 0 ; i < arr.length ; i++){
            for(int j = 0 ; j <arr[0].length ; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("\n");


        //reversing all the rows of an array
        for(int i = 0 ; i < arr.length ; i++){
            for(int j = 0 ; j < arr[0].length ; j++){
                int a = 0;
                int b = arr[0].length-1;
                while(a <= b){
                    int temp = arr[i][a];
                    arr[i][a] = arr[i][b];
                    arr[i][b] = temp;
                    a++;
                    b--;
                }
            }
        }
        for(int i = 0 ; i < arr.length ; i++){
            for(int j = 0 ; j <arr[0].length ; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\n");


        //reversing all the columns of an array
        for(int i = 0 ; i < arr[0].length ; i++){
            for(int j = 0 ; j < arr.length ; j++){
                int a = 0;
                int b = arr.length-1;
                while(a <= b){
                    int temp = arr[j][a];
                    arr[j][a] = arr[j][b];
                    arr[j][b] = temp;
                    a++;
                    b--;
                }
            }
        }


        for(int i = 0 ; i < arr.length ; i++){
            for(int j = 0 ; j <arr[0].length ; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
