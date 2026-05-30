package Lecture22OOPS;

public class Student_Client {
    public static void main(String[] args) {
        System.out.println("hey");
        Student s = new Student();//instance = object
//        s is refrence variable new Example is object
        s.age = 19;
        s.name = "Kaju";
        Student s1 = new Student();
        s1.age = 29;
        s1.name = "Raju";
        s.Into_Yourself();
        s1.Into_Yourself();
//        copy the code from github incomplete files
     }
}
