package OOPs;
class Complex{
    int x;
    int y;
    Complex(int x , int y){
        this.x = x;
        this.y = y;
    }
    Complex(){

    }
    void print(){
        if(y > 0)System.out.println(x + " + i" + y);
        else System.out.println(x + " - " + (-y) + "i");
    }
    void add(Complex z){
        this.x += z.x;
        this.y += z.y;
    }
    void sub(Complex z){
        this.x -= z.x;
        this.y -= z.y;
    }
    void multiply(Complex z){
        x = x*z.x - y*z.y;
        y = x*z.y + y*z.x;
    }
}
public class ComplexNumber {
    public static void main(String[] args) {
        Complex z1 = new Complex(2,-5);
        Complex z2 = new Complex(3,4);
        z1.print(); z2.print();
        z1.add(z2);
        z2.multiply(z1);
        z2.print();
    }
}
