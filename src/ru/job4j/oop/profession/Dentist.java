package ru.job4j.oop.profession;

public class Dentist extends Doctor {
    private int patientNumber;

    public Dentist() {
        this.patientNumber = 0;
    }

    public int getPatientNumber() {
        return this.patientNumber;
    }
}
