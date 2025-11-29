package java_basics;

public class TSAofCuboid {
    public static void main(String[] args) {
        int l = 23 , b  = 9 , h = 2;
        double area = 2*(l * b + b * h + h * l)  ;
        System.out.println("The total surface area of the cuboid is :" + area);
    }
}
