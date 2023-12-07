package OlgaJava.HomeWork12.Five;

import java.util.Random;

public class Counter {
    private int counter;
    private int min;
    private int max;

    public Counter(int counter, int min, int max) {
        this.counter = counter;
        this.min = min;
        this.max = max;
    }

    public Counter(int min, int max) {
        Random random = new Random();
        counter = random.nextInt(min, max);
        this.min = min;
        this.max = max;
    }

    public void addOneValue() {
        setCounter(counter + 1);
        if (counter > max) {
            counter = min;
        }
    }

    public void removeOneValue() {
        setCounter(counter - 1);
        if (counter < min) {
            counter = max;
        }
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }
}
