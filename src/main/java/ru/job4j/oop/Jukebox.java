package ru.job4j.oop;

public class Jukebox {
    void music(int position) {
        if (position == 1) {
            System.out.println("Пусть бегут неуклюже");
        } else if (position == 2) {
            System.out.println("Спокойной ночи");
        } else {
            System.out.println("Песня не найдена");
        }
    }

    public static void main(String[] args) {
        Jukebox lullaby = new Jukebox();
        lullaby.music(1);
        lullaby.music(2);
        lullaby.music(0);
    }
}
