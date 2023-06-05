package model;

public class Student {
    private String name;
    private int birthYear;

    public Student(){

    }
    public Student(String name, int birthYear, boolean enrolled) {
        this.name = name;
        this.birthYear = birthYear;
        this.enrolled = enrolled;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", birthYear=" + birthYear +
                ", enrolled=" + enrolled +
                '}';
    }

    private boolean enrolled;

    public void setName(String settingName) {
        this.name = settingName;
    }

    public String getName() {
        return this.name;
    }

    public void setBirthYear(int settingBirthYear) {
        this.birthYear = settingBirthYear;
    }

    public int getBirthYear() {
        return this.birthYear;
    }

    public void setEnrolled(boolean settingEnrolled) {
        this.enrolled = settingEnrolled;
    }

    public boolean getEnrolled() {
        return this.enrolled;
    }

}
