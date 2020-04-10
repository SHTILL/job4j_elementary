package ru.job4j.loop;

public class Factorial {
    public static int calc(int n) {
        if (n==0) {
            return 1;
        }

        int result = 0;
        for (int index=1; index<=n; index++) {
            result = result * index;
        }
        return result;
    }
}
