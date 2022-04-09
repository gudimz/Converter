package com.company;

public class Main {
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
                    System.out.println("\nДо новых встреч!");
                    menu.getIn().close();
                    flag = false;
                }
                default -> System.out.println("Некорректный ввод, возврат в главное меню.");
            }
        }
    }
}
