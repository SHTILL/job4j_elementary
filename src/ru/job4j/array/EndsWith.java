package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;
        for (int i = (word.length - 1), j = (post.length - 1); j >= 0; j--, i--) {
            if (word[i] != post[j]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
