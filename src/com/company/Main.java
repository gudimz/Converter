package com.company;

import java.sql.SQLOutput;
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
        while(true) {
            System.out.println(ANSI_GREEN + "Выберите команду:\n" + ANSI_RESET +
                    "1) Конвертации числа из 10-ричной системы счисления в 16-ричную.\n" +
                    "2) Конвертации числа из 10-ричной системы счисления в 2-ичную.\n" +
                    "3) Конвертации числа из 2-ичной системы счисления в 10-ричную.\n" +
                    "4) Завершить работу");

            System.out.print(ANSI_YELLOW+ "Ввод: " + ANSI_RESET);
            int num = in.nextInt();
            if (num == 1) {
                System.out.println("10 в 16");
            } else if (num == 2) {
                System.out.println("10 в 2");
            } else if (num == 3) {
                System.out.println("2 в 10");
            } else if (num == 4) {
                System.out.println(ANSI_GREEN + "До новых встреч!" + ANSI_RESET);
                in.close();
                break;
            } else {
                System.out.println(ANSI_RED + "Вы ввели некорректный номер, попробуйте снова." + ANSI_RESET);
            }
        }
    }
}
