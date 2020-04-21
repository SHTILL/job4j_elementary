package ru.job4j.oop;

public class BallFairyTail {
    public static void main(String[] args) {
        Ball mainCharacter = new Ball();
        Hare angryHair = new Hare();
        WolfFromBallFairyTale angryWolf = new WolfFromBallFairyTale();
        Fox angryFox = new Fox();

        mainCharacter.startJourney();
        angryHair.tryEat(mainCharacter);
        angryWolf.tryEat(mainCharacter);
        angryFox.tryEat(mainCharacter);
    }
}
