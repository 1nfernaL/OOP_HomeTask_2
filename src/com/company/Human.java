package com.company;

import java.util.Random;

public abstract class Human {
    boolean gender;
    String name;
    String surname;
    float height;
    float weight;

    public Human() {
    }

    public Human(boolean gender, String name, String surname, float height, float weight) {
        this.gender = gender;
        this.name = name;
        this.surname = surname;
        this.height = height;
        this.weight = weight;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public boolean chance(double value) {
        Random a = new Random();
        int result = a.nextInt((int) (100/value));
        return result<=100;
    }

    public String toString() {
        return "This "+gender+" 's name "+ name +" and surname "+ surname+", is "+height+" tall and weight "+weight + " kilos";
    }

    abstract boolean talk(Human tk);

    abstract boolean company(Human cm);

    public boolean beTogether(Human bt){
        if(this.getClass()==bt.getClass()) {
            return false;
        }
        if (Math.abs(height-bt.height)>height/10) return chance(0.85);
        return chance(0.95);
    }

     public Human relations(Human rl){
         if (isGender()==rl.isGender())return null;
         return (this.getClass()== Female.class) ?((Female)this).born(rl) : ((Female)rl).born(this);
     }
}
