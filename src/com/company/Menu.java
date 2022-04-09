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
                "1) Конвертации числа из 10-ричной системы счисления в 16-ричную.\n" +
                "2) Конвертации числа из 10-ричной системы счисления в 2-ичную.\n" +
                "3) Конвертации числа из 2-ичной системы счисления в 10-ричную.\n" +
                "4) Завершить работу");

        System.out.print(ANSI_YELLOW + "\nВвод команды: " + ANSI_RESET);
    }
}