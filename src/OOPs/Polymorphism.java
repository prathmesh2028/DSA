package OOPs;

public class Polymorphism {
    public static class Dog{
        void seapk(){
            System.out.println("bhau bhau");
        }
    }
    public static class Cat{
        void seapk(){
            System.out.println("meu meu");
        }
    }
    public static class Lion{
        void seapk(){
            System.out.println("gerrrr grrrr");
        }
    }
    public static class Human{
        void seapk(){
            System.out.println("Hello");
        }
    }
    public static void main(String[] args) {
        Human h = new Human();
        Cat c = new Cat();
        Lion l = new Lion();
        Dog d = new Dog();

        h.seapk();
        c.seapk();
        l.seapk();
        d.seapk();
    }
}
