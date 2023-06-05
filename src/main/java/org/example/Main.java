package org.example;
class Student{
    private String name;
    private int birthYear;
    private boolean enrolled;
    public void setName(String settingName){
        this.name=settingName;
    }
    public String getName(){
        return this.name;
    }
    public void setBirthYear(int settingBirthYear){
        this.birthYear=settingBirthYear;
    }
    public int getBirthYear(){
        return this.birthYear;
    }
    public void setEnrolled(boolean settingEnrolled){
        this.enrolled=settingEnrolled;
    }
    public boolean getEnrolled(){
        return this.enrolled;
    }

}
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
        String s1="Saman";
        String s2="Khaladj-Nia";
        String result="";
        char space=' ';
        int n=3;
        result=s1+space+s2+space+n;
        System.out.println(result);
    }
}