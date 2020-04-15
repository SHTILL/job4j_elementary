package ru.job4j.array;

public class Turn {
    public static int[] back(int[] array) {
        int swaps = (array.length % 2 == 0) ? array.length / 2 : (array.length - 1) / 2;
        for (int i = 0, j = (array.length - 1); i < swaps; i++, j--) {
            int tmp = array[i];
            array[i] = array[j];
            array[j] = tmp;
        }
        return array;
    }
}
