package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];

        String[] names = new String[4];
        names[0] = "Albert Einstein";
        names[1] = "Elon Musk";
        names[2] = "Nicolaus Copernicus";
        names[3] = "Nikola Tesla";

        for (int i = 0; i < 4; i++) {
            System.out.println(names[i]);
        }
    }
}
