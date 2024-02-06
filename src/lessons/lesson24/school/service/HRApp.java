package lessons.lesson24.school.service;

import lessons.lesson24.school.Group;
import lessons.lesson24.school.Student;

import java.util.Arrays;

public class HRApp {
    public static void main(String[] args) {

        Group group1 = new Group(1);
        Group group2 = new Group(2);
        Group[] school ={group1,group2};

        Student student1 = new Student("Alex", "+123456");
        Student student2 = new Student("Oleg", "+123456");
        Student student3 = new Student("Sergei", "+123456");
        Student student4 = new Student("Andrei", "+123456");

        group1.addStudent(student1);
        group2.addStudent(student2);
        group1.addStudent(student3);
        group2.addStudent(student4);

    }
}
