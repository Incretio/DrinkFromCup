package ru.incretio.demodulation.drinkfromcup.container;

import ru.incretio.demodulation.drinkfromcup.consistency.Consistency;
import ru.incretio.demodulation.drinkfromcup.exceptions.ContainerIsFullException;
import ru.incretio.demodulation.drinkfromcup.exceptions.NothingToDrinkException;

public class Cup extends Container {

    public Cup(int volume) {
        super("Кружка", volume);
    }

    @Override
    public void toStir() {

    }

    @Override
    public void toDrink(int volume) throws NothingToDrinkException {
        if (hasToDrink(volume)) {
            super.toDrink(volume);
            this.volumeContains -= volume;
        } else {
            throw new NothingToDrinkException(this.volumeContains, volume);
        }
    }

    @Override
    public void toPour(Consistency consistency) throws ContainerIsFullException {
        if (hasPlaceInVolume(consistency)){
            super.toPour(consistency);
            this.volumeContains += consistency.getVolume();
        } else {
            throw new ContainerIsFullException(this.volume - this.volumeContains, consistency.getVolume());
        }
    }
}
