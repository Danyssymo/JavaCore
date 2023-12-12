package academy.olga.homework13.four;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x;
        int y;
        int n;
        int counter = 0;
        System.out.println("Введите кол-во точек n: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        System.out.println("Ваши точки: ");
        for (int i = 0; i < n; i++) {
            int[] variables = {-4, -3, -2, -1, 0, 1, 2, 3, 4};
            int rnd1 = (int) (Math.random() * 9);
            int rnd2 = (int) (Math.random() * 9);
            x = variables[rnd1];
            y = variables[rnd2];
            System.out.print("(" + x + "," + y + ") ");
            if ((x >= -2 && x <= 0) && (y <= 2 && y >= 0) || ((x <= 2 && x >= 0) && (y >= -1 && y <= 1))) {
                System.out.println("Эта точка попадает в область значений");
                counter++;
            } else {
                System.out.println("Эта точка не попадает в область значений");
            }
        }
        System.out.println("Кол-во попавших точек: " + counter);
    }
}
