package OOP5;

import java.util.Scanner;

public class View {
    Scanner input = new Scanner(System.in);

    public Double getValue(String msg) {
        System.out.print("Введите значение " + msg);
        return input.nextDouble();
    }

    public int getChoice() {
        System.out.println("Выберите операцию:");
        System.out.println("1 - Сложение");
        System.out.println("2 - Вычитание");
        System.out.println("3 - Умножение");
        System.out.println("4 - Деление");
        return input.nextInt();
    }

}