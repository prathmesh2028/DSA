package Arrays;

public class PassingArrayToMethods {
    public static void main(String[] args) {
        int[] x = {1,6452,15,346,23};
        change(x);
        System.out.println(x[2]);
    }
    public static void change(int[] x){
        x[2] = 99;
    }
}
