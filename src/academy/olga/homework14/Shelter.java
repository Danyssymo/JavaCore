package academy.olga.homework14;

import java.util.ArrayList;
import java.util.List;

public class Shelter {

    private List<Cat> cats = new ArrayList<Cat>();

    public Shelter() {
    }

    public void add(Cat cat) {
        cats.add(cat);
    }

    public boolean reserveCat(String nameCat) {
        boolean isReserveCatInShelter = false;
        for (int i = 0; i < cats.size(); i++) {
            if (nameCat.equals(cats.get(i).getName())) {
                isReserveCatInShelter = true;

                break;
            }
        }
        return isReserveCatInShelter;
    }

    public boolean deleteCat(String name) {
        int deleteIndex = -1;
        for (int i = 0; i < cats.size(); i++) {
            if (cats.get(i).getName().equals(name)) {
                deleteIndex = i;
                break;
            }
        }

        if (deleteIndex < 0) {
            return false;
        }
        if (!reserveCat(name)) {
            cats.remove(deleteIndex);
        }
        return true;
    }

    public void print() {
        for (int i = 0; i < cats.size(); i++) {
            System.out.println(cats.get(i).getName() + " - " + cats.get(i).getAge());
        }
    }

    public List<Cat> findOldCats() {
        int max = cats.get(0).getAge();

        List<Cat> results = new ArrayList<>();
        results.add(cats.get(0));

        for (int i = 0; i < cats.size(); i++) {
            if (cats.get(i).getAge() > max) {
                max = cats.get(i).getAge();
                results = new ArrayList<>();
                results.add(cats.get(i));
            } else if (cats.get(i).getAge() == max){
                results.add(cats.get(i));
            }
        }

        return results;
    }
}
