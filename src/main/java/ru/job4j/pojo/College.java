package ru.job4j.pojo;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class College {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("Vasya");
        s.setPatronymic("Petrovich");
        s.setSurname("Vodkin");
        s.setGroup("101-A");
        s.setEntrance(new GregorianCalendar(2003, Calendar.SEPTEMBER, 1, 10, 0, 0));

        System.out.println("Name: " + s.getName());
        System.out.println("Patronymic: " + s.getPatronymic());
        System.out.println("Surname: " + s.getSurname());
        System.out.println("Group: " + s.getGroup());
        System.out.println("Entrance Date: " + s.getEntrance().getTime());
    }
}
