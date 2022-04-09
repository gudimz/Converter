package com.company;

import java.util.Scanner;

public class Menu {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";

    private Scanner in;
    private int command;
    private long number;

    public Menu() {
        this.in = new Scanner(System.in);
        this.command = 0;
        this.number = 0;
    }

    public void launch() {
        printCommand();
        if (in.hasNextInt()) {
            command = in.nextInt();
            if (command > 0 && command < 4) {
                System.out.print(ANSI_GREEN + "\nВвведите число:\n" + ANSI_RESET +
                        ANSI_YELLOW + "Ввод числа: " + ANSI_RESET);
                if (in.hasNextLong()) {
                    number = in.nextLong();
                } else {
                    command = 0;
                }
            }
        } else {
            in.nextLine();
        }
    }

    public Scanner getIn() {
        return in;
    }

    public void setIn(Scanner in) {
        this.in = in;
    }

    public int getCommand() {
        return command;
    }

    public void setCommand(int command) {
        this.command = command;
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    private static void printCommand() {
        System.out.println(ANSI_GREEN + "\nВыберите команду:\n" + ANSI_RESET +
                ANSI_GREEN + "1" + ANSI_RESET + ") Конвертации числа из " + ANSI_YELLOW + "10" + ANSI_RESET +
                "-ричной системы счисления в " + ANSI_YELLOW + "16" + ANSI_RESET + "-ричную.\n" +
                ANSI_GREEN + "2" + ANSI_RESET + ") Конвертации числа из " + ANSI_YELLOW + "10" + ANSI_RESET +
                "-ричной системы счисления в " + ANSI_YELLOW + "2" + ANSI_RESET + "-ичную.\n" +
                ANSI_GREEN + "3" + ANSI_RESET + ") Конвертации числа из " + ANSI_YELLOW + "2" + ANSI_RESET +
                "-ичной системы счисления в " + ANSI_YELLOW + "10" + ANSI_RESET + "-ричную.\n" +
                ANSI_GREEN + "4" + ANSI_RESET + ") Завершить работу");

        System.out.print(ANSI_YELLOW + "\nВвод команды: " + ANSI_RESET);
    }
}