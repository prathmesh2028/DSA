package TwoDArrayList;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public static void main(String[] args) {
        List<List<Integer>> list = new ArrayList<>();
        int n = 3;
//        for(int i = 0 ; i < n ; i++){
//            list.add(new ArrayList<>());
//            for(int j = 0 ; j <= i ; j++){
//                if(j == 0 || j == i){
//                    list.get(i).add(1);
//                }
//                else{
//                    int val = list.get(i-1).get(j) + list.get(i-1).get(j-1);
//                    list.get(i).add(val);
//                }
//            }
//        }
        List <List<Integer>> l = new ArrayList<>();
        for(int i = 0 ; i < n ; i++){
            l.add(new ArrayList<>());
            for(int j = 0 ; j <= i ; j++){
                if(j == 0 || j == i){
                    l.get(i).add(1);
                }
                else{
                    int val = (l.get(i-1).get(j)) + (l.get(i-1).get(j-1));
                    l.get(i).add(val);
                }
            }
        }
        System.out.println(l.get(n-1));
        System.out.println();
        for(List<Integer> a:l){
            for(int ele:a){
                System.out.print(ele + " ");
            }
            System.out.println();
        }
    }
}
