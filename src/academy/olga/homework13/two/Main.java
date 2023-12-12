package academy.olga.homework13.two;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class Main {

    public static void main(String[] args) {
        calculateFunction();
    }

    private static double calculateFormula(double x) {
        double pi = Math.PI;
        double first = (Math.sqrt(Math.exp(2.2 * x)));
        double second = Math.abs(Math.sin((pi * x) / (x + (double) 2 / 3)));
        double answer = first - second + 1.7;
        return answer;
    }

    private static void calculateFunction() {
        double a = 0.50;
        double b = 1.00;
        int count = 1;
        for (double i = a; i < b; i = i + 0.05) {
            System.out.print(count + ") ");
            System.out.print("Значение n: " + String.format("%.2f", i) + " ");
            System.out.print("Значение f(x): " + String.format("%.6f", calculateFormula(i)));
            System.out.println(" ");
            count++;
        }
    }
}
