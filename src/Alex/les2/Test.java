package Alex.les2;

public class Test {

    public static void main(String[] args) {
        Pelmen[] pelmens = new Pelmen[10];

        for (int i = 0; i < 10; i++) {
            Pelmen pelmen = new Pelmen();
            pelmen.setNumber(i);
            pelmens[i] = pelmen;
        }

        for (int i = 1; i < pelmens.length; i++) {
            System.out.println(i);
            if (pelmens[i].number == 5) {
                System.out.println("123");
                break;
            }
        }
    }

}
