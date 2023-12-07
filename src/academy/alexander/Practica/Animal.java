package academy.alexander.Practica;

public class Animal {
    public String food;
    public String location;


    public void makeNoise() {
        System.out.println("Издает звук: ");
    }

    public void eat() {
        System.out.println("Такое-то животое ест: ");
    }

    public void sleep() {
        System.out.println("Такое-то животое спит: ");
    }

    public Animal(String food, String location) {
        this.food = food;
        this.location = location;
    }

    public Animal() {
    }

    @Override
    public String toString() {
        return "Animal{" +
                "food='" + food + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
