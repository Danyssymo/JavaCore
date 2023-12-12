package academy.olga.homework13.six;

public class Main {
    public static void main(String[] args) {
        double a = 3 * Math.pow(10, 3);
        double b = 6 * Math.pow(10, 4);
        double res;
        int m = 4;
        int min = -30;
        int max = 60;
        int counter = 0;
        double t1 = Math.sqrt(a + b + m);
        double t2 = m * Math.sqrt(a + b);
        double t3 = Math.sqrt(a * b * m);
        double t4 = m * Math.sqrt(a * b);
        System.out.println("Значения, которые попали в область функции: ");
        for (double i = min; i < max; i = i + 4.5) {
            res = Math.pow(i, 3) - (25 * Math.pow(i, 2)) + (50 * i) + 1000;
            if ((res > t1 && res < t2) || (res > t3 && res < t4)) {
                System.out.println((int) res);
            } else {
                counter++;
            }
        }
        System.out.println("Кол-во значений, не попавших в область функции: " + counter);
    }
}
