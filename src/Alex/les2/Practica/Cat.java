package Alex.les2.Practica;

public class Cat extends Animal{
    public String poroda;
    public String color;
    public void makeNoise(){
        System.out.println("Кот издает звук: Мяу ");
    }

    public void eat(){
        System.out.println("Кот ест: ");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "poroda='" + poroda + '\'' +
                ", color='" + color + '\'' +
                ", food='" + food + '\'' +
                ", location='" + location + '\'' +
                '}';
    }

    public String getPoroda() {
        return poroda;
    }

    public void setPoroda(String poroda) {
        this.poroda = poroda;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
