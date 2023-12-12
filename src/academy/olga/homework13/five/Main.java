package academy.olga.homework13.five;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double a = 1;
        double x1 = -2 * a;
        double dx = a / 5;
        double y;
        double x = x1;
        int counter = 1;

        System.out.println("Введите кол-во точек n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            if (x <= 0) {
                y = a / 2 * (Math.exp(x / a) + (Math.exp(-x / a)));
            } else {
                y = 4 * Math.pow(a, 3) / Math.pow(x, 2) + 4 * Math.pow(a, 2);
            }
            BigDecimal roundingX = new BigDecimal(x);
            BigDecimal resultX = roundingX.setScale(1, RoundingMode.HALF_UP);
            BigDecimal roundingY = new BigDecimal(y);
            BigDecimal resultY = roundingY.setScale(4, RoundingMode.HALF_UP);
            System.out.println(counter + ") " + "x= " + resultX + " y= " + resultY);
            counter++;
            x = x + dx;
        }
    }
}
