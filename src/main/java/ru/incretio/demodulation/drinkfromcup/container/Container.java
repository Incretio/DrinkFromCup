package ru.incretio.demodulation.drinkfromcup.container;

import ru.incretio.demodulation.drinkfromcup.consistency.Consistency;
import ru.incretio.demodulation.drinkfromcup.exceptions.ContainerIsFullException;
import ru.incretio.demodulation.drinkfromcup.exceptions.NothingToDrinkException;

public abstract class Container implements Drinkable, Pourable, Stirable {
    private final String name;
    protected final int volume;
    protected int volumeContains;

    protected Container(String name, int volume) {
        this.name = name;
        this.volume = volume;
    }

    protected boolean hasToDrink(int volume) {
        int newVolume = this.volumeContains - volume;
        if (newVolume < 0) {
            return false;
        }
        return true;
    }

    protected boolean hasPlaceInVolume(Consistency consistency) {
        int newVolume = volumeContains + consistency.getVolume();
        if (newVolume > volume) {
            return false;
        }
        return true;
    }

    @Override
    public void toPour(Consistency consistency) throws ContainerIsFullException {
        System.out.printf(
                String.format("В '%s' налили %d '%s'.%n",
                        name, consistency.getVolume(), consistency.getName()));
    }

    @Override
    public void toDrink(int volume) throws NothingToDrinkException {
        System.out.printf(
                String.format("Из '%s' выпили %d.%n",
                        name, volume));
    }
}
