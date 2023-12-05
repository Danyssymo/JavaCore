package Alex.les2.les3practika;

import java.util.Scanner;

public class Three {

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите сумму в рублях: ");
        int x = sc.nextInt();

        int vse = x % 100;
        int last = x % 10;
        if (vse == 1 || last == 1)
            System.out.println(x + " рубль");
        if (vse > 1 && vse <= 4 || last > 1 && last <= 4)
            System.out.println(x + " рубля");
        if (vse > 5  && last >= 5 && last < 10)
            System.out.println(x + " рублей");
    }
}
