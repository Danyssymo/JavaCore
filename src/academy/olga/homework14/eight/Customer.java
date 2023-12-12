package academy.olga.homework14.eight;

public class Customer {
    private int id;
    private String surName;
    private String name;
    private String midleName;
    private String adres;
    private int cardNumber;
    private int bankAccount;

    public Customer(){

    }
    public Customer(int id, String surName, String name, String midleName, String adres, int cardNumber, int bankAccount) {
        this.id = id;
        this.surName = surName;
        this.name = name;
        this.midleName = midleName;
        this.adres = adres;
        this.cardNumber = cardNumber;
        this.bankAccount = bankAccount;
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

    public String getMidleName() {
        return midleName;
    }

    public void setMidleName(String midleName) {
        this.midleName = midleName;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
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
                ", midleName='" + midleName + '\'' +
                ", adres='" + adres + '\'' +
                ", cardNumber=" + cardNumber +
                ", bankAccount=" + bankAccount +
                '}';
    }
}
