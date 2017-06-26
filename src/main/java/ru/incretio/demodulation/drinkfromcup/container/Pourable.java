package ru.incretio.demodulation.drinkfromcup.container;

import ru.incretio.demodulation.drinkfromcup.consistency.Consistency;
import ru.incretio.demodulation.drinkfromcup.exceptions.ContainerIsFullException;

public interface Pourable {
    void toPour(Consistency consistency) throws ContainerIsFullException;
}
