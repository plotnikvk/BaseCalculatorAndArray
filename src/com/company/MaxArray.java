package com.company;

import java.util.Scanner;//Подключаем класс Scanner для ввода с консоли

public class MaxArray {
    public static void searchLargeWordInArray(){

        Scanner in = new Scanner(System.in);
        String[] stringArray;//Объявляем массив типа String
        System.out.println("Введите размерность массива. Из какого количества слов он будет состоять?");
        /**
         * Создаем массив из того количества элементов, которое ввведено в консоль
         */
        stringArray = new String[Integer.parseInt(in.next())];//

        /**
         * Присваиваем элементам массива слова введенные в консоль
         */
        for (int i = 0; i < stringArray.length;i++){
            System.out.println("Введите " +(i+1)+" слово\nПосле ввода нажмите Enter");
            stringArray[i] = in.next();
        }

        int biggestStringIndex = 0;//Переменная, в которую мы сохраняем индекс элемента массива с большей длинной
        /**
         * Пробегаемся по массиву строк циклом for и попарно сравниваем свойство length элементов массива, выявляя индекс
         * с наибольшим своиством length
         */
        for (int i = 1; i < stringArray.length;i++) {
            if (stringArray[biggestStringIndex].length() < stringArray[i].length()){
                biggestStringIndex = i;
            }
        }
        System.out.println("Cамое длинное слово: \t\t\""+stringArray[biggestStringIndex]+"\"");
    }

}
