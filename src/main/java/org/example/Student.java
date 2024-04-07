package org.example;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private int student_id;
    private String student_name;
    private List <Double> grades;


    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    public String getStudent_name() {
        return student_name;
    }

    public List<Double> getGrades() {
        return grades;
    }

    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }

   public void addGrade(double grade){
        if(grades==null){
            grades=new ArrayList<>();
        }
        grades.add(grade);

   }

    public static void main(String[] args) {
        Student student= new Student();
        student.setStudent_id(1);
        student.setStudent_name("zahra");
        student.addGrade(18.5);
        student.addGrade(20);
        student.addGrade(45);

        int id= student.getStudent_id();
        String name= student.getStudent_name();
        List<Double> grades= student.getGrades();


        System.out.println(id);
        System.out.println(name);
        System.out.println(grades);
    }
}
