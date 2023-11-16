package les7;

import java.util.Arrays;

public class Port {


   public void startTenShips(){
       for (int i = 0; i < 10; i++) {
           Ship ship = new Ship();
           Container container = new Container();
           System.out.printf("Корабль с именем: " + ship.getRandomName()+ " ");
           System.out.printf(" контейнерами: " + Arrays.toString(ship.addContainerIntoShip()) + " высотой: "+ container.rnd);
           System.out.println(" и с водой: " + container.getWaterType() + "PL");
       }
    }

    //public int calculateTotalMass(){
       //m = ρ · V


}
