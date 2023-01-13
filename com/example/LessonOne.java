package com.example;

import java.time.LocalDate;
public class LessonOne {
    public static void main(String[] args) {
        // Задание 1
        int days = 234;
        int months = days/30;
        System.out.println("Прошло полных месяцев за период: " + months);
        int weeks = days/7;
        System.out.println("Прошло полных недель за период: " + weeks);

        // Задание 2
        final int X = 57;
        int a = X / 10;
        System.out.println("Число десятков: " + a);
        int b = X % 10;
        System.out.println("Число единиц: " + b);

        int c = a + b;
        System.out.println("Сумма равна: " + c);
        int d = a * b;
        System.out.println("Произведение равно: " + d);

        // Задание 3
        final int YEAR = 1991;
        LocalDate currentDate = LocalDate.now();
        int currentYear = currentDate.getYear();
        int x = currentYear - YEAR;
        System.out.println("Возраст = " + x);
    }
}
