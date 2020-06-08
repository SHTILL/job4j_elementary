package ru.job4j.sort;

import java.util.Arrays;

public class Machine {
    private final int[] coins = {10, 5, 2, 1};

    public int[] change(int money, int price) {
        if (money < price) {
            return null;
        }
        int[] rsl = new int[100];
        int size = 0;
        money -= price;
        for (int value: coins) {
            while (money >= value) {
                rsl[size] = value;
                money -= value;
                size++;
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}
