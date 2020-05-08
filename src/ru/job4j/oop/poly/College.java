package ru.job4j.oop.poly;

public class College {
    public static void main(String[] args) {
        Student fm = new Freshman();
        Object obj = fm;
        System.out.println("Up casting");
    }
}
