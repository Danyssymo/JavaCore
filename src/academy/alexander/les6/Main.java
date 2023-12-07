package academy.alexander.les6;
public class Main
{
    public static void main(String[] args) {
        Phone phone = new Phone();
        Phone phone2 = new Phone(33,"Nokia", 50);
        Phone phone3 = new Phone(100, "Samsung");
        System.out.println(phone.model + " " + phone.number + " " + phone.weight);
        phone.receiveCall();
        phone.getNumber();
        phone.sendMessage(35,77,35,01);

        phone2.receiveCall("Вася", 999);
        phone2.getNumber();
        phone.sendMessage(01,10001);

        phone3.receiveCall("Олег", 666);
        phone3.getNumber();
        phone.sendMessage(91,1,665656,4234,8765,0012);
    }
}