package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    Player chris = new Player("Chris", 10, 15);
        System.out.println(chris.toString());
        saveObject(chris);

        chris.setHitPoints(8);
        System.out.println(chris);
        chris.setWeapon("Stormbringer");
        saveObject(chris);
//        loadObject(chris);
        System.out.println(chris);

        ISaveable werewolf = new Monster("Werewolf", 20, 40);
        System.out.println(werewolf);
        System.out.println("Strength = " + ((Monster) werewolf).getStrength());
        saveObject(werewolf);

    }

    public static ArrayList<String> readValues() {
        ArrayList<String> values = new ArrayList<String>();

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("Choose \n" +
                        "1 to enter a string\n" +
                        "0 to quit");

        while(!quit) {
            System.out.println("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.println("Enter a string: ");
                    String stringInput = scanner.nextLine();
                    values.add(index, stringInput);
                    index++;
                    break;
            }
        }
        return values;
    }

    public static void saveObject(ISaveable objectToSave) {
        for(int i=0; i<objectToSave.write().size(); i++) {
            System.out.println("Saving " + objectToSave.write().get(i) + " to storage device");
        }
    }

    public static void loadObject(ISaveable objectToLoad) {
        List<String> values = readValues();
        objectToLoad.read(values);
    }



}
