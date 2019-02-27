package com.zipcodewilmington.assessment2.part1;

public class WuTangConcatenator {
    Integer input;

    public WuTangConcatenator(Integer input) {
        this.input = input;
    }

    public Boolean isWu() {
        return this.input % 3 == 0;
    }

    public Boolean isTang() {
        return this.input % 5 == 0;
    }

    public Boolean isWuTang() {
        return this.input % 15 == 0;
    }
}
