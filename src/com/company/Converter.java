package com.company;

public class Converter {
    private long number;

    public Converter(long  number) {
        this.number = number;
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void convDecToHex() {
        System.out.println("\nКонвертации числа " + number + " из 10-ричной системы счисления в 16-ричную:");
        System.out.println(number + " => " + Long.toHexString(number).toUpperCase());
    }

    public void convDecToBin() {
        System.out.println("\nКонвертации числа " + number + " из 10-ричной системы счисления в 2-ичную:");
        System.out.println(number + " => " + Long.toBinaryString(number));
    }

    public void convBinToDec() {
        System.out.println("\nКонвертации числа " + number + " из 2-ичной системы счисления в 10-ричную:");
        try {
            System.out.println(number + " => " + Integer.parseInt(Long.toString(number), 2));
        } catch (NumberFormatException e) {
            System.out.println("Некорректный формат ввода числа в 2-ичной системе. Возврат в главное меню.");
        }
    }
}
