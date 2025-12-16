package OOPs;
import java.util.Scanner;
//Q4) b) Design a class 'employee' with suitable instance variables and methods. Create the database of the employees and display the records using an array of objects. [5 marks]
class Employee{
    double salary;
    String name;
    String designation;

    Employee(double salary , String name , String designation){
        this.salary = salary;
        this.name = name;
        this.designation = designation;
    }

    void displayDetails(){
        System.out.println("---Employee Details---");
        System.out.println(this.name + " " + this.salary + " " + this.designation);
    }

    void changeSalary(double newSalary){
        this.salary = newSalary;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        System.out.print("Enter the number of employees you want to enter into the database :");
        n = sc.nextInt();
        Employee[] arrOfEmployees = new Employee[n];
        for(int i = 0 ; i < n ; i++){
            System.out.print("Enter employee name :");
            String name = sc.next();
            System.out.print("Enter employee salary :");
            double salary = sc.nextDouble();
            System.out.print("Enter employee designation :");
            String designation = sc.next();
            arrOfEmployees[i] = new Employee(salary , name ,designation);
        }


        for(int i = 0 ; i < n ; i++){
            arrOfEmployees[i].displayDetails();
        }
    }
}
