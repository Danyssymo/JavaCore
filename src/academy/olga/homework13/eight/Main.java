package academy.olga.homework13.eight;

public class Main {
    public static void main(String[] args) {
        for (double x = 0.1; x <= 10; x += 0.1) {
            double f = Math.pow(x, 2) - Math.exp(2 * x) + 4;
            if (f >= 0) {
                System.out.println("При x = " + String.format("%.2f", x) + " Функция: " + f);
            } else {
                System.out.println("Ноль функции пройден!");
                System.out.println("Следующее значение: ");
                System.out.println("При x = " + String.format("%.2f", x) + " Функция: " + f);
                break;
            }
        }
    }
}
