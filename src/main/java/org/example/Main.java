package org.example;

import model.Student;

public class Main {
    public static void main(String[] args) {
        Student me = new Student();
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
        System.out.println(hanna);
    }
}