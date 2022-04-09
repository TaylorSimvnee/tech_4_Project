package oop_principles.class_objects;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class StudentTest {
    public static void main(String[] args) {



        //Create student object with below information:
        // and print

        Student student1 = new Student();

        student1.firstName = "John";
        student1.lastName = "Doe";
        student1.age = 45;
        student1.dateOfBirth = "01/01/1977";
        student1.gender = "Male";
        student1.address = "CChicago";
        student1.weight = 170;
        student1.height = 5.7;
        student1.email = "johnDoe@gmail.com";
        student1.id = 10001;

        System.out.println(student1);


        Student student2 = new Student();

        student2.firstName = "Lionel";
        student2.lastName = "Messi";
        student2.age = 34;
        student2.dateOfBirth = "01/01/1988";
        student2.gender = "Male";
        student2.address = "Paris";
        student2.weight = 150;
        student2.height = 4.9;
        student2.email = "lionel@gmail.com";
        student2.id = 10002;

        System.out.println(student2);

        Student student3 = new Student();
        student3.firstName = "Alex";
        student3.lastName = "Morgan";
        student3.age = 20;
        student3.dateOfBirth = "01/01/2002";
        student3.gender= "male";
        student3.address = "Chicago";
        student3.weight = 165;
        student3. height = 5.5;
        student3.email = "alex@gmail.com";
        student3.id = 1003;
        System.out.println(student3);

        Student student4 = new Student();
        student4.firstName = "Jessie";
        student4.lastName = "Smith";
        student4.age = 15;
        student4.dateOfBirth = "01/01/2007";
        student4.gender= "female";
        student4.address = "Miami";
        student4.weight = 160;
        student4. height = 5.7;
        student4.email = "jessie@gmail.com";
        student4.id = 1004;
        System.out.println(student4);

        Student student5 = new Student();
        student5.firstName = "Kaly";
        student5.lastName = "Ngo";
        student5.age = 16;
        student5.dateOfBirth = "01/01/2006";
        student5.gender= "female";
        student5.address = "Berlin";
        student5.weight = 150;
        student5. height = 5.3;
        student5.email = "kaly@gmail.com";
        student5.id = 1005;
        System.out.println(student5);

        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);

          /*
        TASK-1
        Count how many students are from Chicago

        EXPECTED:
        2
         */

        /*
        TASK-2
        Count how many student are male and female

        EXPECTED:
        male = 3
        female = 2
         */

        /*
        TASK-3
        Count how many student are teenager

        EXPECTED:
        2
         */


        int count = 0;
        for (Student student : students) {
            if(student.address.equals("Chicago")) count++;
        }
        System.out.println(count);

        int countMale = 0;
        int countFemale = 0;
        for (Student student : students) {
            if(student.gender.equals("Male")) countMale++;
           else countFemale++;
        }
        System.out.println("male = " + countMale);
        System.out.println("female = " + countFemale);

        int countTeen = 0;
        for (Student student : students) {
            if(student.age > 12 && student.age < 20) countTeen++;
        }
        System.out.println(countTeen);

        /*
        TASK-4
        Print all information of each student in separate lines
         */

        System.out.println("\n-------TASK-4----------\n");

        students.forEach(student -> {
            System.out.println(student.firstName);
            System.out.println(student.lastName);
            System.out.println(student.age);
            System.out.println(student.dateOfBirth);
            System.out.println(student.gender);
            System.out.println(student.address);
            System.out.println(student.weight);
            System.out.println(student.height);
            System.out.println(student.email);
            System.out.println(student.id);
            System.out.println();
        });






    }
}
