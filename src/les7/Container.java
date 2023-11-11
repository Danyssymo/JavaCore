package les7;

public class Container {
    public int mini = 1;
    public int big = 2;
    public static final int MIN = 10;
    public static final int MAX = 100;
    public int rnd = getRandomHeight(MIN, MAX);

    public static final String CILINDR = "цилиндр,";
    public static final String KVADRAT = "квадрат,";
    public static final String CONUS = "конус,";
    public int bigcilindr = 20;
    public int bigkvadrat = 20;
    public int bigconus = 20;
    public int minicilindr = 10;
    public int minikvadrat = 10;
    public int miniconus = 10;

    public final int pl1 = 1000;
    public final int pl2 = 2000;
    public int watertype;

    public int getRandomHeight(int MIN, int MAX) {
        MAX -= MIN;
        return (int) (Math.random() * ++MAX) + MIN;
    }

    public int getWaterType() {
        int x = (int) (Math.random() * 2);
        if (x == 0) {
            watertype = pl1;
        } else {
            watertype = pl2;
        }
        return watertype;
    }
}