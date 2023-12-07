package academy.alexander.les3practika;

import java.util.Scanner;

public class One {
    public final static String WINTER = "Зима";
    public final static String SPRING = "Весна";
    public final static String AUTUMN = "Осень";
    public final static String SUMMER = "Лето";

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        start();
    }

    public static int start(){
        System.out.println("Введите порядковый номер месяца");
        int num = sc.nextInt();

        switch (num) {
            case 1:
                System.out.println(WINTER);
                break;
            case 2:
                System.out.println(WINTER);
                break;
            case 3:
                System.out.println(SPRING);
                break;
            case 4:
                System.out.println(SPRING);
                break;
            case 5:
                System.out.println(SPRING);
                break;
            case 6:
                System.out.println(SUMMER);
                break;
            case 7:
                System.out.println(SUMMER);
                break;
            case 8:
                System.out.println(SUMMER);
                break;
            case 9:
                System.out.println(AUTUMN);
                break;
            case 10:
                System.out.println(AUTUMN);
                break;
            case 11:
                System.out.println(AUTUMN);
                break;
            case 12:
                System.out.println(WINTER);
                break;
            default:
                System.out.println("Такого месяца не существует.");
                start();

        }
        return num;
    }
}
