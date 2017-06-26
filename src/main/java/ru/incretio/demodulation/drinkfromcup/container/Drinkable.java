package ru.incretio.demodulation.drinkfromcup.container;

import ru.incretio.demodulation.drinkfromcup.exceptions.NothingToDrinkException;

public interface Drinkable {
    void toDrink(int volume) throws NothingToDrinkException;
}
