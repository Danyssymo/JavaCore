package OlgaJava.HomeWork12.Six;

public class Main {
    public static void main(String[] args) {
        Data data = new Data(20,30,50);
        data.addHour(8);
        data.addMin(59);
        data.addSec(30);
        System.out.println(data);
    }
}
