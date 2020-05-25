package ru.job4j.ex;

public class ElementNotFoundException extends Exception {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int rsl = -1;
        for (int i = 0; i < value.length; i++) {
            String el = value[i];
            if (el.equals(key)) {
                return i;
            }
        }
        throw new ElementNotFoundException("Element not found");
    }

    public ElementNotFoundException(String message) {
        super(message);
    }

    public static void main(String[] args) {
        int i = -1;
        String[] v = {"une", "do", "tre"};
        try {
            i = indexOf(v, "une");
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("\"une\" index is " + i);

        try {
            i = indexOf(v, "one");
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
}
