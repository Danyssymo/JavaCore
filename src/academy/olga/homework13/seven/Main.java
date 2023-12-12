package academy.olga.homework13.seven;

public class Main {
    public static void main(String[] args) {
        double res;
        double x = 0.1;
        double z = 0.2;
        double h = 0.5;
        int n = 10;
        int m = 5;
        int check = 0;
        for (int i = 0; i < n; i++) {
            res = Math.sqrt(Math.pow(z, 2) + Math.pow(x, 2)) * Math.abs(Math.log(z)) + (Math.log(x) /
                    Math.sqrt(Math.pow(x, 2) - Math.pow(z, 2) + 3.2));
            System.out.println("При x = " + x + " и z = " + z + " функция = " + res);
            x = x * h;
            if (check < m) {
                z = z * (h / 0.55);
                check++;
            }
        }
    }
}
