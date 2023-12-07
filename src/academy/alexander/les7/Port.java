package academy.alexander.les7;
import java.util.Arrays;

public class Port extends Ship {

    public void startTenShips() {
        getWaterType();
        getRandomHeight();
        int counter = 0;
        for (int i = 0; i < 10; i++) {
            Ship ship = new Ship();
            Container container = new Container();
            System.out.printf("№" + (i + 1) + " Корабль с именем: " + ship.getRandomName() + " ");
            System.out.printf(" контейнерами: " + Arrays.toString(ship.addContainerIntoShip()) + " высотой: ");
            System.out.print(container.getRandomHeight());
            System.out.printf(" и с водой: " + container.getWaterType() + "PL " + "Итоговая масса: ");
            System.out.print(calculateMass());
            System.out.println(" Kg");
            counter = counter + calculateMass();
        }
        System.out.println("Общий объем воды в порту: " + counter + " Kg");
    }

    public int calculateMass() {
        double x = 0;
        double y = 0;
        int mass = 0;
        for (String elements : containers) {
            if (elements.equals(BIG_CONUS_NAME)) {
                x = (PI / 3) * (BIG_CONUS_RADIUS * BIG_CONUS_RADIUS) * rnd;
                mass = mass + (int) (x * waterType);
            } else if (elements.equals(BIG_CILINDR_NAME)) {
                x = PI * (BIG_CILINDR_RADIUS * BIG_CILINDR_RADIUS) * rnd;
                mass = mass + (int) (x * waterType);
            } else if (elements.equals(BIG_KVADRAT_NAME)) {
                x = (BIG_KVADRAT_DIAGONAL * BIG_KVADRAT_DIAGONAL) / 2;
                y = x * rnd;
                mass = mass + (int) (y * waterType);
            } else if (elements.equals(MINI_CONUS_NAME)) {
                x = (PI / 3) * (MINI_CONUS_RADIUS * MINI_CONUS_RADIUS) * rnd;
                mass = mass + (int) (x * waterType);
            } else if (elements.equals(MINI_CILINDR_NAME)) {
                x = PI * (MINI_CILINDR_RADIUS * MINI_CILINDR_RADIUS) * rnd;
                mass = mass + (int) (x * waterType);
            } else if (elements.equals(MINI_KVADRAT_NAME)) {
                x = (MINI_KVADRAT_DIAGONAL * MINI_KVADRAT_DIAGONAL) / 2;
                y = x * rnd;
                mass = mass + (int) (y * waterType);
            }
        }
        return mass;
    }
}