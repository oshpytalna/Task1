package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        //task 1
       System.out.println("Input your name");
        Scanner first = new Scanner(System.in);
        //String [] split = first.nextLine().split(" ");
        String name = first.nextLine();
        System.out.println("Hello "+ name);

        //task2
        for (int i = args.length -1; i>=0; i--)
        System.out.println("Reverse args = " + args[i]);

        //task3
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
        System.out.println("Input Password/Sample: ");
        Scanner second = new Scanner(System.in);
        String sample = second.nextLine();
        System.out.println("Input your password:");
        Scanner third = new Scanner(System.in);
        String pass = third.nextLine();
        if (sample==pass)
            System.out.println("Your password matches the sample");
        else
            System.out.println("You have provided wrong password");

        //task5
        int sum = 0;
        long mult = 1;
        for (int j = 0; j<args.length; j++){
            int x = Integer.parseInt(args[j]);
            sum+= x;
            mult*= x;
        }
        System.out.println("Sum is "+sum);
        System.out.println("Mult is "+ mult);


        //task6
        System.out.println("Input N numbers: ");
        Scanner scan1 = new Scanner(System.in);
        String[] split = scan1.nextLine().split(" ");
        int [] numbers;
        numbers = new int[split.length];
        for (int i=0; i<split.length; i++){
            numbers [i]=Integer.parseInt(split[i]);

        }

        for (int i=0; i<numbers.length; i++){
            if (numbers[i]%2==0)
                System.out.println("even numbers are: " +numbers[i]);
            else
                System.out.println("odd numbers are: "+ numbers[i]);

        }
    }
}
