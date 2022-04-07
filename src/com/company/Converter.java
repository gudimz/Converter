package com.company;

public class Converter {
    private int number;

    public Converter(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void runDecToHex() {
        System.out.println("10 в 16");
    }

    public void runDecToBin() {
        System.out.println("10 в 2");
    }

    public void runBinToDec() {
        System.out.println("2 в 10");
    }
}
