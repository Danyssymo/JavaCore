package academy.olga.practika1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static List<Customer> customers = new ArrayList<>();

    public static void main(String[] args) {
        Bank bank = new Bank();
        customers.add(bank.customer1);
        customers.add(bank.customer2);
        customers.add(bank.customer3);
        customers.add(bank.customer4);
        System.out.println(customers);
        checkCardNumber(1000, 2000);

    }

    public static void checkCardNumber(int min, int max) {
        for (int i = 0; i < customers.size(); i++) {
            if (customers.get(i).getCardNumber() > min && customers.get(i).getCardNumber() < max) {
                System.out.println(customers.get(i));
            }
        }
    }

    public static void sortByName() {
        Collections.sort(customers);
    }
}
