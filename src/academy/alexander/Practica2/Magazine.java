package academy.alexander.Practica2;

public class Magazine implements Printable{
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    @Override
    public void print(Printable[] printable) {
        printMagazines(printable);
    }
     public static void printMagazines(Printable[] printable){
         for (Printable p : printable) {
             if (p instanceof Magazine) {
                 System.out.println(((Magazine) p).getName());
             }
         }
     }

    public Magazine(String name) {
        this.name = name;
    }
    public Magazine(){}
}
