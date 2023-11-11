package les7;

public class Ship extends Deck {
    public String ship;
    public String containertype;

    public String getPalubaType() {
        int x = (int) (Math.random() * 2);
        if (x == 0) {
            ship = MINISPACE;
        } else {
            ship = BIGSPACE;
        }
        return ship;
    }

    public int calculatePalubaSize() {
        int x;
        if (getPalubaType() == MINISPACE) {
            x = MINISIZE;
        } else {
            x = BIGSIZE;
        }
        return x;
    }

    public int[] addContainerIntoShip() {
        int[] containers = new int[calculatePalubaSize()];
        for (int i = 0; i < containers.length; i++) {
            if (i + 2 <=containers.length){
                int x = (int) (Math.random() * 2);
                if (x == 1) {
                    int y = (int) (Math.random() * 3);
                    if (y == 1) {
                        containers[i] = bigcilindr;

                    } else if (y == 2) {
                        containers[i] = bigkvadrat;
                    } else {
                        containers[i] = bigconus;
                    }
                } else {
                    int y = (int) (Math.random() * 3);
                    if (y == 1) {
                        containers[i] = minicilindr;
                    } else if (y == 2) {
                        containers[i] = minikvadrat;
                    } else {
                        containers[i] = miniconus;
                    }
                }
            } else {
                int y = (int) (Math.random() * 3);
                if (y == 1) {
                    containers[i] = minicilindr;
                } else if (y == 2) {
                    containers[i] = minikvadrat;
                } else {
                    containers[i] = miniconus;
                }
            }
            System.out.println(containers[i]);
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

    public String getRandomContainer() {
        int x = (int) (Math.random() * 3);
        if (x == 0) {
            containertype = CILINDR;
        } else if (x == 1) {
            containertype = KVADRAT;
        } else {
            containertype = CONUS;
        }
        return containertype;
    }

}
