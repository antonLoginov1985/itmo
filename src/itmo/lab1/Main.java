package itmo.lab1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        number1();
        number2();
        number3();
        number4();
        number5();
        number6();
    }


    public static void number1() {
        System.out.println("Я");
        System.out.println("хорошо");
        System.out.println("знаю");
        System.out.println("Java.");
    }

    public static void number2() {
        double result = 186.66666666666669D;
        System.out.println(result);
        int result2 = -1740;
        System.out.println(result2);
    }

    public static void number3() {
        int number = 10500;
        int result = number / 10 / 10;
        System.out.println(result);
    }

    public static void number4() {
        double x = 3.6D;
        double y = 4.1D;
        double z = 5.9D;
        double result = x * y * z;
        System.out.println(result);
    }

    public static void number5() {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
    }

    public static void number6() {
        Scanner scanner = new Scanner(System.in);
        int b = scanner.nextInt();
        if (b % 2 != 0) {
            System.out.println("Нечетное");
        } else if (b <= 100) {
            System.out.println("Четное");
        } else {
            System.out.println("Выход за пределы диапазона");
        }

    }
}
