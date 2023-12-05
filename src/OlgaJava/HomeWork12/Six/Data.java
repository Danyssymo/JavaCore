package OlgaJava.HomeWork12.Six;

import java.util.Scanner;

public class Data {
    private static int hour;
    private static int min;
    private static int sec;

    public static void main(String[] args) {
        setHour1();
        setMinut();
        setSecunds();
        setTime();
    }

    private static void setHour1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите час: ");
        int x = sc.nextInt();
        if (x <= 24 && x >= 0) {
            setHour(x);
        } else {
            setHour(0);
        }
    }

    private static void setMinut() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите минуты: ");
        int x = sc.nextInt();
        if (x <= 59 && x >= 0) {
            setMin(x);
        } else {
            setMin(0);
        }
    }

    private static void setSecunds() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите секунды: ");
        int x = sc.nextInt();
        if (x <= 59 && x >= 0) {
            setSec(x);
        } else {
            setSec(0);
        }
    }

    private static void setTime() {
        System.out.println(getHour() + ":" + getMin() + ":" + getSec());
    }

    public static int getHour() {
        return hour;
    }

    public static void setHour(int hour) {
        Data.hour = hour;
    }

    public static int getMin() {
        return min;
    }

    public static void setMin(int min) {
        Data.min = min;
    }

    public static int getSec() {
        return sec;
    }

    public static void setSec(int sec) {
        Data.sec = sec;
    }
}
