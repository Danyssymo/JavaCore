package academy.olga.homework14;

public class Cat {
    private String name;
    private int age;
    private int weight;

    public Cat() {
        name = "T";
        age = 0;
        weight = 0;
    }

    public Cat(String _name, int _age, int _weight) {
        name = _name;
        age = _age;
        weight = _weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String _name) {
        name = _name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int _age) {
        age = _age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int _weight) {
        weight = _weight;
    }
}

