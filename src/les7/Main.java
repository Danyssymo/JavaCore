package les7;

public class Main {
    public static void main(String[] args) {
        Port port = new Port();
        port.startTenShips();
        Ship ship = new Ship();
        System.out.println(ship.containers);

    }
}
