package ru.job4j.oop.profession;

public class Surgeon extends Doctor {
    private long killed;
    private byte healed;

    public boolean patientIsDead(Patient p) {
        return true;
    }
}
