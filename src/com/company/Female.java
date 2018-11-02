package com.company;

import java.util.Random;
import java.util.Scanner;

public class Female extends Human {
    public Female(boolean gender, String name, String surname, float height, float weight) {
        super(gender, name, surname, height, weight);
    }


    public Female() {
    }

    public Human born(Human father) {
        boolean isMale = chance(0.5);
        if (isMale) {
            System.out.print("Рождён мальчик, введите имя: ");
        } else {
            System.out.print("Рождена девочка, введите имя: ");
        }
        Scanner scanner = new Scanner(System.in);
        String name=scanner.nextLine();
        String surname=father.surname;
        float heightNew = isMale?father.height+0.1f*(height-father.height):height+0.1f*(father.height-height);
        float weightNew = isMale?father.weight+0.1f*(weight-father.weight):weight+0.1f*(father.weight-weight);
        return isMale ? new Male(isMale, name, surname, heightNew, weightNew): new Female(isMale, name, surname, heightNew, weightNew);
    }

    @Override
    public String toString() {
        return "This woman's name "+ name +" and surname "+ surname+", is "+height+" tall and weight "+weight + " kilos";
    }

    @Override
    public boolean talk(Human tk) {
        return true;
    }

    @Override
    public boolean company(Human cm) {
        if (cm.getClass()== Female.class) return chance(0.05);
        return chance(0.7);
    }

}
