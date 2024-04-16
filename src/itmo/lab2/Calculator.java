package itmo.lab2;

public class Calculator {

    public double summa(double x1, double x2) {
        return x1 + x2;
    }

    public long summa(long x1, long x2) {
        return x1 + x2;
    }

    public int summa(int x1, int x2) {
        return x1 + x2;
    }

    public double summa(double x1, double x2, double x3) {
        return x1 + x2 + x3;
    }

    public long summa(long x1, long x2, long x3) {
        return x1 + x2 + x3;
    }

    public int summa(int x1, int x2, int x3) {
        return x1 + x2 + x3;
    }

    public double divide(double x1, double x2) {
        if (x2 == 0) {
            return 0;
        } else {
            return x1 / x2;
        }
    }

    public double divide(long x1, long x2) {
        if (x2 == 0) {
            return 0;
        } else {
            return (double)x1 / (double)x2;
        }
    }

    public double divide(int x1, int x2) {
        if (x2 == 0) {
            return 0;
        } else {
            return (double)x1 / (double)x2;
        }
    }

    public double multiply(double x1, double x2) {
        return x1 * x2;
    }

    public long multiply(long x1, long x2) {
        return x1 * x2;
    }

    public int multiply(int x1, int x2) {
        return x1 * x2;
    }

    public double subtract(double x1, double x2) {
        return x1 - x2;
    }

    public long subtract(long x1, long x2) {
        return x1 - x2;
    }

    public int subtract(int x1, int x2) {
        return x1 - x2;
    }


}
