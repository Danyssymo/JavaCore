package OlgaJava.HomeWork12.Five;

import java.util.Scanner;

public class Counter {
    private static int counter;

    public static void main(String[] args) {
        menu();
    }

    private static void addValue(int value) {
        setCounter((getCounter() + value));
    }

    private static void removeValue(int value) {
        setCounter((getCounter() - value));
    }

    private static void menu() {

        System.out.println("Нажмите 1 чтобы задать свой параметр для счетчика: ");
        System.out.println("Нажмите 2 чтобы задать случайный параметр для счетчика: ");
        System.out.println("Нажмите 3 чтобы задать параметр для счетчика = 0: ");
        System.out.println("Нажмите 4 чтобы выйти из программы: ");
        Scanner sc = new Scanner(System.in);
        int change = sc.nextInt();
        switch (change) {
            case 1:
                int s = sc.nextInt();
                setCounter(s);
                System.out.println("Значение установленно на: " + getCounter());
                secondMenu();
                break;
            case 2:
                setCounter((int) (Math.random() * 100));
                System.out.println("Значение установленно на: " + getCounter());
                secondMenu();
                break;
            case 3:
                setCounter(0);
                System.out.println("Значение установленно на 0");
                secondMenu();
                break;
            case 4:
                System.exit(0);
                break;
            default:
                System.out.println("Пожалуйста, выберите пункт из списка");
                menu();
        }
    }

    private static void secondMenu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ваш счетчик равен: " + getCounter());
        System.out.println(" ");
        System.out.println("Нажмите 1 чтобы увеличить счетчик на 1: ");
        System.out.println("Нажмите 2 чтобы уменьшить счетчик на 1: ");
        System.out.println("Нажмите 3 чтобы увеличить счетчик на своё значение: ");
        System.out.println("Нажмите 4 чтобы уменьшить счетчик на своё значение: ");
        System.out.println("Нажмите 5 чтобы вернуться к прошлому меню: ");
        int change = sc.nextInt();
        switch (change) {
            case 1:
                addValue(1);
                System.out.println(getCounter());
                secondMenu();
                break;
            case 2:
                removeValue(1);
                System.out.println(getCounter());
                secondMenu();
                break;
            case 3:
                int s = sc.nextInt();
                addValue(s);
                System.out.println(getCounter());
                secondMenu();
                break;
            case 4:
                int f = sc.nextInt();
                removeValue(f);
                System.out.println(getCounter());
                secondMenu();
                break;
            case 5:
                menu();
                break;
            default:
                System.out.println("Пожалуйста, выберите пункт из списка");
                secondMenu();
        }
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Counter.counter = counter;
    }
}
