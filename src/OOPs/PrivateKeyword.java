package OOPs;

    class Student{
        String name; // null
        private int rno; // 0
        double cgpa; // 0.0
        public void print(){ // getter
            System.out.println(name + " " + cgpa + " " +rno);
        }


        // getters and setters
        public void getRollNumber(){
            System.out.println(rno);
        }
        public void setRollNumber(int n){
            rno = n;
        }

//
//        public void p(){
//            print();
//        }
    }
public class PrivateKeyword {
    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println(s1.cgpa);
        System.out.println(s1.name);
        s1.cgpa = 8.9;
        s1.name = "PRATHMESH";



//        s1.p();
//        s1.rno = 79; // it has private access
    }
}
