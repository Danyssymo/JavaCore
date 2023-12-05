package Alex.les2.les3.rainbow;

import java.util.Scanner;

public class Rainbow {
    public final static String RED = "Красный";
    public final static String ORANGE = "Оранжевый";
    public final static String YELLOW = "Желтый";
    public final static String GREEN = "Зеленый";
    public final static String AZURE = "Голубой";
    public final static String BLUE = "Синий";
    public final static String VIOLET = "Фиолетовый";

    Scanner sc = new Scanner(System.in);

    public void change() {
        System.out.println(" ");
        System.out.println("Выберите опцию:");
        System.out.println("1 - любимый цвет радуги");
        System.out.println("2 - палитра цветов");
        System.out.println("3 - выход из программы");
        int p = sc.nextInt();
        if (p == 1) hello();
        else if (p == 2) palitra();
        else if (p == 3) System.exit(0);
        else {
            System.out.println("Выберите существующий пункт меню");
            change();
        }
    }

    public void hello() {
        System.out.println("Выберите ваш любимый цвет: ");
        System.out.println("1 - " + RED);
        System.out.println("2 - " + ORANGE);
        System.out.println("3 - " + YELLOW);
        System.out.println("4 - " + GREEN);
        System.out.println("5 - " + AZURE);
        System.out.println("6 - " + BLUE);
        System.out.println("7 - " + VIOLET);
        like();
    }

    public int like() {
        int num = sc.nextInt();

        switch (num) {
            case 1:
                System.out.println("Ваш любимый цвет: " + RED);
                change();
                break;
            case 2:
                System.out.println("Ваш любимый цвет: " + ORANGE);
                change();
                break;
            case 3:
                System.out.println("Ваш любимый цвет: " + YELLOW);
                change();
                break;
            case 4:
                System.out.println("Ваш любимый цвет: " + GREEN);
                change();
                break;
            case 5:
                System.out.println("Ваш любимый цвет: " + AZURE);
                change();
                break;
            case 6:
                System.out.println("Ваш любимый цвет: " + BLUE);
                change();
                break;
            case 7:
                System.out.println("Ваш любимый цвет: " + VIOLET);
                change();
                break;
            default:
                System.out.println("Пожалуйста, выберите цвет из списка");
                like();

        }
        return num;

    }

    public void palitra() {
        System.out.println("Выберите какие два цвета смешать:");
        System.out.println("1 - " + RED);
        System.out.println("2 - " + ORANGE);
        System.out.println("3 - " + YELLOW);
        System.out.println("4 - " + GREEN);
        System.out.println("5 - " + AZURE);
        System.out.println("6 - " + BLUE);
        System.out.println("7 - " + VIOLET);
        int col = sc.nextInt();
        int coll = sc.nextInt();
        if (col == 1 && coll == 1) {
            System.out.println("Вы смешали оба красных. Ваш цвет - " + RED);
            change();
        } else if ((col == 1 && coll == 2) || (col == 2 && coll == 1)) {
            System.out.println("Ваш цвет - Красно-Оранжевый");
            change();
        } else if ((col == 1 && coll == 3) || (col == 3 && coll == 1)) {
            System.out.println("Ваш цвет - Красно-Желтый");
            change();
        } else if ((col == 1 && coll == 4) || (col == 4 && coll == 1)) {
            System.out.println("Ваш цвет - Красно-Зеленый");
            change();
        } else if ((col == 1 && coll == 5) || (col == 5 && coll == 1)) {
            System.out.println("Ваш цвет - Красно-Голубой");
            change();
        } else if ((col == 1 && coll == 6) || (col == 6 && coll == 1)) {
            System.out.println("Ваш цвет - Красно-Синий");
            change();
        } else if ((col == 1 && coll == 7) || (col == 7 && coll == 1)) {
            System.out.println("Ваш цвет - Красно-Фиолетовый");
            change();
        } else if (col == 2 && coll == 2) {
            System.out.println("Вы смешали оба оранжевых. Ваш цвет - " + ORANGE);
            change();
        } else if ((col == 2 && coll == 3) || (col == 3 && coll == 2)) {
            System.out.println("Ваш цвет - Оранжево-Желтый");
            change();
        } else if ((col == 2 && coll == 4) || (col == 4 && coll == 2)) {
            System.out.println("Ваш цвет - Оранжево-Зеленый");
            change();
        } else if ((col == 2 && coll == 5) || (col == 5 && coll == 2)) {
            System.out.println("Ваш цвет - Оранжево-Голубой");
            change();
        } else if ((col == 2 && coll == 6) || (col == 6 && coll == 2)) {
            System.out.println("Ваш цвет - Оранжево-Синий");
            change();
        } else if ((col == 2 && coll == 7) || (col == 7 && coll == 2)) {
            System.out.println("Ваш цвет - Оранжево-Фиолетовый");
            change();
        } else if (col == 3 && coll == 3) {
            System.out.println("Вы смешали оба желтых. Ваш цвет - " + YELLOW);
            change();
        } else if ((col == 3 && coll == 4) || (col == 4 && coll == 3)) {
            System.out.println("Ваш цвет - Желто-Зеленый");
            change();
        } else if ((col == 3 && coll == 5) || (col == 5 && coll == 3)) {
            System.out.println("Ваш цвет - Желто-Голубой");
            change();
        } else if ((col == 3 && coll == 6) || (col == 6 && coll == 3)) {
            System.out.println("Ваш цвет - Желто-Синий");
            change();
        } else if ((col == 3 && coll == 7) || (col == 7 && coll == 3)) {
            System.out.println("Ваш цвет - Желто-Фиолетовый");
            change();
        } else if (col == 4 && coll == 4) {
            System.out.println("Вы смешали оба зеленых. Ваш цвет - " + GREEN);
            change();
        } else if ((col == 4 && coll == 5) || (col == 5 && coll == 4)) {
            System.out.println("Ваш цвет - Зелено-Голубой");
            change();
        } else if ((col == 4 && coll == 6) || (col == 6 && coll == 4)) {
            System.out.println("Ваш цвет - Зелено-Синий");
            change();
        } else if ((col == 4 && coll == 7) || (col == 7 && coll == 4)) {
            System.out.println("Ваш цвет - Зелено-Фиолетовый");
            change();
        } else if (col == 5 && coll == 5) {
            System.out.println("Вы смешали оба голубых. Ваш цвет - " + AZURE);
            change();
        } else if ((col == 5 && coll == 6) || (col == 6 && coll == 5)) {
            System.out.println("Ваш цвет - Голубо-Синий");
            change();
        } else if ((col == 5 && coll == 7) || (col == 7 && coll == 5)) {
            System.out.println("Ваш цвет - Голубо-Фиолетовый");
            change();
        } else if (col == 6 && coll == 6) {
            System.out.println("Вы смешали оба синих. Ваш цвет - " + BLUE);
            change();
        } else if ((col == 6 && coll == 7) || (col == 7 && coll == 6)) {
            System.out.println("Ваш цвет - Сине-Фиолетовый");
            change();
        } else if (col == 7 && coll == 7) {
            System.out.println("Вы смешали оба фиолетовых. Ваш цвет - " + VIOLET);
            change();
        }
        else {
            System.out.println("Введите корректные данные");
            palitra();
        }
    }
}