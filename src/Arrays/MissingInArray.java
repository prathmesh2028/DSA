package Arrays;

public class MissingInArray {
    public static void main(String[] args) {

           int[] arr = {1,4,2,5};
                // code here
                long n = arr.length + 1;
                long sum = n*(n+1)/2;
                long orsum = 0;
                //  for(int i = 0 ; i < n ; i++){
                //      sum += i;
                //  }
                for(int ele : arr) orsum += ele;
            System.out.println((int)(sum - orsum));


    }
}
