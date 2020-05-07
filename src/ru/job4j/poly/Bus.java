package ru.job4j.poly;

public class Bus implements Transport {
    private int passengers;
    private double liters;
    private double fuelCost;

    public Bus(int passengers, double liters, double fuelCost) {
        this.passengers = passengers;
        this.liters = liters;
        this.fuelCost = fuelCost;
    }

    @Override
    public void go() {
        System.out.println("Lets go!!!");
    }

    @Override
    public void passengers(int p) {
        System.out.println("Number of passengers is" + p);
        this.passengers = p;
    }

    @Override
    public double fuel(double liters) {
        System.out.println("Fuel " + liters + "liters");
        this.liters = liters;
        return this.fuelCost;
    }
}
