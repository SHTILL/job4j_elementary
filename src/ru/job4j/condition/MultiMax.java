package ru.job4j.condition;

public class MultiMax {
    public int max(int first, int second, int third) {
        int result = (first > second && first > third) ? first : (second > third ? second : third);
        return result;
    }
}