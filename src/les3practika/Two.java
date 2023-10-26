package les3practika;

import java.util.Scanner;

public class Two {

    static Scanner sc = new Scanner(System.in);



    public static void main(String[] args) {
        int n = sc.nextInt();
        if (Math.abs(n) % 10 == 3) {
            System.out.println("Да, заканчивается на 3");
        } else {
            System.out.println("Нет, не заканчивается на 3");
        }
    }
}
