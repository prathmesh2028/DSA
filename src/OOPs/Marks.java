package OOPs;

public class Marks {
    public static class StudentData{
        String name;
        int rno;
        int[] marks;
        StudentData(int s){
            marks = new int[s];
        }
    }
    public static void main(String[] args) {
        StudentData s1 = new StudentData(4);
        StudentData s2 = new StudentData(2);
        s1.marks[0] = 89;
        s1.marks[1] = 95;
        s2.marks[0] = 88;
        s2.marks[1] = 22;
        s2.marks[2] = 77;
    }
}
