package Alex.les2.les7;

public class Ship extends Deck {
    public String ship;
    public static String[] containers;

    public String getPalubaType() {
        int x = (int) (Math.random() * 2);
        if (x == 0) {
            ship = MINI_SPACE;
        } else {
            ship = BIG_SPACE;
        }
        return ship;
    }

    public int calculatePalubaSize() {
        int y;
        if (getPalubaType() == MINI_SPACE) {
            int x = (int) (Math.random() * 2);
            if (x == 1) {
                y = MINI_SIZE;
            } else {
                y = MINI_SIZE2;
            }
        } else {
            int x = (int) (Math.random() * 2);
            if (x == 1) {
                y = BIG_SIZE;
            } else {
                y = BIG_SIZE2;
            }
        }
        return y;
    }

    public String[] addContainerIntoShip() {
        containers = new String[calculatePalubaSize()];
        int q = (int) (Math.random() * 2);
        if (containers.length == MINI_SIZE) {
            System.out.print(MINI_SPACE);
            System.out.print("С большими");
        } else if (containers.length == MINI_SIZE2 && q == 0) {
            System.out.print(BIG_SPACE);
            System.out.print("С большими");
        } else if (containers.length == MINI_SIZE2 && q == 1) {
            System.out.print(MINI_SPACE);
            System.out.print("С маленькими");
        } else {
            System.out.print(BIG_SPACE);
            System.out.print("С маленькими");
        }
        for (int i = 0; i < containers.length; i++) {
            if (containers.length == MINI_SIZE) {
                int x = (int) (Math.random() * 3);
                if (x == 0) {
                    containers[i] = BIG_CILINDR_NAME;
                } else if (x == 1) {
                    containers[i] = BIG_KVADRAT_NAME;
                } else containers[i] = BIG_CONUS_NAME;
            } else if (containers.length == MINI_SIZE2) {
                if (q == 0) {
                    int x = (int) (Math.random() * 3);
                    if (x == 0) {
                        containers[i] = BIG_CILINDR_NAME;
                    } else if (x == 1) {
                        containers[i] = BIG_KVADRAT_NAME;
                    } else containers[i] = BIG_CONUS_NAME;
                } else {
                    int x = (int) (Math.random() * 3);
                    if (x == 0) {
                        containers[i] = MINI_CILINDR_NAME;
                    } else if (x == 1) {
                        containers[i] = MINI_KVADRAT_NAME;
                    } else containers[i] = MINI_CONUS_NAME;
                }
            } else if (containers.length == BIG_SIZE2) {
                int x = (int) (Math.random() * 3);
                if (x == 0) {
                    containers[i] = MINI_CILINDR_NAME;
                } else if (x == 1) {
                    containers[i] = MINI_KVADRAT_NAME;
                } else containers[i] = MINI_CONUS_NAME;
            }
        }
        return containers;
    }

    public String getRandomName() {
        char[] alphabet = "AaBbCcDdEeFfGgHhIiJjKkLlMmNnOoPpQqRrSsTtUuVvWwXxYyZz".toCharArray();
        char[] name = new char[4];
        for (int i = 0; i < name.length; i++) {
            int x = (int) (Math.random() * 52);
            name[i] = (alphabet[x]);
        }
        return new String(name);
    }
}