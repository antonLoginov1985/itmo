package itmo.lab4;

import java.io.PrintStream;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        lessons1();
        lessons2();
        //lessons 3,4;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число:");
        int a = scanner.nextInt();
        System.out.println("Введите второе число:");
        int b = scanner.nextInt();
        System.out.println("Введите третье число:");
        int c = scanner.nextInt();
        System.out.println("Результат:" + lessons3(a, b, c));
        System.out.println("Результат:" + lessons4(a, b, c));
        int[] ints = {3, -3, 7, 4, 5, 4, 3};
        //lessons 5;
        System.out.println(lessons5(ints));

        //lessons6
        System.out.println(lessons6(ints));

        //lessons1 Part2;
        System.out.println(lessons1Part2(ints));
        // lessons2 Part2();
        System.out.println("Result:" + Arrays.toString(lessons2Part2()));
        //lessons3 Part2
        int[] intsSwap = {5, 6, 7, 2};
        System.out.println("Array 1:" + Arrays.toString(intsSwap));
        System.out.println("Array 2:" + Arrays.toString(swap(intsSwap)));

        //lessons4 Part2();
        int[] ints42 = {1, 2, 3, 1, 2, 4};
        System.out.println("Первое уникальное число в массиве:" + lessons4Part2(ints42));

        // lessons5 Part2();
        int[] ints52 = new int[10];
        for (int i = 0; i < ints52.length; i++) {
            ints52[i] = ((int) (Math.random() * 31) - 15);
        }
        System.out.println("Массив до сортировки:" + Arrays.toString(ints52));
        bubbleSort(ints52);
        System.out.println("Массив поcле сортировки:" + Arrays.toString(ints52));

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

    public static boolean lessons3(int a, int b, int c) {

        if (a + b == c) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean lessons4(int a, int b, int c) {

        if (b > a && c > b) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean lessons5(int[] ints) {

        if (ints.length >= 2) {
            if (ints[0] == ints[ints.length - 1]) {
                return true;
            } else return false;

        } else return false;
    }

    public static boolean lessons6( int[] ints) {

        boolean result = false;
        for (int i : ints) {
            if (i == 1 || i == 3) {
                result = true;
                break;
            }
        }
       return result;
    }

    public static String lessons1Part2(int[] ints) {

        String result = "OK";

        for (int i = 0; i < ints.length; i++) {
            if (ints[i] > ints[Math.min(i + 1, ints.length - 1)]) {
                result = "Please, try again";
                break;
            }
        }
        return result;
    }

    public static int[] lessons2Part2() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Array length:");
        int a = scanner.nextInt();
        int[] ints = new int[a];
        System.out.println("Numbers of array:");
        for (int i = 0; i < ints.length; i++) {
            ints[i] = scanner.nextInt();
        }
        return ints;

    }


    public static int[] swap(int[] ints) {
        int[] copyArr = Arrays.copyOf(ints, ints.length);
        copyArr[0] = ints[ints.length - 1];
        copyArr[copyArr.length - 1] = ints[0];
        return copyArr;
    }

    public static int lessons4Part2(int[] ints) {


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
        return findTemp;
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
