package com.company;

public class Male extends Human{

    public Male(boolean gender, String name, String surname, float height, float weight) {
        super(gender, name, surname, height, weight);
    }


    public Male() {

    }

    @Override
    public String toString() {
        return "This man's name "+ name +" and surname "+ surname+ ", is "+height+" tall and weight "+weight + " kilos";
    }

    @Override
    public boolean talk(Human tk) {
        if (tk.getClass()== Male.class)
            return chance(0.5);
        return true;
    }

    @Override
    public boolean company(Human cm) {
        if (cm.getClass()== Male.class) return chance(0.056);
        return chance(0.7);
    }


}
