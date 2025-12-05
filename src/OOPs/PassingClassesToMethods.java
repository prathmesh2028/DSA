package OOPs;

public class PassingClassesToMethods {
    public static class Car{
        int seats;
        String name;
        double length;
        String type;
        void print(){
            System.out.println(seats+" " + name + " " + type + "  " + length + "m");
        }
    }
    public static void main(String[] args) {
        Car c = new Car();
        c.length = 3.99;
        c.name = "Mercedes Benz C class";
        c.type = "SUV";
        c.seats = 4;


        change(c);
        System.out.println(c.seats);

        c.print();

    }
    private static void change(Car x){
        x.seats = 6;
    }
}
