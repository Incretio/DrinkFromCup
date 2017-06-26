package ru.incretio.demodulation.drinkfromcup.exceptions;

public class NothingToDrinkException extends Throwable {
    public NothingToDrinkException(int actualValueContains, int tryToDrinkValue) {
        super(String.format("А пить то больше и нечего!%nЁмкость содержит %s, а вы пытаетесь выпить %s!",
                actualValueContains, tryToDrinkValue));
    }
}
