package OOPs;

public class Constructor {
    public static class Car{
        String name;
        double price;
        Car(){ // default constructor

        }

        Car(int price , String name){ // parameterized constructor
            this.price = price;
            this.name = name;
        }
        Car( String s , int x){ // parameterized constructor
            price = x;
            name = s;
        }
        void print(){
            System.out.println(name + " " + price);
        }
    }
    public static void main(String[] args) {
        Car c1 = new Car(4, "KIA sonai");
        c1.print();
        Car c2 = new Car( "Lord Alto" , 9);
        c2.print();
    }
}
