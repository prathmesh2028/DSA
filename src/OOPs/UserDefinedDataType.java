package OOPs;

public class UserDefinedDataType {

    public static class Student{
        String name;
        int rno;
        double cgpa;
        void print(){
            System.out.println(name + " " + rno + " " + cgpa);
        }

    }

    public static void main(String[] args) {
        Student s = new Student();
        s.name = "PRATHMESH BADHE";
        s.rno = 23;
        s.cgpa = 8.5;


        Student s2 = new Student();
        s2.name = "Lavish";
        s2.rno = 33;
        s2.cgpa = 2.2;


        Student s3 = new Student();
        s3.name = "Anagha";
        s3.rno = 33;
        s3.cgpa = 9.37;

//        System.out.println(s.name + " " + s.cgpa + " " + s.rno);
        s.print();
        s2.print();
        s3.print();
    }
}
