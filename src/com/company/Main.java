package com.company;

import java.util.Scanner;//Подключаем класс Scanner для ввода с консоли

public class Main {

    public static void main(String[] args) {

        System.out.println("Выберите действие, которое необходимо выполнить, и нажмите:\n\n \"1\" - если хотите запустить" +
                " калькулятор\n\n \"2\" - если хотите запустить поиск максимального слова в массиве\nПосле выбора нажмите" +
                " Enter\n");

        Scanner in = new Scanner(System.in);

        int chooseVariable = Integer.parseInt(in.next());

        if(chooseVariable == 1)
            Calculator.calculate();

        else if(chooseVariable == 2)
            MaxArray.searchLargeWordInArray();

        else
            System.out.println("Команда неверна");
    }
}
