package academy.olga.homework14.eight;

import java.util.ArrayList;
import java.util.List;


public class Bank {

    public Bank() {
    }

    private List<Customer> customers = new ArrayList();

    public void add(Customer customer) {
        customers.add(customer);
    }

    public void checkCardNumber(int min, int max) {
        for (int i = 0; i < customers.size(); i++) {
            if (customers.get(i).getCardNumber() > min && customers.get(i).getCardNumber() < max) {
                System.out.println(customers.get(i));
            }
        }
    }

    public boolean sortByName() {
        boolean check = false;
        for (int i = 0; i < customers.size(); i++) {
            Customer current = customers.get(i);
            int index = i;

            for (int j = i + 1; j < customers.size(); j++) {
                String name1 = current.getName();
                String name2 = customers.get(j).getName();
                if (name2.compareTo(name1) < 0) {
                    current = customers.get(j);
                    index = j;
                }
            }
            customers.set(index, customers.get(i));
            customers.set(i, current);
            check = true;

        }
        return check;
    }


    @Override
    public String toString() {
        return "Bank{" +
                "customers=" + customers +
                '}';
    }
}
