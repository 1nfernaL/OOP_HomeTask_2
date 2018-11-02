package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Human[] humans = new Human[2];
        for (int i =0;i <2;i++) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Insert gender M/F:");
            String genderStr=scan.nextLine();
            if (genderStr.isEmpty()) {
                System.out.println("You didn't insert gender!");
                continue;
            }
            System.out.print("input name: ");
            String name = scan.nextLine();
            System.out.print("input surname: ");
            String surname=scan.nextLine();
            System.out.print("input height: ");
            float height=scan.nextFloat();
            System.out.print("input weight: ");
            float weight=scan.nextFloat();

            if ("m".equalsIgnoreCase(genderStr)) {

                humans[i] = new Male(true, name,surname,height,weight);
                System.out.println( humans[i].toString());
            }
            else {
                humans[i] = new Female(false, name, surname, height, weight);
                System.out.println( humans[i].toString());
            }
            System.out.println();
        }
        Human first = humans[0];
        Human second = humans[1];
        if (first.talk(second)!=true) {
            System.out.println("Разговор не заладился.");
            return;
        }
        System.out.println("Пообщались");
        if (first.company(second)!=true) {
            System.out.println("Но не понравились друг другу");
            return;
        }
        System.out.println("Подружились");

        if (first.beTogether(second)!=true) {
            System.out.println("ничего не вышло... разбежались");
            return;
        }
        System.out.println("Завели отношения");
        System.out.println();
        //так как все методы вернули true, вызывается метод relations
        Human child = first.relations(second);
        if (child==null) return;
        System.out.println(child.toString());
    }
}
