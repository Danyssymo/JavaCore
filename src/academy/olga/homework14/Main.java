package academy.olga.homework14;

public class Main {

    public static void main(String[] args) {
        Shelter catsShelter = new Shelter();

        catsShelter.add(new Cat("Barsik", 2, 4));
        catsShelter.add(new Cat("Mursik", 1, 2));
        catsShelter.add(new Cat("Pushinka", 3, 6));

        catsShelter.print();
        System.out.println("------------------------------------------------");

        Cat korni = new Cat("Korni", 1, 3);

        catsShelter.add(korni);
        catsShelter.print();
        System.out.println("------------------------------------------------");


        System.out.println(catsShelter.reserveCat("Korni"));

        catsShelter.deleteCat("Korni");
        catsShelter.print();
        System.out.println("------------------------------------------------");

        catsShelter.deleteCat("Mursik");
        catsShelter.print();

    }

}