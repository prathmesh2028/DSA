package Arrays.Basic;

public class OddByTwoEvenBy10 {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60};
        for(int i = 0 ; i < arr.length ; i++)
        {
            if(i % 2 == 0)
            {
                arr[i] += 10;
            }
            else {
                arr[i] *= 2;
            }
        }
        for(int i:arr) System.out.print(i + " ");
    }
}
