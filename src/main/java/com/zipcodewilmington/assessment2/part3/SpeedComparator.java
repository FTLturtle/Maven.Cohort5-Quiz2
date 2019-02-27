package com.zipcodewilmington.assessment2.part3;

import org.junit.Assert;

import java.util.Arrays;
import java.util.Comparator;

public class SpeedComparator implements Comparator<Animal> {

    public int compare(Animal animal1, Animal animal2) {
        return animal2.getSpeed() - animal1.getSpeed();
    }

    public static void main(String[] args) {
        Animal horse = (Animal) new Horse();
        Animal blueJay = (Animal) new BlueJay();
        Animal redRobin = (Animal) new RedRobin();

        Animal[] animals = {redRobin, horse, blueJay};
        Comparator comparator = (Comparator) new SpeedComparator();
        Arrays.sort(animals, comparator);

        for (Animal a : animals) {
            System.out.println(a.getClass());
        }
    }
}
