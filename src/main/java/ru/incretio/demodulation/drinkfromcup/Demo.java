package ru.incretio.demodulation.drinkfromcup;

import ru.incretio.demodulation.drinkfromcup.consistency.HotWater;
import ru.incretio.demodulation.drinkfromcup.consistency.Sugar;
import ru.incretio.demodulation.drinkfromcup.consistency.ColdWater;
import ru.incretio.demodulation.drinkfromcup.container.Container;
import ru.incretio.demodulation.drinkfromcup.container.Cup;
import ru.incretio.demodulation.drinkfromcup.exceptions.ContainerIsFullException;
import ru.incretio.demodulation.drinkfromcup.exceptions.NothingToDrinkException;

import java.util.Random;

public class Demo {
    public static void main(String[] args) {
        Container cup = new Cup(350);
        Sugar sugar = new Sugar(10);
        HotWater hotWater = new HotWater(250);
        ColdWater coldWater = new ColdWater(50);

        try {
            cup.toPour(hotWater);
            cup.toPour(sugar);
            cup.toStir();
            cup.toPour(coldWater);

            drinkAll(cup);
        } catch (ContainerIsFullException | NothingToDrinkException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void drinkAll(Container container) throws NothingToDrinkException {
        while (true) {
            int volumeToDrink = new Random().nextInt(50) + 20;
            container.toDrink(volumeToDrink);
        }
    }
}
