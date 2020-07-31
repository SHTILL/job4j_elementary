package ru.job4j.oop;

public class Battery {
    private int load;

    public Battery(int load) {
        this.load = load;
    }

    void exchange(Battery another) {
        another.load += this.load;
        this.load = 0;
    }

    public static void main(String[] args) {
        Battery src  = new Battery(10);
        Battery dest = new Battery(2);

        System.out.println("Source:" + src.load + " Dest:" + dest.load);
        src.exchange(dest);
        System.out.println("Source:" + src.load + " Dest:" + dest.load);
    }
}
