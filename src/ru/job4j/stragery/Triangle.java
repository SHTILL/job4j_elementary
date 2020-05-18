package ru.job4j.stragery;

import java.util.StringJoiner;

public class Triangle implements Shape {
    public String draw() {
        StringJoiner pic = new StringJoiner(System.lineSeparator());
        pic.add("   +   ");
        pic.add("  + +  ");
        pic.add(" +   + ");
        pic.add("+++++++");
        return pic.toString();
    }

    public static void main(String[] args) {
        Triangle t = new Triangle();
        System.out.println(t.draw());
    }
}
