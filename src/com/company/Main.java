package com.company;

public class Main {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";

    public static void main(String[] args) {
        boolean flag = true;
        while (flag) {
            Menu menu = new Menu();
            menu.launch();
            Converter converter = new Converter(menu.getNumber());
            switch (menu.getCommand()) {
                case 1 -> converter.convDecToHex();
                case 2 -> converter.convDecToBin();
                case 3 -> converter.convBinToDec();
                case 4 -> {
                    System.out.println(ANSI_GREEN + "\nДо новых встреч!" + ANSI_RESET);
                    menu.getIn().close();
                    flag = false;
                }
                default -> System.out.println(ANSI_RED + "Некорректный ввод, возврат в главное меню." + ANSI_RESET);
            }
        }
    }
}
