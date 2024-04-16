package itmo.lab2;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int x1 = 6;
        int x2 = 8;
        int x3 = 7;
        System.out.println(calc.summa(x1, x2, x3));
        System.out.println(calc.divide(x1, x2));
        System.out.println(calc.multiply(x1, x2));
        System.out.println(calc.subtract(x1, x2));

       double x11 = 6;
       double x22 = 8;

        System.out.println(calc.summa(x11, x22));
        System.out.println(calc.divide(x11, x22));
        System.out.println(calc.multiply(x11, x22));
        System.out.println(calc.subtract(x11, x22));

        long y1 = 5000;
        long y2 = 17;

        System.out.println(calc.summa(y1, y2));
        System.out.println(calc.divide(y1, y2));
        System.out.println(calc.multiply(y1, y2));
        System.out.println(calc.subtract(y1, y2));

        Phone PH = new Phone();

        System.out.println(PH.toString());

        Phone PH1 = new Phone("S24", "Samsung");
        System.out.println(PH1.toString());

        Phone PH2 = new Phone("S24","Samsung",405, 6.9,549, true);
        System.out.println(PH2.toString());

    }
}
