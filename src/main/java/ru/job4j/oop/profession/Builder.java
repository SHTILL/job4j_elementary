package ru.job4j.oop.profession;

public class Builder extends Engineer {
    private String subcontractor;

    public Builder() {
        this.subcontractor = "Ravshan";
    }

    public String getDoer() {
        return "Me";
    }
}
