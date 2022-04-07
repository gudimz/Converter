package com.company;

import java.util.Scanner;

public class Main {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            printCommand();
            int command = 0;
            int number = 0;
            if (checkInput(in)) {
                command = in.nextInt();
                if (command != 4) {
                    System.out.print(ANSI_GREEN + "Ввведите число:\n" + ANSI_RESET +
                            ANSI_YELLOW + "Ввод числа: " + ANSI_RESET);
                    if (checkInput(in)) {
                        number = in.nextInt();
                    } else {
                        command = 0;
                    }
                }
            }
            Converter converter = new Converter(number);
            switch (command) {
                case 1 -> converter.runDecToHex();
                case 2 -> converter.runDecToBin();
                case 3 -> converter.runBinToDec();
                case 4 -> {
                    System.out.println(ANSI_GREEN + "До новых встреч!" + ANSI_RESET);
                    in.close();
                    flag = false;
                }
                default -> System.out.println(ANSI_RED + "Некорректный ввод, попробуйте снова." + ANSI_RESET);
            }
        }
    }

    public static boolean checkInput(Scanner in) {
        if (in.hasNextInt()) {
            return true;
        } else {
            in.nextLine();
        }
        return false;
    }

    public static void printCommand() {
        System.out.println(ANSI_GREEN + "Выберите команду:\n" + ANSI_RESET +
                "1) Конвертации числа из 10-ричной системы счисления в 16-ричную.\n" +
                "2) Конвертации числа из 10-ричной системы счисления в 2-ичную.\n" +
                "3) Конвертации числа из 2-ичной системы счисления в 10-ричную.\n" +
                "4) Завершить работу");

        System.out.print(ANSI_YELLOW+ "Ввод команды: " + ANSI_RESET);
    }
}
