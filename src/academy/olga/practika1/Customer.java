package academy.olga.practika1;

public class Customer implements Comparable<Customer>{
    private int id;
    private String surName;
    private String name;
    private String otchestvo;
    private int cardNumber;
    private int bankAccount;

    public Customer(int id, String surName, String name, String otchestvo, int cardNumber, int bankAccount) {
        this.id = id;
        this.surName = surName;
        this.name = name;
        this.otchestvo = otchestvo;
        this.cardNumber = cardNumber;
        this.bankAccount = bankAccount;
    }
    public Customer() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOtchestvo() {
        return otchestvo;
    }

    public void setOtchestvo(String otchestvo) {
        this.otchestvo = otchestvo;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public int getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(int bankAccount) {
        this.bankAccount = bankAccount;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", surName='" + surName + '\'' +
                ", name='" + name + '\'' +
                ", otchestvo='" + otchestvo + '\'' +
                ", cardNumber=" + cardNumber +
                ", bankAccount=" + bankAccount +
                '}';
    }
    @Override
    public int compareTo(Customer o) {
        return name.compareTo(o.name);
    }
}
