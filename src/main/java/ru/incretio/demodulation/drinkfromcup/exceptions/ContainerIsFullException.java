package ru.incretio.demodulation.drinkfromcup.exceptions;

public class ContainerIsFullException extends Throwable {
    public ContainerIsFullException(int valueContainsLeft, int tryToPourValue) {
        super(String.format("Ёмкость переполнена!%nОсталось места %d, а вы пытаетесь налить ещё %d!",
                valueContainsLeft, tryToPourValue));
    }
}
