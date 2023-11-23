package Practica2;

public class Book implements Printable{
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;
    @Override
    public void print(Printable[] printable) {
        printBooks(printable);
    }
    public static void printBooks(Printable[] printable){
        for (Printable p : printable) {
            if (p instanceof Book) {
                System.out.println(((Book) p).getName());
            }
        }
    }

    public Book(String name) {
        this.name = name;
    }
    public Book(){}
}
