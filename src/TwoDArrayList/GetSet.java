package TwoDArrayList;

import java.util.ArrayList;

public class GetSet {
    public static void main(String[] args) {
        // Declaration of 2D arraylist
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();

        ArrayList<Integer> a = new ArrayList<>();
        a.add(1); a.add(95) ; a.add(35);
        ArrayList<Integer> b = new ArrayList<>();
        b.add(2); b.add(55) ; b.add(45); b.add(100); b.add(44);
        ArrayList<Integer> c = new ArrayList<>();
        c.add(3); c.add(66) ; c.add(55);


        arr.add(a) ; arr.add(b) ; arr.add(c);

//        System.out.println(arr);
        // printing it
        for(int i = 0 ; i < arr.size() ; i++){
            for(int j = 0 ; j < arr.get(i).size() ; j++){
                System.out.print(arr.get(i).get(j) + " ");
            }
            System.out.println();
        }

        System.out.println();


        // now here using for each loop

        for(ArrayList<Integer> v:arr){
            for(int ele :v){
                System.out.print(ele + " ");
            }
            System.out.println();
        }
    }
}
