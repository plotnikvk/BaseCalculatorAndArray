package com.company;

import java.util.Scanner;//Подключаем класс Scanner для ввода с консоли

public class Calculator {
    public static void calculate(){
        double firstNumber;//Переменная, типа double, в которой сохраняется первое число
        String operation;// Переменная типа String, которая сохраняет знак операции
        double secondNumber;// Переменная, типа double, в которой сохраняется второе число

        Scanner in = new Scanner(System.in);

        System.out.println("Введите первое целое число или число c плавающей точкой:\nПосле ввода нажмите Enter ");
        /*
        Первой переменной присваивается значение, введенной с консоли строки, приведенной к типу Float методом
         parseFloat
          */
        firstNumber = Float.parseFloat(in.next());

        System.out.println("Введите второе целое число или число c плавающей точкой:\nПосле ввода нажмите Enter ");
        /*
        Второй переменной присваивается значение, введенной с консоли строки, приведенной к типу Float методом
         parseFloat
         */
        secondNumber = Float.parseFloat(in.next());

        System.out.println("Введите знак операции(Возможны: +, -, *, /, %):\nПосле ввода нажмите Enter ");
        /*
        Переменной operation присваивается знак операции, для последующей передачи в оператор переключения Switch-case
          */
        operation = in.next();


        /*
        Здесь производится переключение в зависимости от значения переменной operation, вычисляется результат и
        в форматированном и округленном виде выводится на консоль
         */
        switch (operation){
            case "+":
                System.out.printf("Результат операции сложения числа %.4f и числа %.4f:\t\t%.4f \n", firstNumber,
                        secondNumber, (firstNumber+secondNumber));
                break;
            case "-":
                System.out.printf("Результат операции вычитания числа %.4f из числа %.4f:\t\t%.4f \n", secondNumber,
                        firstNumber, (firstNumber-secondNumber));
                break;
            case "*":
                System.out.printf("Результат операции умножения числа %.4f и числа %.4f:\t\t%.4f \n", firstNumber,
                        secondNumber, (firstNumber*secondNumber));
                break;
            case"/":
                System.out.printf("Результат операции деления числа %.4f на числа %.4f:\t\t%.4f \n", firstNumber,
                        secondNumber, (firstNumber/secondNumber));
                break;
            case "%":
                System.out.printf("Результат операции деления по модулю числа %.4f на число %.4f:\t\t%.4f \n",
                        firstNumber, secondNumber, (firstNumber%secondNumber));
                break;
            default:
        }
    }

}
