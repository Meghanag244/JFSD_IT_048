import java.util.*;

class Student {
    String name;
    int age;
    int roll_no;

    Student(String name, int age, int roll_no) {
        this.name = name;
        this.age = age;
        this.roll_no = roll_no;
    }
}
public class ClassStudent {


    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        Student s1=new Student(sc.nextLine(), sc.nextInt(),sc.nextInt());
        Student s2=new  Student("Doe", 23, 2);
        System.out.println("Student details");

        System.out.println("Student 1: "+s1.name+" "+s1.age+" "+s1.roll_no+"\nStudent 2: "+s2.name+" "+s2.age+" "+s2.roll_no);
    }
   

    }
