package Lesson11;

import java.util.Random;
import java.util.Scanner;

public class Main {

    //Денис Красько. Вариантт 2

    //задача1
    /*public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size;
        do {
            System.out.println("Введите размер массива ");
            size = in.nextInt();
        } while (size<=0);
        int[] arr=new int[size];
        Random gen = new Random();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = gen.nextInt(11) -5;
            sum = sum + arr[i];
            System.out.print(arr[i] + " ");
        }
        System.out.println("Сумма элементов массива: " + sum);

    }*/

    //задача2
    /*public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size;
        do {
            System.out.println("Введите размер массива ");
            size = in.nextInt();
        } while (size<=0);
        int[] arr=new int[size];
        Random gen = new Random();
        int proiz = 1;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = gen.nextInt(25) -12;
            if (arr[i]<0) proiz = proiz*arr[i];
            System.out.print(arr[i] + " ");
        }
        System.out.println("Произведение отрицательных элементов массива: " + proiz);
    }*/

    //задача3
    /*public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size;
        do {
            System.out.println("Введите размер массива ");
            size = in.nextInt();
        } while (size<=0);
        int[] arr=new int[size];
        Random gen = new Random();
        int kolvo = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = gen.nextInt(21);
            System.out.print(arr[i] + " ");
            if (arr[i]%3==0 || arr[i]%5==0 || arr[i]%7==0) kolvo++;
        }
        System.out.println("Кол-во элементов массива которые делятся на 3 или на 5 или на 7: " + kolvo);
    }*/

    //задача4
    /*public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size;
        do {
            System.out.println("Введите размер массива ");
            size = in.nextInt();
        } while (size<=0);
        int[] arr=new int[size];
        Random gen = new Random();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = gen.nextInt(26);
            System.out.print(arr[i] + " ");
            if (arr[i]%2==1) sum=sum+arr[i];
        }
        System.out.println("Сумма элементов массива, которые являются нечётными числами: " + sum);
    }*/

}


