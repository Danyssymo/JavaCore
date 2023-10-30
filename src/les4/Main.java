package les4;

public class Main {
    Cat cat = new Cat();
    public static void main(String[] args) {

        getOpenSpace();
        System.out.println("Это мой 1-ый цикл while");
        getOpenSpace();
        getFirst();
        getOpenSpace();
        System.out.println("Это мой 2-ой цикл for");
        getOpenSpace();
        getSecond();
        getOpenSpace();
        System.out.println("Это мой 3-ый цикл do while");
        getOpenSpace();
        getThird();
        getOpenSpace();
        System.out.println("Это мой 4-ый цикл for each");getOpenSpace();
        getFour();
        getOpenSpace();
        testingEquals();
    }

    private static void getFirst() {
        int i = 0;
        while (i < 10) {
            Cat cat = new Cat();
            System.out.println(cat.toString());
            i++;
        }
    }

    private static void getSecond() {
        for (int i = 1; i <= 10; i++) {
            Cat cat = new Cat();
            cat.setName(cat.name);
            cat.setAge(cat.age);
            System.out.println("Котик №" + i + " с именем " + cat.getName() + " и ему " + cat.getAge());
        }
    }

    private static void getThird() {
        int count = 1;
        do {
            Cat cat = new Cat("Барсик", 6);
            count++;
            System.out.println(cat.toString());
        } while (count <= 10);
    }

    private static void getFour() {
        String[] nameArray = new String[]{"Барсик", "Шарик", "Буся", "Рыжик", "Хлебушек"};
        int[] ageArray = new int[]{7, 8, 5, 10, 16};

        for (int i = 0; i < nameArray.length; i++) {
            System.out.println("Котик №" + (i + 1) + " Его зовут: " + nameArray[i] + " ему " + ageArray[i] + " лет");

        }
    }
    public static void testingEquals(){
        Cat cat = new Cat();
        Cat cat1 = new Cat();
        cat.name = "Meow";
        cat1.name = "Meow";
        cat.age = 10;
        cat1.age = 10;
        System.out.println(cat.equals(cat1));
    }
    public static void getOpenSpace(){
        System.out.println("");
    }
}
