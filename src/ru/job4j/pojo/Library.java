package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book[] lib = new Book[4];
        lib[0] = new Book("\"Alphabet\"", 33);
        lib[1] = new Book("\"War and Peace\"", 1500);
        lib[2] = new Book("\"Bible\"", 150);
        lib[3] = new Book("\"Clean code\"", 404);

        System.out.println("First loop:");
        for (int i = 0; i < lib.length; i++) {
            System.out.println(lib[i].getName() + " - " + lib[i].getPages());
        }
        System.out.println();

        Book tmp = lib[0];
        lib[0] = lib[3];
        lib[3] = tmp;

        System.out.println("Second loop:");
        for (int i = 0; i < lib.length; i++) {
            System.out.println(lib[i].getName() + " - " + lib[i].getPages());
        }
        System.out.println();

        System.out.println("Search for \"Clean code\":");
        for (int i = 0; i < lib.length; i++) {
            if (lib[i].getName().equals("\"Clean code\"")) {
                System.out.println(lib[i].getName() + " - " + lib[i].getPages());
            }
        }
    }
}
