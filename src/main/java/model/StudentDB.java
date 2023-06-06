package model;

import java.util.Arrays;

public class StudentDB {
    Students[] studentsArray;

    public void remove (){
        int length=studentsArray.length;
        Students[] tempArray=new Students[length-1];
        for (int i=0; i<length-1; i++){
            tempArray[i]=studentsArray[i];
        }
        studentsArray=tempArray;
    }
    public void remove (int id){
        int length=studentsArray.length;
        Students[] tempArray=new Students[length-1];
        for (int i=0; i<length; i++){
            if (studentsArray[i].getId()==id) {
                i++;
            }
                tempArray[i]=studentsArray[i];

        }
        studentsArray=tempArray;
    }
    public void add (Students student){
        int length=studentsArray.length;
        Students[] tempArray=new Students[length+1];
        for (int i=0; i<length; i++){
            tempArray[i]=studentsArray[i];
        }
        tempArray[length]=student;
        studentsArray=tempArray;
    }

    public Students[] getAllStudents(){
        return studentsArray;
    }
    public Students randomStudent(){
        int total=studentsArray.length;
        int i=(int)(Math.random()*total);
        return studentsArray[i];
    }
    @Override
    public String toString() {
        return "StudentDB{" +
                "studentsArray=" + Arrays.toString(studentsArray) +
                '}';
    }

    public StudentDB(Students[] studentsArray) {
        this.studentsArray = studentsArray;
    }
}
