package itmo.lab4;

import java.io.PrintStream;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        lessons1();
        lessons2();
        lessons3();
        lessons4();
        lessons5();
        lessons6();
        lessons1Part2();
        lessons2Part2();
        lessons3Part2();
        lessons4Part2();
        lessons5Part2();
    }

    public static void lessons1() {
        for (int i = 1; i <= 99; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }

    public static void lessons2() {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.println("Делиться на 3:" + i);
            }
            if (i % 5 == 0) {
                System.out.println("Делиться на 5:" + i);
            }
            if ((i % 3 == 0) && (i % 5 == 0)) {
                System.out.println("Делиться на 3 и на 5:" + i);
            }
        }
    }

    public static void lessons3() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число:");
        int a = scanner.nextInt();
        System.out.println("Введите второе число:");
        int b = scanner.nextInt();
        System.out.println("Введите третье число:");
        int c = scanner.nextInt();

        boolean result;
        if (a + b == c) {
            result = true;
        } else {
            result = false;
        }
        System.out.println("Результат:" + result);
    }

    public static void lessons4() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число:");
        int a = scanner.nextInt();
        System.out.println("Введите второе число:");
        int b = scanner.nextInt();
        System.out.println("Введите третье число:");
        int c = scanner.nextInt();

        boolean result;
        if (b > a && c > b) {
            result = true;
        } else {
            result = false;
        }
        System.out.println("Результат:" + result);
    }

    public static void lessons5() {

        int[] ints = {3, -3, 7, 4, 5, 4, 3};

        if (ints.length >= 2) {
            if (ints[0] == ints[ints.length - 1]) {
                System.out.println(true);
            } else System.out.println(false);

        } else System.out.println(false);
    }

    public static void lessons6() {

        int[] ints = {3, -3, 7, 4, 5, 4, 3};

        boolean result = false;
        for (int i : ints) {
            if (i == 1 || i == 3) {
                result = true;
                break;
            }
        }
        System.out.println(result);
    }

    public static void lessons1Part2() {
        int[] ints = {3, -3, 7, 4, 5, 4, 3};
        //int[] ints = {1, 3, 7, 8, 10, 15, 18};

        String result = "OK";

        for (int i = 0; i < ints.length; i++) {
            if (ints[i] > ints[Math.min(i + 1, ints.length - 1)]) {
                result = "Please, try again";
                break;
            }

        }
        System.out.println(result);
    }

    public static void lessons2Part2() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Array length:");
        int a = scanner.nextInt();
        int[] ints = new int[a];
        System.out.println("Numbers of array:");
        for (int i = 0; i < ints.length; i++) {
            ints[i] = scanner.nextInt();
        }
        System.out.println("Result:" + Arrays.toString(ints));
    }

    public static void lessons3Part2() {
        int[] ints = {5, 6, 7, 2};
        System.out.println("Array 1:" + Arrays.toString(ints));
        swap(ints);

    }

    public static void swap(int[] ints) {
        int[] copyArr = Arrays.copyOf(ints, ints.length);
        copyArr[0] = ints[ints.length - 1];
        copyArr[copyArr.length - 1] = ints[0];
        System.out.println("Array 2:" + Arrays.toString(copyArr));
    }

    public static void lessons4Part2() {
        int[] ints = {1, 2, 3, 1, 2, 4};

        boolean find = false;
        int findTemp = 0;
        for (int i = 0; i < ints.length; i++) {
            find = false;
            int temp1 = ints[i];
            for (int j = 0; j < ints.length; j++) {
                if (i != j) {
                    int temp2 = ints[j];
                    if (temp1 == temp2) {
                        find = true;
                        break;
                    }
                }
            }
            if (find == false) {
                findTemp = temp1;
                break;
            }
        }
        if (find == false) {
            System.out.println("Первое уникальное число в массиве:" + findTemp);

        }
    }

    public static void lessons5Part2() {
        int[] ints = new int[10];
        for (int i = 0; i < ints.length; i++) {
            ints[i] = ((int) (Math.random() * 31) - 15);


        }
        System.out.println("Массив до сортировки:" + Arrays.toString(ints));
        bubbleSort(ints);
        System.out.println("Массив полсе сортировки:" + Arrays.toString(ints));

    }

    private static void bubbleSort(int[] ints) {
        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints.length; j++) {
                if (ints[i] < ints[j]) {
                    int aj = ints[j];
                    int ai = ints[i];

                    ints[j] = ai;
                    ints[i] = aj;
                }
            }
        }
    }

}
