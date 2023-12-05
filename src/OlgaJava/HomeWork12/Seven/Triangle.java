package OlgaJava.HomeWork12.Seven;

public class Triangle {
    private static int a = 10;
    private static int b = 15;
    private static int c = 20;
    private static int h = 15;

    public static void main(String[] args) {
        calculatePl();
        calculatePer();
    }

    private static int calculatePl() {
        int x = (getA() / 2) * getH();
        System.out.println("Площадь треугольника: "+x);
        return x;
    }
    private static int calculatePer() {
        int x = getA()+getB()+getC();
        System.out.println("Периметр треугольника: "+x);
        return x;
    }

    public static int getA() {
        return a;
    }

    public static void setA(int a) {
        Triangle.a = a;
    }

    public static int getB() {
        return b;
    }

    public static void setB(int b) {
        Triangle.b = b;
    }

    public static int getC() {
        return c;
    }

    public static void setC(int c) {
        Triangle.c = c;
    }

    public static int getH() {
        return h;
    }

    public static void setH(int h) {
        Triangle.h = h;
    }
}
