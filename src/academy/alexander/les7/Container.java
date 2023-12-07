package academy.alexander.les7;

public class Container {
    public static int rnd;
    public static final int BIG_CILINDR_RADIUS = 10;
    public static final int BIG_KVADRAT_DIAGONAL = 20;
    public static final int BIG_CONUS_RADIUS = 10;
    public static final int MINI_CILINDR_RADIUS = 5;
    public static final int MINI_KVADRAT_DIAGONAL = 10;
    public static final int MINI_CONUS_RADIUS = 5;
    public static final String BIG_CILINDR_NAME = "ЦИЛИНДР";
    public static final String BIG_KVADRAT_NAME = "КВАДРАТ";
    public static final String BIG_CONUS_NAME = "КОНУС";
    public static final String MINI_CILINDR_NAME = "цилиндр";
    public static final String MINI_KVADRAT_NAME = "квадрат";
    public static final String MINI_CONUS_NAME = "конус";
    public static final int PL1 = 1000;
    public static final int PL2 = 2000;
    public static final double PI = 3.14;
    public static int waterType;


    public int getRandomHeight() {
        rnd = (int) ((Math.random() * 91) + 10);
        return rnd;
    }

    public int getWaterType() {
        int x = (int) (Math.random() * 2);
        if (x == 0) {
            waterType = PL1;
        } else {
            waterType = PL2;
        }
        return waterType;
    }
}