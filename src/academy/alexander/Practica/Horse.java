package academy.alexander.Practica;

public class Horse extends Animal{
    public Integer weight;
    public Integer podkova;
    public void makeNoise(){
        System.out.println("Лошадь издает звук: Иго-го");
    }

    public void eat(){
        System.out.println("Лошадка ест: ");
    }

    @Override
    public String toString() {
        return "Horse{" +
                "weight=" + weight +
                ", podkova=" + podkova +
                ", food='" + food + '\'' +
                ", location='" + location + '\'' +
                '}';
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Integer getPodkova() {
        return podkova;
    }

    public void setPodkova(Integer podkova) {
        this.podkova = podkova;
    }
}
