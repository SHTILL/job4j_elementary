package ru.job4j.oop.profession;

public class Engineer extends Profession {
    private int iq;

    public Engineer() {
        this.iq = 120;
    }

    public int getIq() {
        return this.iq;
    }
}
