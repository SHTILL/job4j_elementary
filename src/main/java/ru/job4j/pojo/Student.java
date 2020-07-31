package ru.job4j.pojo;

import java.util.GregorianCalendar;

public class Student {
    private String name;
    private String patronymic;
    private String surname;
    private String group;
    private GregorianCalendar entrance;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public GregorianCalendar getEntrance() {
        return entrance;
    }

    public void setEntrance(GregorianCalendar entrance) {
        this.entrance = entrance;
    }
}
