package OOPs;
class Pokemon{
    int power;
    String type;
    String name;
    Pokemon(String type , int power){ // setter
        this.power = power;
        this.type = type;
    }
    Pokemon(){

    }
}
public class RevisionOOPs {


    public static void main(String[] args) {
        Pokemon p1 = new Pokemon("Electric" , 70);
        System.out.println(p1.type);

    }
}
