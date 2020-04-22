package ru.job4j.oop;

public class Tiger extends Predator {
    public Tiger() {
        super();
        System.out.println("Tiger");
    }

    static public void main(String[] args) {
        Tiger t = new Tiger();
    }
}
