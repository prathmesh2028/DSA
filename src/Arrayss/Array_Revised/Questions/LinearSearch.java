package Arrayss.Array_Revised.Questions;

public class LinearSearch {
    public static void main(String[] args) {
        boolean found = false;
        int[] arr = {1,4,12,4,5,12,412,4,11};
        int target = 110;
        for(int i = 0 ; i < arr.length ; i++)
        {
            if(arr[i] == target)
            {
                found = true;
                break;
            }
        }
        if(found) System.out.println("FOunded..........!");
        else System.out.println("Not founded......!");
    }
}
