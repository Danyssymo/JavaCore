package les7;

public class Ship extends Deck {
    public String ship;
    public String containertype;
    public String[] containers;

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
        int y;
        if (getPalubaType() == MINISPACE) {
            int x = (int) (Math.random() * 2);
            if (x == 1) {
                y = MINISIZE;
            } else {
                y = MINISIZE2;
            }
        } else {
            int x = (int) (Math.random() * 2);
            if (x == 1) {
                y = BIGSIZE;
            } else {
                y = BIGSIZE2;
            }
        }
        return y;
    }

    public String[] addContainerIntoShip() {
        containers = new String[calculatePalubaSize()];
        int q = (int) (Math.random() * 2);
        if (containers.length == MINISIZE) {
          System.out.print(" С большими:");
        } else if (containers.length == MINISIZE2 && q == 0) {
            System.out.print(" С большими:");
        } else {
            System.out.print(" С маленькими");
        }
        for (int i = 0; i < containers.length; i++) {
            if (containers.length == MINISIZE) {
                int x = (int) (Math.random() * 3);
                if (x == 0) {
                    containers[i] = bigcilindrname;
                } else if (x == 1) {
                    containers[i] = bigkvadratname;
                } else containers[i] = bigconusname;
            } else if (containers.length == MINISIZE2) {
                if (q == 0) {
                    int x = (int) (Math.random() * 3);
                    if (x == 0) {
                        containers[i] = bigcilindrname;
                    } else if (x == 1) {
                        containers[i] = bigkvadratname;
                    } else containers[i] = bigconusname;
                } else {
                    int x = (int) (Math.random() * 3);
                    if (x == 0) {
                        containers[i] = minicilindrname;
                    } else if (x == 1) {
                        containers[i] = minikvadratname;
                    } else containers[i] = miniconusname;
                }
            } else if (containers.length == BIGSIZE2) {
                int x = (int) (Math.random() * 3);
                if (x == 0) {
                    containers[i] = minicilindrname;
                } else if (x == 1) {
                    containers[i] = minikvadratname;
                } else containers[i] = miniconusname;
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

    public int[] checkContainerRange() {
        int[] containersnum = new int[calculatePalubaSize()];
        int i = 0;
        for (String num : addContainerIntoShip()) {
            if (num == bigcilindrname) {
                containersnum[i] = bigcilindr;
            } else if (num == bigkvadratname) {
                containersnum[i] = bigkvadrat;
            } else if (num == bigconusname) {
                containersnum[i] = bigconus;
            } else if (num == minicilindrname) {
                containersnum[i] = minicilindr;
            } else if (num == minikvadratname) {
                containersnum[i] = minikvadrat;
            } else {
                containersnum[i] = miniconus;
            }
            System.out.println(containersnum[i]);
            i++;
        }
        return containersnum;
    }

    public int[] checkContainerRange2() {
        int hello[] = new int[addContainerIntoShip().length];
        for (int i = 0; i < addContainerIntoShip().length; i++) {
            if (addContainerIntoShip()[i] == bigcilindrname) {
                hello[i] = bigcilindr;
            } else if (addContainerIntoShip()[i] == bigkvadratname) {
                hello[i] = bigkvadrat;
            } else if (addContainerIntoShip()[i] == bigconusname) {
                hello[i] = bigconus;
            } else if (addContainerIntoShip()[i] == minicilindrname) {
                hello[i] = minicilindr;
            } else if (addContainerIntoShip()[i] == minikvadratname) {
                hello[i] = minikvadrat;
            } else {
                hello[i] = miniconus;
            }
            System.out.println(hello[i]);
        }
        return hello;
    }


}