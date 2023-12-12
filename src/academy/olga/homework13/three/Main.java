package academy.olga.homework13.three;

public class Main {
    public static void main(String[] args) {
        double x = 0.5;
        int n = 20;
        double counter = 0;
        for (int i = 1; i <= n; i++) {
            counter = ((Math.sin((i * x) / 2)) + Math.sin(((i * x) - 1) / 2)) / Math.exp((x - 1) / i);
            counter = counter + counter;
        }
        counter = counter * Math.sqrt(n * Math.PI);
        System.out.println("Ответ: " + counter);
    }
}
