package Alex.les2.Practica2;

public class Main {
    public static void main(String[] args) {
        Printable[] elements = new Printable[10];
        elements[0] = new Book("Книга");
        elements[1] = new Book("Книга2");
        elements[2] = new Book("Книга3");
        elements[3] = new Book("Книга4");
        elements[4] = new Book("Книга5");
        elements[5] = new Book("Книга6");
        elements[6] = new Magazine("Журнал");
        elements[7] = new Magazine("Журнал2");
        elements[8] = new Magazine("Журнал3");
        elements[9] = new Magazine("Журнал4");
        Printable book = new Book();
        Printable magazine = new Magazine();
        book.print(elements);
        magazine.print(elements);
    }
}
