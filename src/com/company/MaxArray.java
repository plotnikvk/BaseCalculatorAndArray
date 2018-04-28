package com.company;

import java.util.Scanner;//Подключаем класс Scanner для ввода с консоли

public class MaxArray {
    public static void searchLargeWordInArray(){

        Scanner in = new Scanner(System.in);
        String[] str;//stringArray
        System.out.println("Введите размерность массива. Из какого количества слов он будет состоять?");
        str = new String[Integer.parseInt(in.next())];


        for (int i = 0; i < str.length;i++){
            System.out.println("Введите " +(i+1)+" слово");
            str[i] = in.next();
        }

        int biggestStringIndex = 0;
        for (int i = 1; i < str.length;i++) {
            if (str[biggestStringIndex].length() < str[i].length()){
                biggestStringIndex = i;
            }
        }

        System.out.println("Cамое длинное слово: \t\t\""+str[biggestStringIndex]+"\"");
    }

}
