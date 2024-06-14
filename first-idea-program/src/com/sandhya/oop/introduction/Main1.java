package com.sandhya.oop.introduction;
import java.util.*;

public class Main1 {
    public static void main(String[] args) {
        //Student sandhya; //creating reference variable of Student
        //sandhya = new Student(); we have created the object and assigned it to the reference of the student class

        Student sandhya = new Student(13,"Sandhya Kapa",88.9); // creating an object, object is the right hand side, reference is the left hand side
        Student rahul = new Student();
        Student sudha = new Student("Sudha",91.9);
        //sandhya.rollno= 12;
        //sandhya.name = "Sandhya Kapa";
        //sandhya.marks = 89.9;

        System.out.println(sandhya);
        System.out.println(sandhya.rollno);
        System.out.println(sandhya.name);
        System.out.println(sandhya.marks);

        // create another object and the constructor takes the values(input) from another object
        Student random = new Student(sandhya);
        System.out.println("Random: "+random.name);
    }
}
class Student{
    int rollno;
    String name;
    double marks;

    void changeName(String newname){
        this.name = name;
        System.out.println(name);
    }

    //Constructor

    // random object's constructor called it took the sandhya object as a parameter
    public Student(Student other) {
        this.name = other.name;
        this.marks = other.marks;
        this.rollno = other.rollno;
    }

    // when you call constructor with 0 parameters that will call this 0 parameterized constructor,
    public Student() {
        this.rollno = 15;
        this.name="Sandhya Kapa";
        this.marks= 83.6;

    }

    // when you call constructor with 3 parameters that will call this constructor,this is called construct overloading
    // Student aakash = new Student(22, "Aaakash", 81.2);
    //here, this will be replased with Aakash
    Student(int rollno, String name, double marks){
        this.rollno=rollno;
        this.name = name;
        this.marks= marks;

    }

    // when you call constructor with 2 parameters that will call this 2 parameterized constructor, this is called construct overloading
    Student(String name, double marks){
        this.name = name;
        this.marks= marks;
    }
}
