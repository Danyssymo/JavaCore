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
        String[] containers = new String[calculatePalubaSize()];
        int q = (int) (Math.random() * 2);
        if (containers.length == MINISIZE){
            System.out.print(" С большими:");
        } else if (containers.length == MINISIZE2 && q == 0){
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
                if (q == 0){
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

        public String getRandomName () {
            char[] alphabet = "AaBbCcDdEeFfGgHhIiJjKkLlMmNnOoPpQqRrSsTtUuVvWwXxYyZz".toCharArray();
            char[] name = new char[4];
            for (int i = 0; i < name.length; i++) {
                int x = (int) (Math.random() * 52);
                name[i] = (alphabet[x]);
            }
            return new String(name);
        }

        public String getRandomContainer () {
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

        public int[] checkContainerRange(){
            String[] containersnumbers = new String[calculatePalubaSize()];
            int q = (int) (Math.random() * 2);
            for (int i = 0; i < containersnumbers.length; i++) {
                if (containersnumbers.length == MINISIZE) {
                    int x = (int) (Math.random() * 3);
                    if (x == 0) {
                        containersnumbers[i] = bigcilindrname;
                    } else if (x == 1) {
                        containersnumbers[i] = bigkvadratname;
                    } else containersnumbers[i] = bigconusname;
                } else if (containersnumbers.length == MINISIZE2) {
                    if (q == 0){
                        int x = (int) (Math.random() * 3);
                        if (x == 0) {
                            containersnumbers[i] = bigcilindrname;
                        } else if (x == 1) {
                            containersnumbers[i] = bigkvadratname;
                        } else containersnumbers[i] = bigconusname;
                    } else {
                        int x = (int) (Math.random() * 3);
                        if (x == 0) {
                            containersnumbers[i] = minicilindrname;
                        } else if (x == 1) {
                            containersnumbers[i] = minikvadratname;
                        } else containersnumbers[i] = miniconusname;
                    }
                } else if (containersnumbers.length == BIGSIZE2) {
                    int x = (int) (Math.random() * 3);
                    if (x == 0) {
                        containersnumbers[i] = minicilindrname;
                    } else if (x == 1) {
                        containersnumbers[i] = minikvadratname;
                    } else containersnumbers[i] = miniconusname;
                }
            }
            return containersnumbers;
        }


    }
