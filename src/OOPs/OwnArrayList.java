package OOPs;
class ArrayList{ // user defined data structure
    int[] arr ;
    int idx = 0;
    int capacity = 10;
    int size = 0;

    ArrayList(int capacity){
        arr = new int [capacity];
    }
    int capacity(){
        return arr.length;
    }
    void set(int index , int val){
        arr[index] = val;
    }
    void add(int ele){
        if(idx == arr.length){ // array is full
            int[] arr2 = new int [arr.length+2];
            for(int i = 0 ; i <arr.length ; i++){
                arr2[i] = arr[i];
            }
            arr = arr2;
        }
        arr[idx++] = ele;
        size++;
    }
    void display(){
        for(int i = 0 ; i < size ; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    int get(int index){
        return arr[index];
    }
}
public class OwnArrayList {
    public static void main(String[] args) {
        ArrayList arr = new ArrayList(8);
        arr.add(10);arr.add(20);
        arr.display();

    }
}
