package com.company;
import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
	// write your code here
        Teacher teacher1 = new Teacher(1,"teacher 1",67000);
        Teacher teacher2 = new Teacher(2,"teacher 2",77000);
        Teacher teacher3 = new Teacher(3,"teacher 3",87000);
        List<Teacher> teacherList= new ArrayList<>();
        teacherList.add(teacher1);
        teacherList.add(teacher2);
        teacherList.add(teacher3);
        Student student1 = new Student(1,"student 1",8);
        Student student2 = new Student(2,"student 2",10);
        Student student3 = new Student(3,"student 3",12);
        List<Student> studentList = new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        School sch = new School(teacherList,studentList);
        student1.payFees(5000);
        student2.payFees(5000);
        System.out.println("sch has earned  "+" "+  sch.getTotalMoneyEarned());
        System.out.println("School pay salaries");
        teacher1.receiveSalary(teacher1.getSalary());
        System.out.println("GHS has spent for salary to "+ " "+teacher1.getName()+ " and now has " +" " +sch.getTotalMoneyEarned());
        System.out.println(student2);
        teacher2.receiveSalary(teacher2.getSalary());
        System.out.println(teacher2);
    }
}
