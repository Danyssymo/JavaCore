package Practica;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Doctor doctor = new Doctor();
        Animal[] animals = new Animal[3];
        Dog dog = new Dog("Косточки", "Будка","Бобик", 10);
        animals[0] = dog;
        Cat cat = new Cat();
        cat.setColor("Белый");
        cat.setPoroda("Сиамский");
        animals[1] = cat;
        Horse horse = new Horse();
        horse.setPodkova(4);
        horse.setWeight(1000);
        animals[2] = horse;
        cat.eat();
        System.out.println(Arrays.toString(animals));
        for (Animal animal : animals) {
          doctor.treatAnimal(animal);
        }
    }
}
