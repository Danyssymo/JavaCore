package OlgaJava.HomeWork12.Five;

public class Main {
    public static void main(String[] args) {
        Counter counter = new Counter(50,10,100);
        Counter counter1 = new Counter(10,100);
        counter.addOneValue();
        counter.addOneValue();
        counter.addOneValue();
        counter.addOneValue();
        counter.removeOneValue();
        System.out.println(counter.getCounter());
        System.out.println(counter1.getCounter());
    }
}
