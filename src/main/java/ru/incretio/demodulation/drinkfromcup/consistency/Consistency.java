package ru.incretio.demodulation.drinkfromcup.consistency;

public abstract class Consistency {
    private final String name;
    private int volume;

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    public Consistency(String name, int volume) {
        this.name = name;
        this.volume = volume;
    }
}
