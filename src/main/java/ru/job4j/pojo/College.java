package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setNameSurname("Aleksey Novoselov");
        student.setGroup("MMF");
        student.setAdmissionDate("2001-09-01");
        student.setCreated(new Date());

        System.out.println(student.getNameSurname() + " entered university in " + student.getAdmissionDate() + " , name's group " + student.getGroup());
    }
}
