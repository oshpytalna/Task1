package com.company;

import java.io.Console;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("Task 1");

        //task 1
        System.out.println("1. Приветствовать любого пользователя при вводе его имени через командную строку.");
       System.out.println("Input your name");
        Scanner first = new Scanner(System.in);
        //String [] split = first.nextLine().split(" ");
        String name = first.nextLine();
        System.out.println("Hello "+ name);

        //task2
        System.out.println("2. Отобразить в окне консоли аргументы командной строки в обратном порядке.");
        for (int i = args.length -1; i>=0; i--)
        System.out.println("Reverse args = " + args[i]);

        //task3
        System.out.println("3. Вывести заданное количество случайных чисел с переходом и без перехода на новую строку.");
        System.out.println("Input number quantity: ");
        Scanner scan = new Scanner(System.in);
        int quantity = scan.nextInt();

        for ( int i=0; i<quantity; i++) {
            Random r = new Random();
            System.out.print(r.nextInt(100) + ", ");
            }
        System.out.println("");
        for (int i=0; i<quantity; i++) {
            Random r = new Random();
            System.out.println(r.nextInt(100));
        }

        //task4
        System.out.println("4. Ввести пароль из командной строки и сравнить его со строкой-образцом.");
        System.out.println("Input Password/Sample: ");
        Scanner second = new Scanner(System.in);
        String sample = second.nextLine();
        System.out.println("Input your password:");
        Scanner third = new Scanner(System.in);
        String pass = third.nextLine();
        if (Objects.equals(sample, pass))
            System.out.println("Your password matches the sample");
        else
            System.out.println("You have provided wrong password");

        //task5
        System.out.println("5. Ввести целые числа как аргументы командной строки, подсчитать их суммы (произведения) и вывести результат на консоль.");
        int sum = 0;
        long mult = 1;
        for (String arg : args) {
            int x = Integer.parseInt(arg);
            sum += x;
            mult *= x;
        }
        System.out.println("Sum is "+sum);
        System.out.println("Mult is "+ mult);

        //task6
        System.out.println("6.Ввести с консоли n целых чисел. На консоль вывести:");
        System.out.println("6.1. Четные и нечетные числа.");
        System.out.println("Input numbers: ");
        Scanner scan1 = new Scanner(System.in);
        String[] split = scan1.nextLine().split(" ");
        int[] numbers;
        numbers = new int[split.length];
        for (int i = 0; i < split.length; i++) {
            numbers[i] = Integer.parseInt(split[i]);
        }
        for (int number1 : numbers) {
            if (number1 % 2 == 0)
                System.out.println("even numbers are: " + number1);
            else
                System.out.println("odd numbers are: " + number1);

        }

        System.out.println("6.2. Наибольшее и наименьшее число:");
        int max = numbers[0], min = numbers[0];
        for (int number1 : numbers) {
            if (max < number1)
                max = number1;
            if (min > number1)
                min = number1;
        }
        System.out.println("Max value: " + max);
        System.out.println("Min value: " + min);


        System.out.println("6.3. Числа, которые делятся на 3 или на 9");
        for (int number1 : numbers) {
            if (number1 == 0)
                continue;
            if (number1 % 3 == 0 || number1 % 9 == 0)
                System.out.println(" делятся на 3 или 9 " + number1);

        }

        System.out.println("6.4. Числа, которые делятся на 5 и на 7.");
        for (int number1 : numbers) {
            if (number1 == 0)
                continue;
            if (number1 % 5 == 0 && number1 % 7 == 0)
                System.out.println("делятся на 5 и на 7 " + number1);


        }

        System.out.println("6.5. Все трехзначные числа, в десятичной записи которых нет одинаковых цифр.");
        for (int number1 : numbers) {
            String number = Integer.toString(number1);
            if (number.length() == 3) {
                if (number.charAt(0) != number.charAt(1)
                        && number.charAt(0) != number.charAt(2) && number.charAt(1) != number.charAt(2)) {
                    System.out.println(number);
                }
            }

        }
    }
}
