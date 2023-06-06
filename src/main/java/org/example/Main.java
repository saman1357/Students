package org.example;

import model.Student;
import model.StudentDB;
import model.Students;

public class Main {
    public static void main(String[] args) {
    //Students s1 = new Students("Saman", 123)
            Students[] studenten = new Students[2];
            studenten[0]=new Students ("Saman", 123);
            studenten[1]=new Students("Hanna", 321);
        StudentDB studentenDB =new StudentDB(studenten);
        System.out.println("toString: "+studentenDB);
        System.out.println("getAll: "+studentenDB.getAllStudents()[0]);
        System.out.println("random Student: "+studentenDB.randomStudent().toString());
        Students neuerStudent = new Students("Andreas", 111);
        studentenDB.add(neuerStudent);
        System.out.println("toString: "+studentenDB);
        studentenDB.remove();
        System.out.println("toString: "+studentenDB);

    //s1.name="Saman";
    //s1.id=123;

        /*    Student me = new Student();
        me.setName("Saman");
        me.setBirthYear(1978);
        me.setEnrolled(true);
        System.out.println("Hello "+me.getName());
        System.out.println("Year of Birth:  "+me.getBirthYear());
        if (me.getEnrolled()) {
            System.out.println("enrolled");
        } else {
            System.out.println("not enrolled");
        }
        System.out.println(me);
        Student hanna=new Student("Hanna", 2014, false);
        System.out.println(hanna);     */

    }
}