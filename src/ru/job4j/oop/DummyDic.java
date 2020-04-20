package ru.job4j.oop;

public class DummyDic {
    public String engToRus(String eng) {
        String response = "Неизвестное слово: " + eng;
        return response;
    }

    public static void main(String[] args) {
        DummyDic translator = new DummyDic();
        System.out.println(translator.engToRus("cat"));
        System.out.println(translator.engToRus("dog"));
    }
}
