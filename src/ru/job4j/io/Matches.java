package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        int matches = 11;
        int take = 0;
        int player = 1;
        Scanner input = new Scanner(System.in);
        while (matches > 0) {
            player = 1 - player;
            System.out.println("На столе " + matches + " спичек(спички)");
            System.out.println("Игрок"   + (player + 1)  + " вытени от 1 до 3 спичек: ");
            try {
                take = Integer.valueOf(input.nextLine());
            } catch (Exception e) {
                System.out.println("Разрешено вводить только цифры!!!");
                continue;
            }
            if (take < 1 || take > 3) {
                System.out.println("Количество вытянутых спичек должно быть от 1 до 3!!!");
                continue;
            }
            matches -= take;
        }
        System.out.println("Игра закончена. Выиграл Игрок" + (player + 1));
    }
}
