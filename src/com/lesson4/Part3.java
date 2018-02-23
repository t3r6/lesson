package com.lesson4;

import java.util.Scanner;

public class Part3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите 3 числа (после ввода каждого нажмите Enter): ");
        if (sc.hasNextInt()) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int answer = (a + b + c) / 3;
            System.out.println("Среднее значение: " + answer);
        } else {
            System.out.println("Вы ввели не целое число"); //как сделать, чтобы работали дробные числа?
        }
    }
}

/*
Для преобразования из String в double используйте метод Double.parseDouble(String s)
не понятно куда и как это применить
 */