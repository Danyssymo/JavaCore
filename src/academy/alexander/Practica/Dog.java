package academy.alexander.Practica;

public class Dog extends Animal{


    public String name;
    public Integer age;


    public Dog(String food, String location, String name, Integer age) {
        super(food,location);
        this.name = name;
        this.age = age;
    }

    public void makeNoise(){
        System.out.println("Собака издает звук: Гаф-гаф ");
    }

    public void eat(){
        System.out.println("Собака ест: ");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", food='" + food + '\'' +
                ", location='" + location + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}


