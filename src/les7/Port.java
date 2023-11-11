package les7;

public class Port {


   public void startTenShips(){
       for (int i = 0; i < 10; i++) {
           Ship ship = new Ship();
           Container container = new Container();
           System.out.printf("Корабль с именем: " + ship.getRandomName()+" " + ship.getPalubaType());
           System.out.printf(" C контейнером: " + ship.getRandomContainer() + " высотой: "+ container.rnd);
           System.out.println(" и с водой: " + container.getWaterType() + "PL");
       }
    }

    //public int calculateTotalMass(){
       //m = ρ · V


}
