package Alex.les2;
//todo
// 1+
// 2+
// 3+ 3.1+
// 4+
// 5+
// 6+
// 7+
// 8+

public class Zoo {
    public static String zoo = " ‘Македония’";
   public static char price = '%';
    public static Integer discount = 50;

    public static void main(String[] args) {
        String word = "Сегодня в пятницу";
        String hello = "Добро пожаловать в зоопарк";
        byte day = 25;

        Animal lion = new Animal();

        lion.setAge((byte) 6);
        lion.setWeight((byte)14);
        lion.setLenght(7f);
        lion.setSins((short)2015);
        lion.setHeight(1d);
        lion.setRow(12);
        lion.setNumber(1374);
        lion.setRow1((long)13);
        lion.setLow(4);
        lion.setTail(8);
        lion.setHead((short) 1);
        lion.setEar((float) 3);
        lion.setArea('C');
        lion.setYear('г');
        lion.setZlo(false);
        lion.setFood(false);
        String answer;
        String answer1;

        if(lion.getZlo()){
            answer = "злой";
        } else {
            answer = "добрый";
        }

        if(lion.getFood()){
            answer1 = "голодный";
        } else {
            answer1 = "сытый";
        }

        lion.setType("Леф");
        lion.setName("Петя");
        System.out.println("----------------------------------------------------------");
        System.out.println(hello + zoo);
        System.out.println(word + " " +day+ " " + "число");
        System.out.println("Скидка для всех " + discount + price);
        System.out.println("Наш главный экспонат - "+ lion.getType() + " " + lion.getName());
        System.out.println("Ему " + lion.getAge() + " " + "лет. Он живет у нас с " + lion.getSins() + lion.getYear());
        System.out.println("Он в ширину " + lion.getLenght() + " см, " + "с высотой " + lion.getHeight() + " м. и весит " + lion.getWeight() + " kg");
        System.out.println("Его хвостик " + lion.getTail() + " см, а уши " + lion.getEar() + " см");
        System.out.println("Льва можно увидеть в секции " + lion.getNumber() + lion.getArea());
        System.out.println("Его не стоит пугаться, у него всего " +lion.getHead() + " голова и "+ lion.getLow() + " лапки");
        System.out.println("У Пети " + lion.getRow() + " черных полос и " + lion.getRow1() + " рыжих");
        System.out.println(lion.getName() + " очень " + answer + " и очень " + answer1);
        System.out.println("----------------------------------------------------------");

    }
}