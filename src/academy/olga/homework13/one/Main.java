package academy.olga.homework13.one;

public class Main {
    public static void main(String[] args) {
        double x = 0.5;
        double pi = Math.PI;
        double first = (Math.sqrt(Math.exp(2.2 * x)));
        double second = Math.abs(Math.sin((pi * x) / (x + (double) 2 / 3)));
        double answer = first - second + 1.7;
        System.out.println("Ответ: " + answer);
    }
}
