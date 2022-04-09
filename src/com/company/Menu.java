package com.company;

import java.util.Scanner;

public class Menu {
    private Scanner in;
    private int command;
    private long number;

    public Menu() {
        this.in = new Scanner(System.in);
        this.command = 0;
        this.number = 0;
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
        System.out.println("""
                
                Выберите команду:
                1) Конвертации числа из 10-ричной системы счисления в 16-ричную.
                2) Конвертации числа из 10-ричной системы счисления в 2-ичную.
                3) Конвертации числа из 2-ичной системы счисления в 10-ричную.
                4) Завершить работу""");

        System.out.print("\nВвод команды: ");
    }

    public void launch() {
        printCommand();
        if (in.hasNextInt()) {
            command = in.nextInt();
            if (command > 0 && command < 4) {
                System.out.print("\nВвведите число:\nВвод числа: ");
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
}