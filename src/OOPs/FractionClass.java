package OOPs;
class Fraction{
    int num;
    int den;
    Fraction(int num , int den){
        this.num = num;
        this.den = den;
        simplify();
    }
    void print(){
        System.out.println(num + "/" + den);
    }
    void add(Fraction f){
        this.num = f.den*this.num + f.num;
        this.den *= f.den;
        simplify();
    }
    void multiply(Fraction f){
        this.num *= f.num;
        this.den *= f.den;
        simplify();
    }
    void divide(Fraction f){
        this.num *= f.den;
        this.den *= f.num;
        simplify();
    }
    void simplify(){
        boolean isNegative = (num*den < 0) ? true:false;
        int gcd = hcf(num , den);
        num = num / gcd;
        den = den/gcd;
        if(isNegative) num = -num;
    }
    int hcf(int a , int b){
        if(a == 0) return b;
        return hcf(b%a ,a);
    }
}
public class FractionClass {
    public static void main(String[] args) {
        Fraction f1 = new Fraction(4,7);
        Fraction f2 = new Fraction(7,4);
        f1.add(f2);
        f1.print();
        Fraction f3 = new Fraction(50,100);
        f3.print();
    }
}
