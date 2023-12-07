package academy.alexander.les6;
import java.util.Arrays;
public class Phone {
 public int number = 123456789;
 public String model = "Classic";
 public int weight = 100;
 public void receiveCall(){
  String name = "Олег";
  System.out.println("Звонит " + name);
 }
 public static void receiveCall(String name, int number){
  System.out.println("Звонит " + name + " " + number);
 }
 public void getNumber(){
  System.out.println(number);
 }
 public void sendMessage(int...number){
  System.out.println(Arrays.toString(number));
 }
 public Phone (int number, String model, int weight) {
   this(number, model);
   this.weight = weight;
 }
 public Phone (int number, String model) {
  this.number = number;
  this.model = model;
 }

 public Phone() {
 }
}